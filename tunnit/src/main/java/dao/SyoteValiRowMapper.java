package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import bean.SyoteVali;

public class SyoteValiRowMapper implements RowMapper<SyoteVali> {

	public SyoteVali mapRow(ResultSet rs, int rowNum) throws SQLException {
		SyoteVali sv = new SyoteVali();
		sv.setKuvausVali(rs.getString("kuvaus"));
		sv.setNimi(rs.getString("kayttajatunnus"));
		sv.setTunnit(rs.getInt("tunnit"));
		
		return sv;
		
	}
	
}
