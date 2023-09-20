package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PizzaOrder;



/**
 * Servlet implementation class getToppingServlet
 */
@WebServlet("/getToppingServlet")
public class getToppingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public getToppingServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pizzaTopping = request.getParameter("pizzaTopping");
		String userSize = request.getParameter("userToppings");

		PizzaOrder userOrder = new PizzaOrder(userSize,pizzaTopping);
		
		request.setAttribute("orderConfirm", userOrder);
		//request.setAttribute("orderConfirm", )

		getServletContext().getRequestDispatcher("/orderconfirmation.jsp").forward(request, response);

		PrintWriter writer = response.getWriter();
		writer.println(userOrder.toString());
		writer.close();
	}

}
