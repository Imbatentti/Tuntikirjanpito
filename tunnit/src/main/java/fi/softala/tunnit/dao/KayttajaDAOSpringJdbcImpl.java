package fi.softala.tunnit.dao;

import java.util.Calendar;
import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

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
		System.out.println("POISTO PYYNTO PERILLA");
		Object[] poistettavaID = {poistettava};
		String sql = "delete from TUNNIT where tunti_id = ?;";
		int rows = jdbcTemplate.update(sql, poistettavaID);
		System.out.println(rows + " row(s) deleted.");
	}
	
	public List<Tulostus> haeKaikki() {
		String sql = "select * from TUNNIT";
		RowMapper<Tulostus> mapper = new TulostusRowMapper();
		List<Tulostus> tulostus = jdbcTemplate.query(sql, mapper);
		
		return tulostus;
	}
}