package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class KayttajaDAO {
	static Connection yhteys = null;

	public static Connection avaaYhteys() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException, SQLException {
		
		Class.forName(DBConnectionProperties.getInstance().getProperty("driver")).newInstance();
		//haetaan tiedot .properties tiedostosta
		yhteys = DriverManager.getConnection(
				DBConnectionProperties.getInstance().getProperty("url"), 
				DBConnectionProperties.getInstance().getProperty("username"),
				DBConnectionProperties.getInstance().getProperty("password"));
		

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
	
	

}
