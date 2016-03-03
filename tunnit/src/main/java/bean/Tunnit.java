package bean;

//import java.util.Calendar;
//import java.util.Date;

public class Tunnit {

	private double tuntimaara;
	private String kuvaus;
	//private Date paiva;
	//private Calendar paiva;
	

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
}

