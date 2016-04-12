package fi.softala.tunnit.dao;

import java.sql.Types;
import java.util.Calendar;
import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import fi.softala.tunnit.bean.Kayttaja;
import fi.softala.tunnit.bean.Tulostus;
import fi.softala.tunnit.bean.Tunnit;


public class KayttajaDAOSpringJdbcImpl implements KayttajaDAO {

	@Inject
	public DataSource dataSource;
	public JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	 public JdbcTemplate getJdbctemplate() {
		return jdbcTemplate;
	} 

	public void lisaa(Tunnit tunnit){
		String sql = "select kayttaja_id from KAYTTAJAT where kayttajatunnus =(?);";
		String StrKayttajaId = (String)getJdbctemplate().queryForObject(sql, new Object[] {tunnit.getNimi() }, String.class);
		
		int kayttajaId = Integer.parseInt(StrKayttajaId);
		
		Calendar kalenteri = Calendar.getInstance();
		java.sql.Timestamp timestampObject = new java.sql.Timestamp(kalenteri.getTime().getTime());
		
		String sql2 = "insert into TUNNIT (tuntien_maara, paivamaara, kuvaus, kayttaja_id) values(?,?,?,?);";
		Object[] parametrit2 = new Object[] { tunnit.getTunnit(), timestampObject, tunnit.getKuvausVali(), kayttajaId};
		
		jdbcTemplate.update(sql2, parametrit2);
		
	}
	
	public void poista(Tunnit poistettava){
		Object[] poistettavaID = {poistettava};
		String deleteSql = "delete from TUNNIT where tunti_id =(?);";
		int[] types = {Types.BIGINT};
		
		int rows = jdbcTemplate.update(deleteSql, poistettavaID, types);
		System.out.println(rows + " row(s) deleted.");
	}
	
	public List<Tulostus> haeKaikki() {
		String sql = "select tunti_id,tuntien_maara,paivamaara,kuvaus,kayttaja_id from TUNNIT";
		RowMapper<Tulostus> mapper = new TulostusRowMapper();
		List<Tulostus> tulostus = jdbcTemplate.query(sql, mapper);
		
		return tulostus;
	}
	
	public void rekisteroi(Kayttaja kayttaja) {
        
        StandardPasswordEncoder spe = new StandardPasswordEncoder();    
        String salasanaKryptattuna = spe.encode(kayttaja.getSalasana());
        
        String sql = "insert into KAYTTAJA (kayttajatunnus, email, etunimi, sukunumi, salasana) values(?,?,?,?,?);";
        Object[] parametrit = new Object[] { kayttaja.getKayttajatunnus(), kayttaja.getEmail(), kayttaja.getEtunimi(), kayttaja.getSukunimi(), salasanaKryptattuna};
        
        jdbcTemplate.update(sql, parametrit);
    }
}