package bean;

public class Tunnit {

	//Raikka
	private double tuntimaara;
	private String kuvaus;

	public Tunnit(double tuntimaara, String kuvaus) {
		this.tuntimaara = tuntimaara;
		this.kuvaus = kuvaus;
	}

	public Tunnit() {
		tuntimaara = 0;
		kuvaus = null;
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