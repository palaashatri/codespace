package com.example.productionproject.dao;

import java.sql.Connection;
import java.sql.Statement;

import com.example.productionproject.configure.MyConfigure;
import com.example.productionproject.model.Productions;

public class ProductionsDao {
	public boolean insertProductions(Productions p) throws Exception{
		Connection c = MyConfigure.getConnection();
		Statement s = c.createStatement();
		try {
			s.execute("insert into productions values ("+p.getProductionid()+",'"+p.getProductionname()+"','"+p.getAddress()+"','"+p.getStartyear()+"','"+p.getOwnername()+"');");	
			return false;
		}
		catch(Exception e) {
		return true;	
		}
		finally {
			c.close();
		}
	}	
}