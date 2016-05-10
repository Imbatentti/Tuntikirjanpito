package fi.softala.tunnit.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import fi.softala.tunnit.bean.KayttajaTulostus;
import fi.softala.tunnit.bean.Projektisumma;
import fi.softala.tunnit.bean.Poistettava;
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
	
	//K�YTT�JIEN TULOSTUS
	@RequestMapping(value="kayttajaTulostus", method=RequestMethod.GET)
	public String getKayttajatulostus(Model model) {
		//List<Projektisumma> kayttajatunnit = dao.haeKayttajaSumma();

		//List<Tulostus> tulostus = dao.haeKayttajanTunnit();
		System.out.println("haeKayttajat");
		List<KayttajaTulostus> kayttajatulostus = dao.haeKayttajat();
		model.addAttribute("kayttajatulostus", kayttajatulostus);
		//model.addAttribute("kayttajatunnit", kayttajatunnit);
		//model.addAttribute("tulostus", tulostus);

		return "/sisalto/kayttajaTulostus";
	}
	
	//K�YTT�J�N VALITSEMINEN
	@RequestMapping(value="tulostusLista", method=RequestMethod.POST)
	public String getTulostus( @ModelAttribute(value="kayttaja") KayttajaTulostus kayttaja, Model model){
		String kayttajatunnus = kayttaja.getKayttajatunnus();
		List<Tulostus> tulostus = dao.haeKayttajanTunnit(kayttajatunnus); //sis�lt�, my�s DAOT
		List<Projektisumma> kayttajasumma = dao.haeKayttajaSumma(kayttajatunnus);
		model.addAttribute("kayttajasumma", kayttajasumma);
		model.addAttribute("tulostus", tulostus);
		return "/sisalto/kayttajaTulostus";
	}
	//VALITUN K�YTT�J�N TUNNIT
		@RequestMapping(value="tulostusLista", method=RequestMethod.GET)
		public String getKayttajaTulostus(@ModelAttribute(value="tulostus") List<Tulostus> tulostus,
				@ModelAttribute(value="kayttajasumma") Projektisumma kayttajasumma, Model model){
			System.out.println("kayttajatulostuscontrol");
			model.addAttribute("kayttajasumma",kayttajasumma);
			model.addAttribute("tulostus", tulostus);
			
			return "/sisalto/kayttajaTulostus";
		}
	
	
	
	// KAIKKIEN TUNTIEN TULOSTUS
	@RequestMapping(value="tulostus", method=RequestMethod.GET)
	public String getTulostus(Model model) {
		List<Tulostus> tulostus = dao.haeKaikki();
		List<Projektisumma> projektiSumma =dao.haeProjektiSumma();
		List<KayttajaTulostus> kayttajatulostus = dao.haeKayttajat();
		model.addAttribute("tulostus", tulostus);
		model.addAttribute("projektiSumma", projektiSumma);
		model.addAttribute("kayttajatulostus", kayttajatulostus);

		return "/sisalto/tulostus";
	}
	
	//TUNNIN POISTO
	@RequestMapping(value="poista", method=RequestMethod.POST)
	public String removeAd(@ModelAttribute(value="poistoId") Poistettava poistoId) {
		System.out.println("tulostus controllerissa");
		System.out.println(poistoId);
		
		dao.poista(poistoId);
		
		return "redirect:tulostus";
	}
}
