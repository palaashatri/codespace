package com.example.productionproject.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.productionproject.dao.MovieDao;
import com.example.productionproject.model.Movie;

/**
 * Servlet implementation class UpdateMovieController
 */
@WebServlet("/UpdateMovieController")
public class UpdateMovieController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateMovieController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int id = Integer.parseInt(request.getParameter("mid"));
		String name = request.getParameter("mname");
		String heroname = request.getParameter("heroname");
		String heroine = request.getParameter("heroine");
		LocalDate d = LocalDate.parse(request.getParameter("releasedate"));
		String language = request.getParameter("language");
		int length = Integer.parseInt(request.getParameter("length"));
		String movietype = request.getParameter("movietype");
		int pid = Integer.parseInt(request.getParameter("pid"));
		System.out.println("Movie Id: "+id+", Movie Name: "+name+", Hero Name: "+heroname+", Heroine: "+heroine+", Release Date: "+d+", Language: "+language+", Length: "+length+", Movie Type: "+movietype+", Production Id: "+pid);
		Movie m= new Movie(id,name,heroname,heroine,d,language,length,movietype,pid);
		MovieDao md = new MovieDao();
		boolean b=false;
		try {
			 b = md.updateMovie(m);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		finally {
			RequestDispatcher rd =null;
			if(b==true) {
				System.out.println("Successfully Updated.");
				rd = request.getRequestDispatcher("updateSuccess.html");
				rd.forward(request, response);
			}
			else {
				System.out.println("Error due to some exception.");
				rd = request.getRequestDispatcher("updateError.html");
				rd.forward(request, response);
			}
		}
	}

}
