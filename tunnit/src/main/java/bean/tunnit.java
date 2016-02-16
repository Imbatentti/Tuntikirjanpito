package bean;

public class Tunnit {

	//Raikka
	private double tuntimaara;
	private String paivamaara;
	private String kuvaus;
	private String kayttajaid;

	public Tunnit(double tuntimaara, String paivamaara, String kuvaus, String kayttajaid) {
		this.tuntimaara = tuntimaara;
		this.kuvaus = kuvaus;
		this.paivamaara = paivamaara;
		this.kayttajaid = kayttajaid;
	}

	public Tunnit() {
		tuntimaara = 0;
		paivamaara = null;
		kuvaus = null;
		kayttajaid = null;
	}

	public String getKayttajaid() {
		return kayttajaid;
	}

	public void setKayttajaid(String kayttajaid) {
		this.kayttajaid = kayttajaid;
	}

	public String getPaivamaara() {
		return paivamaara;
	}

	public void setPaivamaara(String paivamaara) {
		this.paivamaara = paivamaara;
	}

	public double getTuntimaara() {
		return tuntimaara;
	}

	public void setTuntimaara(double tuntimaara) {
		this.tuntimaara = tuntimaara;
	}

	public String getKuvaus() {
		return kuvaus;
	}

	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}

}