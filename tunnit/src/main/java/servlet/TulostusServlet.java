package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.SQLException;
import java.util.List;

import bean.Tunnit;
import dao.TuntiDAO;

/**
 * Servlet implementation class TulostusServlet
 */
public class TulostusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TulostusServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	List<Tunnit> tunnit = null;
	System.out.println("asd");
	try{
		TuntiDAO tDao = new TuntiDAO();
		tunnit = tDao.haeKaikki();
	}
	catch (SQLException e){
		e.printStackTrace();
	} catch (InstantiationException e) {
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	request.setAttribute("tunnit", tunnit);
	
	request.getRequestDispatcher("tulostus.jsp").forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
