package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.List;

import bean.Tulostus;
import bean.Tunnit;
import dao.KayttajaDAO;

/**
 * Servlet implementation class TulostusServlet
 */
public class TulostusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
	
    public TulostusServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	List<Tulostus> tulostus = null;
	System.out.println("asd");
	
	KayttajaDAO kd = (KayttajaDAO)context.getBean("daoLuokka");
	tulostus = kd.haeKaikki();
	
	request.setAttribute("tulostus", tulostus);
	
	request.getRequestDispatcher("tulostus.jsp").forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
