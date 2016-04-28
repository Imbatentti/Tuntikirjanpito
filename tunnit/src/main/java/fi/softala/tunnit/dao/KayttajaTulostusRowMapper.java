package fi.softala.tunnit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.softala.tunnit.bean.KayttajaTulostus;

public class KayttajaTulostusRowMapper implements RowMapper<KayttajaTulostus> {
	
	public KayttajaTulostus mapRow(ResultSet rs, int rowNum) throws SQLException{
		KayttajaTulostus kt = new KayttajaTulostus();
		kt.setKayttajatunnus(kt.getString("kayttajatunnus"));
		//kt.setKayttajatunnus(kt.getString("kayttajatunnus"));
		
		return kt;
	}

}
