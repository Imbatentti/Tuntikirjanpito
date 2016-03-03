package bean;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.DecimalMax;


public class SyoteVali {
	
	@Size(max = 100)
	@NotNull
	private String nimi;
	
	@NotNull
	@DecimalMax(value = "1000")
	private double tunnit;
	
	@Size(max = 1000)
	private String kuvausVali;
	
	public SyoteVali(String nimi, double tunnit, String kuvausVali) {
		this.nimi = nimi;
		this.tunnit = tunnit;
		this.kuvausVali = kuvausVali;
	}
	
	public SyoteVali(){
		nimi = null;
		tunnit =0;
		kuvausVali = null;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public double getTunnit() {
		return tunnit;
	}

	public void setTunnit(double tunnit) {
		this.tunnit = tunnit;
	}

	public String getKuvausVali() {
		return kuvausVali;
	}

	public void setKuvausVali(String kuvausVali) {
		this.kuvausVali = kuvausVali;
	}
	
}
