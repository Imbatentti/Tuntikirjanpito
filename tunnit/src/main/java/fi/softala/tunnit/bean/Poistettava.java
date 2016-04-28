package fi.softala.tunnit.bean;

public class Poistettava {

	String poistoId;

	public Poistettava() {
		super();
	}

	public Poistettava(String poistoId) {
		super();
		this.poistoId = poistoId;
	}

	public String getPoistoId() {
		return poistoId;
	}

	public void setPoistoId(String poistoId) {
		this.poistoId = poistoId;
	}

	@Override
	public String toString() {
		return "Poistettava [poistoId=" + poistoId + "]";
	}
	
	
	
	
	
}
