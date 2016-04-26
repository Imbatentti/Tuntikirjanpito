package fi.softala.tunnit.dao;

import java.util.List;

import fi.softala.tunnit.bean.Kayttaja;
import fi.softala.tunnit.bean.Tulostus;
import fi.softala.tunnit.bean.Tunnit;

public interface KayttajaDAO {
	
	public abstract void lisaa(Tunnit tunnit);
	
	public abstract List<Tulostus> haeKaikki();

	public abstract void poista(Tunnit poistettava);
	
	public abstract void rekisteroi(Kayttaja kayttaja);

	public abstract List<Tulostus> haeKaikkiYht();
	
}