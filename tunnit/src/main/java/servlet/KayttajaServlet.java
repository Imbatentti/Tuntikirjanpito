package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.KayttajaDAO;
import bean.Tunnit;
import bean.SyoteVali;


/**
 * Servlet implementation class KayttajaServlet
 */
public class KayttajaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KayttajaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("action") == null) {
			ohjaaSyottoon(request, response);
		}				
	}
			
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("action") != null && request.getParameter("action").equals("tunnit")) {
			keraaJaLahetaTiedot(request, response);
		}
	}
	
	private void ohjaaSyottoon(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		
	}
	
	private void keraaJaLahetaTiedot(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nimi = request.getParameter("nimi");
		String tunnit = request.getParameter("tunnit");
		String kuvausVali = request.getParameter("kuvaus");
		
		double tunnitLop = Double.parseDouble(tunnit);
		
		SyoteVali syotettavatTunnit = new SyoteVali(nimi, tunnitLop, kuvausVali);
		
		KayttajaDAO kd = new KayttajaDAO();
		kd.lisaa(syotettavatTunnit);
		
	}


	
}
