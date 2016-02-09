package bean;

public class Tunnit {

	private double tuntimaara;
	private String kuvaus;
	private String tunnitKayttajaId;

	public Tunnit(double tuntimaara, String kuvaus, String tunnitKayttajaId) {
		this.tuntimaara = tuntimaara;
		this.kuvaus = kuvaus;
		this.tunnitKayttajaId = tunnitKayttajaId;
	}

	public Tunnit() {
		tuntimaara = 0;
		kuvaus = null;
		tunnitKayttajaId = null;
		
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

	public String getTunnitKayttajaId() {
		return tunnitKayttajaId;
	}

	public void setTunnitKayttajaId(String tunnitKayttajaId) {
		this.tunnitKayttajaId = tunnitKayttajaId;
	}

}
