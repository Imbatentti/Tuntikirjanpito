package fi.softala.tunnit.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fi.softala.tunnit.bean.KayttajaTulostus;
import fi.softala.tunnit.bean.Projektisumma;
import fi.softala.tunnit.bean.Tulostus;
import fi.softala.tunnit.bean.Tunnit;
import fi.softala.tunnit.dao.KayttajaDAO;

@Controller
@RequestMapping(value = "/nayta")
public class TulostusController {

	@Inject
	private KayttajaDAO dao;

	public KayttajaDAO getDao() {
		return dao;
	}

	public void setDao(KayttajaDAO dao) {
		this.dao = dao;
	}
	
	//KÄYTTÄJÄN TUNTIEN TULOSTUS
	@RequestMapping(value="kayttajaTulostus", method=RequestMethod.GET)
	public String getKayttajatulostus(Model model) {
		List<Projektisumma> kayttajatunnit = dao.haeKayttajaSumma();
		List<Tulostus> tulostus = dao.haeKayttajanTunnit();
		model.addAttribute("kayttajatunnit", kayttajatunnit);
		model.addAttribute("tulostus", tulostus);

		return "/sisalto/kayttajaTulostus";
	}
	
	// KAIKKIEN TUNTIEN TULOSTUS
	@RequestMapping(value="tulostus", method=RequestMethod.GET)
	public String getTulostus(Model model) {
		List<Tulostus> tulostus = dao.haeKaikki();
		List<Projektisumma> projektiSumma =dao.haeProjektiSumma();
		List<KayttajaTulostus> kayttajatulostus = dao.haeKayttajat();
		model.addAttribute("kayttajatulostus", kayttajatulostus);
		model.addAttribute("tulostus", tulostus);
		model.addAttribute("projektiSumma", projektiSumma);

		return "/sisalto/tulostus";

	}
	
	//TUNNIN POISTO
	@RequestMapping(value="poisto", method=RequestMethod.POST)
	public String removeAd(@RequestParam("poistettava") Tunnit poistettava) {
		System.out.println(poistettava);
		dao.poista(poistettava);
		
		return "redirect:/tulostus";
	}
	/*
	// TUNTIEN TULOSTUS
	@RequestMapping(value="kayttajaTulostus", method=RequestMethod.GET)
	public String getKayttajaTulostus(Model model) {
		List<Tulostus> kayttajaTulostus = dao.haeKaikkiYht();
		model.addAttribute("kayttajaTulostus", kayttajaTulostus);

		return "/sisalto/kayttajaTulostus";

	}*/
	
}
