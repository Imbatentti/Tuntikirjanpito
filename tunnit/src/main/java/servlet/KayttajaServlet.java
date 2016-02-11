package servlet;

import java.io.IOException;
import java.sql.SQLException;

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
		}/*elseif(formi2) {
			metodi2();
		}elseif(formi3)	{
			metodi3();
		}elseif (formi4) {
			metodi4();
		}etc
	*/}
			
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("asd1");
		//if(request.getParameter("action") != null && request.getParameter("action").equals("tunnit")) {
			System.out.println("asd");
			try {
				keraaJaLahetaTiedot(request, response);
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//}
	}
	
	private void ohjaaSyottoon(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("lomake.jsp");
		rd.forward(request, response);
		
	}
	
	// Metodi ker�� sy�tteen lomakkeelta ja l�hett�� sen DAOON. Sitten palaa sy�tt��n.
	private void keraaJaLahetaTiedot(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		String nimi = request.getParameter("nimi");
		String tunnit = request.getParameter("tunnit");
		String kuvausVali = request.getParameter("kuvaus");
		
		double tunnitLop = Double.parseDouble(tunnit);
		System.out.println("perkele");
		SyoteVali syotettavatTunnit = new SyoteVali(nimi, tunnitLop, kuvausVali);
		
		KayttajaDAO kd = new KayttajaDAO();
		kd.lisaa(syotettavatTunnit);
		
		RequestDispatcher rd = request.getRequestDispatcher("lomake.jsp");
		rd.forward(request, response);
	}	
}
