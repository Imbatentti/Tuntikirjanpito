package fi.softala.tunnit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping (value="/")
@SessionAttributes("j_username")
public class LoginController {
	
	
	@RequestMapping(value="/loginpage", method = RequestMethod.GET)
	public String login(Model model) {
		System.out.println("login");
		return "login";
 
	}
	
	@RequestMapping(value="/loginfail", method = RequestMethod.GET)
	public String loginerror(Model model) {
		System.out.println("loginfail");
		model.addAttribute("loginerror", "true");
		return "Login";
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(Model model) {

		model.addAttribute("loggedout", "true");
		return "Login";
 
	}
	
	
	
}
