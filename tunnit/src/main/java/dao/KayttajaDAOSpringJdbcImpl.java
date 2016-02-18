package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import bean.SyoteVali;


public class KayttajaDAOSpringJdbcImpl implements KayttajaDAO {

	private JdbcTemplate jdbctemplate;
	
	
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	public void lisaa(SyoteVali syotettavatTunnit){
		String sql = "select kayttaja_id from KAYTTAJAT where kayttajatunnus =(?);";
		Object[] parametrit = new Object[] {syotettavatTunnit.getNimi() };
		
		jdbctemplate.update(sql, parametrit);
		
		String sql2 = "insert into TUNNIT (tuntien_maara, kuvaus, kayttaja_id, pvm) values(?,?,?,NOW());";
		Object[] parametrit2 = new Object[] { syotettavatTunnit.getTunnit(), syotettavatTunnit.getKuvausVali(), parametrit.clone() };
		
		jdbctemplate.update(sql2, parametrit2);
		
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