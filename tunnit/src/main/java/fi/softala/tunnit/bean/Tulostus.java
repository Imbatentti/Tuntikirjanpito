package fi.softala.tunnit.bean;

public class Tulostus {

	int tuntiId, kayttajaId;
	String kuvaus, pvm;
	double tuntiMaara;
	public Tulostus() {
		super();
	}
	public Tulostus(int tuntiId, int kayttajaId, String kuvaus,
			double tuntiMaara) {
		super();
		this.tuntiId = tuntiId;
		this.kayttajaId = kayttajaId;
		this.kuvaus = kuvaus;
		this.tuntiMaara = tuntiMaara;
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
	
	
	@Override
	public String toString() {
		return "Tulostus [tuntiId=" + tuntiId + ", kayttajaId=" + kayttajaId
				+ ", kuvaus=" + kuvaus + ", tuntiMaara=" + tuntiMaara + "]";
	}
	
	
	
	
}
