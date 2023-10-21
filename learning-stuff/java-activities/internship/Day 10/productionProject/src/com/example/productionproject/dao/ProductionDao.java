package com.example.productionproject.dao;

import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.example.productionproject.configure.MyConfigure;
import com.example.productionproject.model.Production;

public class ProductionDao {

	public boolean insertProduction(Production p) throws Exception {
		Connection c = MyConfigure.getConnection();
		Statement s = c.createStatement();
		try{
			int count = s.executeUpdate("insert into productions values("+p.getProductionId()+", '"+p.getProductionName()+"', '"+p.getAddress()+"', '"+p.getDateOfStarted()+"', '"+p.getOwnerName()+"', '"+p.getDateStarted()+"')");
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
	public Production getProductionFromId(int id) throws Exception{
		Connection c = MyConfigure.getConnection();
		PreparedStatement ps = c.prepareStatement("Select * from productions where Productionid="+id);
		ResultSet rs = ps.executeQuery();
		rs.next();
		Production p = new Production(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),LocalDate.parse(rs.getString(6)));
		c.close();
		return p;
	}
	public List<Production> getAllProductions() throws Exception{
		List<Production> li = new ArrayList<Production>();
		Connection c = MyConfigure.getConnection();
		PreparedStatement ps = c.prepareStatement("Select * from productions");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			li.add(new Production(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),LocalDate.parse(rs.getString(6))));
		}
		c.close();
		return li;
	}
	
	public boolean updateProduction(Production p) throws Exception{
		Connection c = MyConfigure.getConnection();
		PreparedStatement ps = c.prepareStatement("Update Productions set Productionname='"+p.getProductionName()+"', Address='"+p.getAddress()+"', Dateofstarted="+p.getDateOfStarted()+", Ownername='"+p.getOwnerName()+"', Datestarted='"+p.getDateStarted()+"' where Productionid ="+p.getProductionId());
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
	public boolean deleteProduction(int id) throws Exception{
		Connection c = MyConfigure.getConnection();
		PreparedStatement ps = c.prepareStatement("Delete from Productions where Productionid ="+id);
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
