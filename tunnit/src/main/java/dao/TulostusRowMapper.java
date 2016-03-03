package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.net.ntp.TimeStamp;
import org.springframework.jdbc.core.RowMapper;

import bean.Tulostus;

public class TulostusRowMapper implements RowMapper<Tulostus> {

	public Tulostus mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tulostus tulostus = new Tulostus();
		tulostus.setKayttajaId(rs.getInt("kayttaja_id"));
		tulostus.setKuvaus(rs.getString("kuvaus"));
		tulostus.setTuntiId(rs.getInt("tunti_id"));
		tulostus.setTuntiMaara(rs.getDouble("tuntien_maara"));
		//tulostus.setPvm(rs.getTimestamp("paivamaara"));
		java.sql.Timestamp timestampObject = rs.getTimestamp("paivamaara");
		String paivamaara = TimeStamp.toString(timestampObject);
		return tulostus;
	}
	
}
