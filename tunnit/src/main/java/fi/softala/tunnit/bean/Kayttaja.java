package fi.softala.tunnit.bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class Kayttaja {

    @NotNull
    @Size(max = 27)
    private String kayttajatunnus;
    
    private String kayttajaId;

    private String salasana;

    @Size(min = 1, max = 255)
    private String etunimi;

    @Size(min = 1, max = 255)
    private String sukunimi;

    @Size(min = 1, max = 255)
    @Email
    private String email;

    public Kayttaja(String kayttajatunnus, String kayttajaId, String salasana,
            String etunimi, String sukunimi, String email) {
        super();
        this.kayttajatunnus = kayttajatunnus;
        this.kayttajaId = kayttajaId;
        this.salasana = salasana;
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.email = email;
    }

    public Kayttaja() {
        super();
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

    public String getSalasana() {
        return salasana;
    }

    public void setSalasana(String salasana) {
        this.salasana = salasana;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}