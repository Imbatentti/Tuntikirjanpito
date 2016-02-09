package bean;

public class Kayttaja {

	private String kayttajatunnus;
	private String kayttajaId;

	public Kayttaja(String kayttajatunnus, String kayttajaId) {
		this.kayttajatunnus = kayttajatunnus;
		this.kayttajaId = kayttajaId;
	}

	public Kayttaja() {
		kayttajatunnus = null;
		kayttajaId = null;
	}

	public String getKayttajatunnus() {
		return kayttajatunnus;
	}

	public void setKayttajatunnus(String kayttajatunnus) {
		this.kayttajatunnus = kayttajatunnus;
	}

	public String getKayttajaId() {
		return kayttajaId;
	}

	public void setKayttajaId(String kayttajaId) {
		this.kayttajaId = kayttajaId;
	}

}
