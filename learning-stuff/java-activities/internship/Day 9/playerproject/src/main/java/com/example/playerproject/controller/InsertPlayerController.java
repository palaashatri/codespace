package com.example.playerproject.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.playerproject.dao.PlayerDAO;
import com.example.playerproject.model.Player;

/**
 * Servlet implementation class InsertPlayerController
 */
@WebServlet("/InsertPlayerController")
public class InsertPlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertPlayerController() {
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
		String skill = request.getParameter("skill");
		String country = request.getParameter("country");
		String mobile = request.getParameter("mobile");

		System.out.println("Player ID:"+id+",Player Name:"+name+", Mobile:"+mobile+", Skill:"+skill+", Country:"+country);
		Player p = new Player(id,name,skill,country,mobile);
		PlayerDAO pd = new PlayerDAO();
		boolean b = false;
		try {
		pd.insertPlayer(p);
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
