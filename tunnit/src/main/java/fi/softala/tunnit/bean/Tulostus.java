package fi.softala.tunnit.bean;

public class Tulostus {

	int tuntiId;
	int kayttajaId;
	String kuvaus;
	String pvm;
	String kayttajatunnus;
	double tuntiMaara;

	public Tulostus() {
		super();
	}

	public Tulostus(int tuntiId, int kayttajaId, String kuvaus,
			String kayttajatunnus, double tuntiMaara) {
		super();
		this.tuntiId = tuntiId;
		this.kayttajaId = kayttajaId;
		this.kuvaus = kuvaus;
		this.tuntiMaara = tuntiMaara;
		this.kayttajatunnus = kayttajatunnus;
	}

	public Tulostus(String pvm) {
		super();
		this.pvm = pvm;
	}

	public String getPvm() {
		return pvm;
	}

	public void setPvm(String pvm) {
		this.pvm = pvm;
	}

	public int getTuntiId() {
		return tuntiId;
	}

	public void setTuntiId(int tuntiId) {
		this.tuntiId = tuntiId;
	}

	public int getKayttajaId() {
		return kayttajaId;
	}

	public void setKayttajaId(int kayttajaId) {
		this.kayttajaId = kayttajaId;
	}

	public String getKuvaus() {
		return kuvaus;
	}

	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}

	public double getTuntiMaara() {
		return tuntiMaara;
	}

	public void setTuntiMaara(double tuntiMaara) {
		this.tuntiMaara = tuntiMaara;
	}

	public String getKayttajatunnus() {
		return kayttajatunnus;
	}

	public void setKayttajatunnus(String kayttajatunnus) {
		this.kayttajatunnus = kayttajatunnus;
	}

	@Override
	public String toString() {
		return "Tulostus [tuntiId=" + tuntiId + ", kayttajaId=" + kayttajaId
				+ ", kuvaus=" + kuvaus + ", pvm=" + pvm + ", kayttajatunnus="
				+ kayttajatunnus + ", tuntiMaara=" + tuntiMaara + "]";
	}

}
