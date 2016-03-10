package fi.softala.tunnit.dao;

import java.util.List;

import fi.softala.tunnit.bean.Tulostus;
import fi.softala.tunnit.bean.Tunnit;

public interface KayttajaDAO {
	
	public abstract void lisaa(Tunnit tunnit);
	
	public abstract List<Tulostus> haeKaikki();
	
}
	
	/*
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

}*/
