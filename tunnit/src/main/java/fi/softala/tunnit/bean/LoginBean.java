package fi.softala.tunnit.bean;

public class LoginBean {

	String kayttajatunnus = "";
	String salasana = "";
	public LoginBean() {
		super();
	}
	public LoginBean(String kayttajatunnus, String salasana) {
		super();
		this.kayttajatunnus = kayttajatunnus;
		this.salasana = salasana;
	}
	public String getKayttajatunnus() {
		return kayttajatunnus;
	}
	public void setKayttajatunnus(String kayttajatunnus) {
		this.kayttajatunnus = kayttajatunnus;
	}
	public String getSalasana() {
		return salasana;
	}
	public void setSalasana(String salasana) {
		this.salasana = salasana;
	}
	@Override
	public String toString() {
		return "LoginBean [kayttajatunnus=" + kayttajatunnus + ", salasana="
				+ salasana + "]";
	}
	
	
	
}
