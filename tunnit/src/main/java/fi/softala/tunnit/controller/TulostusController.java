package fi.softala.tunnit.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	//KÄYTTÄJÄN TUNTIEN TULOSTUS WIP
	@RequestMapping(value="kayttaja", method=RequestMethod.GET)
	public String getKayttajatulostus(Model model) {
		List<Projektisumma> kayttajatunnit = dao.haeKayttajaSumma();
		model.addAttribute("kayttajatunnit", kayttajatunnit);

		return "/sisalto/tulostus";

	}
	
	// KAIKKIEN TUNTIEN TULOSTUS
	@RequestMapping(value="tulostus", method=RequestMethod.GET)
	public String getTulostus(Model model) {
		List<Tulostus> tulostus = dao.haeKaikki();
		List<Projektisumma> projektiSumma =dao.haeProjektiSumma();
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
		
	
}
