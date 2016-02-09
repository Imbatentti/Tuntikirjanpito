package bean;

public class Kayttaja {

	private String kayttajatunnus;

	public Kayttaja(String kayttajatunnus) {
		this.kayttajatunnus = kayttajatunnus;
	}

	public Kayttaja() {
		kayttajatunnus = null;
	}

	public String getKayttajatunnus() {
		return kayttajatunnus;
	}

	public void setKayttajatunnus(String kayttajatunnus) {
		this.kayttajatunnus = kayttajatunnus;
	}

}
