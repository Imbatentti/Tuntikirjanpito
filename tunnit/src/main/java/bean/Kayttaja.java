package bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Kayttaja {

	@NotNull
	@Size(max = 27)
	private String kayttajatunnus;

	private String kayttajaId;

	public Kayttaja(String kayttajatunnus, String kayttajaId) {
		this.kayttajatunnus = kayttajatunnus;
		this.kayttajaId = kayttajaId;
	}

	public Kayttaja() {
		kayttajatunnus = null;
		kayttajaId = null;
	}

	public String getKayttajatunnus() {
		return kayttajatunnus;
	}

	public void setKayttajatunnus(String kayttajatunnus) {
		this.kayttajatunnus = kayttajatunnus;
	}

	public String getKayttajaId() {
		return kayttajaId;
	}

	public void setKayttajaId(String kayttajaId) {
		this.kayttajaId = kayttajaId;
	}

}
