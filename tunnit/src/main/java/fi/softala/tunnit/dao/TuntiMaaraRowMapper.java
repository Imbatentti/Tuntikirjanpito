package fi.softala.tunnit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.softala.tunnit.bean.Projektisumma;

public class TuntiMaaraRowMapper implements RowMapper<Projektisumma> {

	public Projektisumma mapRow(ResultSet rs, int rowNum) throws SQLException {
		Projektisumma ps = new Projektisumma();
		ps.setKaikkiTunnit(rs.getInt("SUM(tuntien_maara)"));
		

		return ps;
	}
}
