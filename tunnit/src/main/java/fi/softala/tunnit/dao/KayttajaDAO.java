package fi.softala.tunnit.dao;

import java.util.List;

import fi.softala.tunnit.bean.Kayttaja;

import fi.softala.tunnit.bean.KayttajaTulostus;
import fi.softala.tunnit.bean.Projektisumma;
import fi.softala.tunnit.bean.Poistettava;

import fi.softala.tunnit.bean.Tulostus;
import fi.softala.tunnit.bean.Tunnit;

public interface KayttajaDAO {
	
	public abstract void lisaa(Tunnit tunnit);
	
	public abstract List<Tulostus> haeKaikki();
	
	public abstract List<Tulostus> haeKayttajanTunnit(String kayttajatunnus);
	
	public abstract List<Projektisumma> haeProjektiSumma();
	
	public abstract List<Projektisumma> haeKayttajaSumma(String kayttajatunnus);

	public abstract void poista(Poistettava poistoId);
	
	public abstract List<KayttajaTulostus> haeKayttajat();
	
	public abstract void rekisteroi(Kayttaja kayttaja);

	
}