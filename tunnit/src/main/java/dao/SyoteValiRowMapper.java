package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import bean.Tunnit;

public class SyoteValiRowMapper implements RowMapper<Tunnit> {

	public Tunnit mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tunnit sv = new Tunnit();
		sv.setKuvausVali(rs.getString("kuvaus"));
		sv.setNimi(rs.getString("kayttajatunnus"));
		sv.setTunnit(rs.getInt("tunnit"));
		rs.getDate("pvm");
		
		return sv;
		
	}
	
}
