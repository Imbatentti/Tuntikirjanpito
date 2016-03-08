package servlet;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import bean.Tunnit;
import dao.KayttajaDAO;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
//@RequestMapping (value="/tunnit")
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
	//@RequestMapping(value="uusitunti", method=RequestMethod.GET)
	public String getCreateForm(Model model){
		Tunnit uudetTunnit =  new Tunnit();
		
		model.addAttribute("tunnit", uudetTunnit);
		return "tunnit/createForm";
	}
	
	//FORMIN VASTAANOTTO
	//@RequestMapping(value="uusitunti", method=RequestMethod.POST)
	/**public String create(@ModelAttribute(value="tunnit") Tunnit tunnit){
		
	}*/
	
	

}
