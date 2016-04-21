package fi.softala.tunnit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import fi.softala.tunnit.bean.Tulostus;

public class TulostusRowMapper implements RowMapper<Tulostus> {

	public Tulostus mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tulostus tulostus = new Tulostus();
		tulostus.setKayttajaId(rs.getInt("kayttaja_id"));
		tulostus.setKuvaus(rs.getString("kuvaus"));
		tulostus.setTuntiId(rs.getInt("tunti_id"));
		tulostus.setTuntiMaara(rs.getDouble("tuntien_maara"));
		tulostus.setKayttajatunnus(rs.getString("kayttajatunnus"));
		
		//formatoidaan sql timestamp stringiin
		java.sql.Timestamp timestampObject = rs.getTimestamp("paivamaara");
		if (timestampObject != null) {
			String paivamaara = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(timestampObject);
			tulostus.setPvm(paivamaara);
		}
		
		return tulostus;
	}
	
}
