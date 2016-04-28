package fi.softala.tunnit.bean;

public class KayttajaTulostus {
	
	String kayttajatunnus;
	
	public KayttajaTulostus(){
		super();
	}

	public KayttajaTulostus(String kayttajatunnus) {
		this.kayttajatunnus = kayttajatunnus;
	}

	public String getKayttajatunnus() {
		return kayttajatunnus;
	}

	public void setKayttajatunnus(String kayttajatunnus) {
		this.kayttajatunnus = kayttajatunnus;
	}

	@Override
	public String toString() {
		return "KayttajaTulostus [kayttajatunnus=" + kayttajatunnus + "]";
	}

	
	
}
