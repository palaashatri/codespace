package com.example.demoMovieDB.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.example.demoMovieDB.configure.MyConfigure;
import com.example.demoMovieDB.model.Movie;

public class MovieDao {
	public boolean insertMovie(Movie movie) throws Exception {
		Connection con = MyConfigure.getConnection();
		try {
			PreparedStatement stmt = con.prepareStatement("INSERT INTO movie VALUES(?,?,?,?,?,?,?,?,?)");
			stmt.setInt(1, movie.getMovieID());
			stmt.setString(2, movie.getMovieName());
			stmt.setString(3, movie.getHeroName());
			stmt.setString(4, movie.getHeroine());
			Date d = Date.valueOf(movie.getReleasedDate());
			stmt.setDate(5, d);
			stmt.setString(6, movie.getLanguage());
			stmt.setInt(7, movie.getLength());
			stmt.setString(8,movie.getMovieType());
			stmt.setInt(9, movie.getProductionID());
			
			stmt.executeUpdate();
			return true;
		} catch(Exception e) {
			System.out.println(e);
			return false;
		}
		finally {
			con.close();
		}
	}
	
	public List<Movie> getAllMovies() throws Exception{
		List <Movie> movies = new ArrayList<Movie>();
		Connection con = MyConfigure.getConnection();
		Statement stmt = con.createStatement();
		String sql = "SELECT * FROM movie;";
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			movies.add(new Movie(rs.getInt("Movieid"),rs.getString("Moviename"),rs.getString("Heroname"),rs.getString("Heroine"),rs.getDate("Releaseddate").toLocalDate(),rs.getString("Language"),rs.getInt("Length"),rs.getString("Movietype"),rs.getInt("Productionid")));
		}
		
		con.close();
		return movies;
		
		
	}
	
	public boolean updateMovie(int movieID, Movie m) throws Exception{
		Connection con = MyConfigure.getConnection();
		try {
			Statement s = con.createStatement();
			s.execute("UPDATE movie SET Moviename ='"+m.getMovieName()+"',Heroname='"+m.getHeroName()+"',Heroine='"+m.getHeroine()+"',Releaseddate="+m.getReleasedDate()+",Language='"+m.getLanguage()+"',Length="+m.getLength()+",Movietype='"+m.getMovieType()+"' where Movieid="+m.getMovieID()+";");	
			return true;
		} catch(Exception e) {
			System.out.print(e);
			return false;
		} finally {
			con.close();
		}
		
	}
	
	public boolean removeMovie(int movieID) throws Exception{
		Connection con = MyConfigure.getConnection();
		try {
			Statement stmt = con.createStatement();
			String sql = "DELETE FROM movie WHERE Movieid = "+movieID+";";
			stmt.executeUpdate(sql);
			return true;
		} catch(Exception e) {
			System.out.print(e);
			return false;
		} finally {
			con.close();
		}
		
	}
}
