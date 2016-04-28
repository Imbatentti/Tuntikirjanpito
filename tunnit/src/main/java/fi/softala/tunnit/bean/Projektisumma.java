package fi.softala.tunnit.bean;

public class Projektisumma {

	double kaikkiTunnit;

	public Projektisumma() {
		super();
	}

	public Projektisumma(double kaikkiTunnit) {
		this.kaikkiTunnit = kaikkiTunnit;
	}

	

	public double getKaikkiTunnit() {
		return kaikkiTunnit;
	}

	public void setKaikkiTunnit(double kaikkiTunnit) {
		this.kaikkiTunnit = kaikkiTunnit;
	}

	@Override
	public String toString() {
		return "Projektisumma [kaikkiTunnit=" + kaikkiTunnit + "]";
	}

}
