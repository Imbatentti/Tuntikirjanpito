package fi.softala.tunnit.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import fi.softala.tunnit.bean.Tunnit;
import fi.softala.tunnit.dao.KayttajaDAO;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping (value="/sisalto")
public class KayttajaController {

	@Inject
	private KayttajaDAO dao;
	
	public KayttajaDAO getDao(){
		return dao;
	}
	
	public void setDao(KayttajaDAO dao){
		this.dao = dao;
	}
	
	//FORMIN TEKEMINEN
	@RequestMapping(value="uusitunti", method=RequestMethod.GET)
	public String getCreateForm(Model model){
		Tunnit uudetTunnit =  new Tunnit();
		
		System.out.println("KayttajaController");
		model.addAttribute("tunnit", uudetTunnit);
		return "sisalto/lomake";
	}
	
	//FORMIN VASTAANOTTO
	@RequestMapping(value="uusitunti", method=RequestMethod.POST)
	public String create( @ModelAttribute(value="tunnit") Tunnit tunnit) {
		dao.lisaa(tunnit);
		return "redirect:uusitunti";
	}

}
