package fi.softala.tunnit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping (value="/kirjaudu")
public class LoginController {

	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(Model model) {
		System.out.println("login");
		return "login";
	}

	@RequestMapping(value="/loginfail", method = RequestMethod.GET)
	public String loginerror(Model model) {
		
		model.addAttribute("loginerror", "true");
		return "login";
	}
	
}
