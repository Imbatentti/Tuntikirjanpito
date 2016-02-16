package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Tunnit;

public class TuntiDAO {
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
			// JOTAIN VIRHETTÄ TAPAHTUI
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
					.println("Tietokantayhteys ei jostain syystä suostu menemään kiinni.");
		}
	}

	public List<Tunnit> haeKaikki() throws SQLException,
			InstantiationException, IllegalAccessException,
			ClassNotFoundException, IOException {
		System.out.println("krpl");
		Connection yhteys = avaaYhteys();
		ArrayList<Tunnit> tunnit = new ArrayList<Tunnit>();
		try {
			String sql = "SELECT tuntien_maara, paivamaara, kuvaus, kayttaja_id FROM TUNNIT;";
			Statement haku = yhteys.createStatement();
			ResultSet tulokset = haku.executeQuery(sql);

			while (tulokset.next()) {
				double tuntimaara = tulokset.getDouble("tuntien_maara");
				String paivamaara = tulokset.getString("paivamaara");
				String kuvaus = tulokset.getString("kuvaus");
				String kayttajaid = tulokset.getString("kayttaja_id");

				Tunnit t = new Tunnit(tuntimaara, paivamaara, kuvaus, kayttajaid);
				tunnit.add(t);
			}
		} finally {
			suljeYhteys();
		}

		return tunnit;

	}
}
