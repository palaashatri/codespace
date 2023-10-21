package com.example.productionproject.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.productionproject.dao.ProductionsDao;
import com.example.productionproject.model.Productions;

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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id =Integer.parseInt(request.getParameter("pid"));
		String name = request.getParameter("pname");
		String address = request.getParameter("paddress");
		String startyear = request.getParameter("pstartyear");
		String ownername = request.getParameter("pownername");

		System.out.println("Production ID:"+id+",Production Name:"+name+", Address:"+address+", Startyear :"+startyear+", Ownername:"+ownername);
		Productions p = new Productions(id,name,address,startyear,ownername);
		ProductionsDao pd = new ProductionsDao();
		boolean b = false;
		try {
		pd.insertProductions(p);
		}
		catch(Exception e)
		{
			b=true;
			System.out.println(e);
		}
		finally {
			if(b==true) {
				System.out.println("Error due to some Exception");
			}
			else {
				System.out.println("Successfully Inserted");
			}
		}
	
	}

}
