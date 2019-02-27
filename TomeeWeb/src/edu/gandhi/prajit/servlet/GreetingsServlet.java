package edu.gandhi.prajit.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.gandhi.prajit.ejb.StickySessionCountBean;

/**
 * Servlet implementation class GreetingsServlet
 */
@WebServlet("/GreetingsServlet")
public class GreetingsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private StickySessionCountBean stickySessionCountBean;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/plain");
		response.getWriter().append("Served @: ").append(stickySessionCountBean.getWelcomeMessage());
	}
}
