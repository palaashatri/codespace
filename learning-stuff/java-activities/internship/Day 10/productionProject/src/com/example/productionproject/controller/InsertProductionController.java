package com.example.productionproject.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.productionproject.dao.ProductionDao;
import com.example.productionproject.model.Production;

/**
 * Servlet implementation class InsertProductionController
 */
@WebServlet("/InsertProductionController")
public class InsertProductionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertProductionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("pid"));
		String name = request.getParameter("pname");
		String address = request.getParameter("address");
		int year = Integer.parseInt(request.getParameter("year"));
		String owner = request.getParameter("oname");
		LocalDate d = LocalDate.parse(request.getParameter("datestarted"));
		System.out.println("Production Id: "+id+", Production Name: "+name+", Address: "+address+", Year Begun: "+year+", Owner Name: "+owner+", Date Started: "+d);
		Production p= new Production(id,name,address,year,owner,d);
		ProductionDao pd = new ProductionDao();
		boolean b=false;
		try {
			 b = pd.insertProduction(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		finally {
			RequestDispatcher rd =null;
			if(b==true) {
				System.out.println("Successfully Inserted.");
				rd = request.getRequestDispatcher("success.html");
				rd.forward(request, response);
			}
			else {
				System.out.println("Error due to some exception.");
				rd = request.getRequestDispatcher("error.html");
				rd.forward(request, response);
			}
		}
	}

}
