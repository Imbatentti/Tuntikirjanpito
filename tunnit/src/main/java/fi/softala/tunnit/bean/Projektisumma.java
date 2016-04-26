package fi.softala.tunnit.bean;

public class Projektisumma {
	static int kaikkiTunnit;
	
	public Projektisumma() {
		super();
	}
	
	public Projektisumma(int kaikkiTunnit){
		this.kaikkiTunnit = kaikkiTunnit;
	}

	public static int getKaikkiTunnit() {
		return kaikkiTunnit;
	}

	public void setKaikkiTunnit(int kaikkiTunnit) {
		this.kaikkiTunnit = kaikkiTunnit;
	}

	@Override
	public String toString() {
		return "Projektisumma [kaikkiTunnit=" + kaikkiTunnit + "]";
	}
	
	

}
