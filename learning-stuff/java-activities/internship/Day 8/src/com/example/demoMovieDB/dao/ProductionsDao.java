package com.example.demoMovieDB.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.example.demoMovieDB.configure.MyConfigure;
import com.example.demoMovieDB.model.Productions;

public class ProductionsDao {
	public boolean insertProductions(Productions p) throws Exception{
		Connection con = MyConfigure.getConnection();
		try {
			PreparedStatement stmt = con.prepareStatement("INSERT INTO PRODUCTION VALUES(?,?,?,?,?)");
			stmt.setInt(1, p.getProductionID());
			stmt.setString(2, p.getProductionName());
			stmt.setString(3, p.getAddress());
			stmt.setInt(4, p.getStartYear());
			stmt.setString(5,p.getOwnerName());
			
			stmt.executeUpdate();
			return true;
		} catch(Exception e) {
			System.out.print(e);
			return false;
		} finally {
			con.close();
		}
	}
	
	public List<Productions> getAllProductions() throws Exception{
		List<Productions> productions = new ArrayList<Productions>();
		Connection con = MyConfigure.getConnection();
		Statement stmt = con.createStatement();
		String sql = "SELECT * FROM productions;";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			productions.add(new Productions(rs.getInt("Productionid"),rs.getString("Productionname"),rs.getString("Address"),rs.getInt("Startyear"),rs.getString("Ownername")));
		}
		con.close();
		return productions;
	}
	
	public boolean updateProduction(int productionID,Productions p) throws Exception{
		Connection con = MyConfigure.getConnection();
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate("UPDATE productions SET Productionname='"+p.getProductionName()+"',Address='"+p.getAddress()+"',Startyear="+p.getStartYear()+",Ownername='"+p.getOwnerName()+"' WHERE Productionid="+p.getProductionID()+";");
			return true;
		} catch(Exception e) {
			System.out.print(e);
			return false;
		} finally {
			con.close();
		}
	}
	
	public boolean removeProduction(int productionID) throws Exception{
		Connection con = MyConfigure.getConnection();
		try {
			Statement stmt = con.createStatement();
			String sql = "DELETE FROM productions WHERE Productionid = "+productionID+";";
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
