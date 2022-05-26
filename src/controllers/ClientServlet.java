package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.ClientBeans;

/**
 * Servlet implementation class ClientServlet
 */
@WebServlet("/ClientServlet")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	String nom=request.getParameter("nom");
	String Prenom=request.getParameter("per");
	String adresse=request.getParameter("ad");
	String Email=request.getParameter("email");
	double Numero= Double.parseDouble(request.getParameter("num"));
	ClientBeans client=new ClientBeans();
	client.setNom(nom);
	client.setPrenom(Prenom);
	client.setAdresse(adresse);
	client.setNumero(Numero);
	client.setEmail(Email);
	HttpSession session= request.getSession();
	session.setAttribute("client" , client);
	//despatcher
	RequestDispatcher dispInf=request.getRequestDispatcher("client.jsp");
	dispInf.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
