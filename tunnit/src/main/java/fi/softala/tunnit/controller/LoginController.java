package fi.softala.tunnit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping (value="/")
public class LoginController {

	@RequestMapping(value="/Login", method = RequestMethod.GET)
	public String login(Model model) {
		System.out.println("login");
		return "Login";
	}

	@RequestMapping(value="/loginfail", method = RequestMethod.GET)
	public String loginerror(Model model) {
		
		model.addAttribute("loginerror", "true");
		return "login";
	}
	
}
