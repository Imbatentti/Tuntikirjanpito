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
	
	public List<Tulostus> haeKaikki() {
		String sql = "select * from TUNNIT";
		RowMapper<Tulostus> mapper = new TulostusRowMapper();
		List<Tulostus> tulostus = jdbcTemplate.query(sql, mapper);
		
		return tulostus;
	}
	
}
/*
String sql1 = "select kayttaja_id from KAYTTAJAT where kayttajatunnus =(?);";
PreparedStatement lause1 = yhteys.prepareStatement(sql1);
lause1.setString(1, ktunnus);
ResultSet rs = lause1.executeQuery();

while (rs.next()){
	id = rs.getInt("kayttaja_id");

	String sql2 = "insert into TUNNIT (tuntien_maara, kuvaus, kayttaja_id) values(?,?,?);";
	PreparedStatement lause2 = yhteys.prepareStatement(sql2);
	lause2.setDouble(1, tunnit);
	lause2.setString(2, kuvaus);
	lause2.setInt(3, id);
	lause2.executeUpdate(); */