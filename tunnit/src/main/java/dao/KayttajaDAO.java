package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import bean.SyoteVali;

public class KayttajaDAO {
	static Connection yhteys = null;

	public static Connection avaaYhteys() throws InstantiationException,
			IllegalAccessException, ClassNotFoundException, IOException,
			SQLException {

		Class.forName(
				DBConnectionProperties.getInstance().getProperty("driver"))
				.newInstance();
		// haetaan tiedot .properties tiedostosta
		yhteys = DriverManager.getConnection(DBConnectionProperties
				.getInstance().getProperty("url"), DBConnectionProperties
				.getInstance().getProperty("username"), DBConnectionProperties
				.getInstance().getProperty("password"));

		try {
			// YHTEYDEN AVAUS
			// ajurin lataus
			Class.forName("org.mariadb.jdbc.Driver").newInstance();
			// avataan yhteys

		} catch (Exception e) {
			// JOTAIN VIRHETT� TAPAHTUI
			e.printStackTrace();
			System.out.println("Tietokantahaku aiheutti virheen");
		}
		return yhteys;
	}

	public static void suljeYhteys() {
		try {
			if (yhteys != null && !yhteys.isClosed())
				yhteys.close();
		} catch (Exception e) {
			System.out
					.println("Tietokantayhteys ei jostain syyst� suostu menem��n kiinni.");
		}
	}

	public void lisaa(SyoteVali syotettavatTunnit)
			throws InstantiationException, IllegalAccessException,
			ClassNotFoundException, IOException, SQLException {

		String ktunnus = syotettavatTunnit.getNimi();
		double tunnit = syotettavatTunnit.getTunnit();
		String kuvaus = syotettavatTunnit.getKuvausVali();
		
		
		try {
			Connection yhteys = avaaYhteys();

			int id;
			
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
				lause2.executeUpdate();
			}

		} 
		finally {
			System.out.println("finally, YEAAA");
			suljeYhteys();
		}

	}

}
