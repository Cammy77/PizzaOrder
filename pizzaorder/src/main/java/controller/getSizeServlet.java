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
 * Servlet implementation class getSizeServlet
 */
@WebServlet("/getSizeServlet")
public class getSizeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getSizeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userSize = request.getParameter("userSize");
		
		PizzaOrder userOrder = new PizzaOrder(userSize);
		
		request.setAttribute("userToppings", userOrder);
		getServletContext().getRequestDispatcher("/toppings.jsp").forward(request, response);
		
		request.setAttribute("orderConfirm", userOrder);
		getServletContext().getRequestDispatcher("/orderconfirmation.jsp").forward(request, response);
		
		PrintWriter writer = response.getWriter();
		writer.println(userOrder.toString());
		writer.close();
	}

}
