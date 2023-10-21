package com.example.productionproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.productionproject.configure.MyConfigure;
import com.example.productionproject.model.Movie;

public class MovieDao {

	public boolean insertMovie(Movie p) throws Exception {
		Connection c = MyConfigure.getConnection();
		Statement s = c.createStatement();
		try{
			int count = s.executeUpdate("insert into movie values("+p.getMovieId()+", '"+p.getMovieName()+"', '"+p.getHeroName()+"', '"+p.getHeroine()+"', '"+p.getReleaseDate()+"', '"+p.getLanguage()+"', "+p.getLength()+", '"+p.getMovieType()+"', "+p.getProductionId()+")");
			System.out.println("Rows affected:"+count);
			return true;
		}catch(Exception e) {
			System.out.println(e);
			return false;
		}
		finally {
			c.close();
		}
	}
	public Movie getMovieFromId(int id) throws Exception{
		Connection c = MyConfigure.getConnection();
		PreparedStatement ps = c.prepareStatement("Select * from movie where Movieid="+id);
		ResultSet rs = ps.executeQuery();
		rs.next();
		Movie p = new Movie(rs.getInt("movieId"),rs.getString("movieName"),rs.getString("heroName"),rs.getString("heroine"),LocalDate.parse(rs.getString("releaseDate")),rs.getString("language"),rs.getInt("length"),rs.getString("movieType"),rs.getInt("productionId"));
		c.close();
		return p;
	}
	public List<Movie> getMoviesByLanguage(String s) throws Exception{
		List<Movie> li = new ArrayList<Movie>();
		Connection c = MyConfigure.getConnection();
		PreparedStatement ps = c.prepareStatement("Select * from movie where language like '"+s+"'");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			li.add(new Movie(rs.getInt("movieId"),rs.getString("movieName"),rs.getString("heroName"),rs.getString("heroine"),LocalDate.parse(rs.getString("releaseDate")),rs.getString("language"),rs.getInt("length"),rs.getString("movieType"),rs.getInt("productionId")));
		}
		c.close();
		return li;
	}
	public List<Movie> getAllMovies() throws Exception{
		List<Movie> li = new ArrayList<Movie>();
		Connection c = MyConfigure.getConnection();
		PreparedStatement ps = c.prepareStatement("Select * from movie");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			li.add(new Movie(rs.getInt("movieId"),rs.getString("movieName"),rs.getString("heroName"),rs.getString("heroine"),LocalDate.parse(rs.getString("releaseDate")),rs.getString("language"),rs.getInt("length"),rs.getString("movieType"),rs.getInt("productionId")));
		}
		c.close();
		return li;
	}
	public boolean updateMovie(Movie p) throws Exception{
		Connection c = MyConfigure.getConnection();
		PreparedStatement ps = c.prepareStatement("Update Movie set Moviename='"+p.getMovieName()+"', Heroname='"+p.getHeroName()+"', Heroine='"+p.getHeroine()+"', Releasedate='"+p.getReleaseDate()+"', Language='"+p.getLanguage()+"', Length="+p.getLength()+", Movietype='"+p.getMovieType()+"', Productionid="+p.getProductionId()+" where Movieid ="+p.getMovieId());
		try{
			int count = ps.executeUpdate();
			System.out.println("Rows affected:"+count);
			return true;
		}catch(Exception e) {
			System.out.println(e);			
			return false;
		}
		finally {
			c.close();
		}
		
	}
	public boolean deleteMovie(int id) throws Exception{
		Connection c = MyConfigure.getConnection();
		PreparedStatement ps = c.prepareStatement("Delete from Movie where Movieid="+id);
		try{
			int count = ps.executeUpdate();
			System.out.println("Rows affected:"+count);
			return true;
		}catch(Exception e) {
			System.out.println(e);			
			return false;
		}
		finally {
			c.close();
		}
		
	}
}
