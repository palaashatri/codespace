package com.example.demoMovieDB.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.example.demoMovieDB.dao.*;
import com.example.demoMovieDB.model.*;


public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static void movieMenu() throws Exception{
		int n;
		do {
			System.out.println("You are working on the Movie table. Choose workflow :");
			System.out.println("1. Insert");
			System.out.println("2. View");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.print("Enter your choice : ");
			n = Integer.parseInt(br.readLine());
			MovieDao md = new MovieDao();
			Movie m = new Movie();
			switch(n) {
			case 1:
				System.out.println("-- ADD NEW MOVIE --");
				System.out.print("Movie ID : ");
				int movieID = Integer.parseInt(br.readLine());
				m.setMovieID(movieID);
				System.out.print("Movie Name : ");
				m.setMovieName(br.readLine());
				System.out.print("Hero name : ");
				m.setHeroName(br.readLine());
				System.out.println("Heroine : ");
				m.setHeroine(br.readLine());
				System.out.println("Release date  (yyyy-mm-dd): ");
				String str = br.readLine();
				DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				LocalDate ld = LocalDate.parse(str,dt);
				m.setReleasedDate(ld);
				System.out.println("Language : ");
				m.setLanguage(br.readLine());
				System.out.println("Length : ");
				m.setLength(Integer.parseInt(br.readLine()));
				System.out.println("Movietype : ");
				m.setMovieType(br.readLine());
				System.out.println("Production id : ");
				m.setProductionID(Integer.parseInt(br.readLine()));
				
				if(md.insertMovie(m))
					System.out.println("Movie Added Successfully!");
				
				break;
			case 2:
				System.out.println("-- ALL MOVIES --");
				List <Movie> li = md.getAllMovies();
				for(Movie m1:li) {
					System.out.println(m1);
				}
				break;
			case 3:
				System.out.println("-- UPDATE MOVIE --");
				System.out.print("Enter Movie ID : ");
				int movieID1 = Integer.parseInt(br.readLine());
				m.setMovieID(movieID1);
				System.out.print("New Movie Name : ");
				m.setMovieName(br.readLine());
				System.out.print("New Hero name : ");
				m.setHeroName(br.readLine());
				System.out.println("New Heroine : ");
				m.setHeroine(br.readLine());
				System.out.println("New Release date (yyyy-mm-dd) : ");
				String str1 = br.readLine();
				DateTimeFormatter dt1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				LocalDate ld1 = LocalDate.parse(str1,dt1);
				m.setReleasedDate(ld1);
				System.out.println("New Language : ");
				m.setLanguage(br.readLine());
				System.out.println("New Length : ");
				m.setLength(Integer.parseInt(br.readLine()));
				System.out.println("New Movietype : ");
				m.setMovieType(br.readLine());
				System.out.println("New Production id : ");
				m.setProductionID(Integer.parseInt(br.readLine()));
				
				if(md.updateMovie(movieID1, m))
					System.out.print("Movie Updated Successfully!");
				
				break;
			case 4:
				System.out.println("-- REMOVE MOVIE --");
				System.out.print("Enter Movie ID : ");
				int movieID2 = Integer.parseInt(br.readLine());
				if(md.removeMovie(movieID2))
					System.out.println("Movie Deleted...");
				break;
			default:
				throw new Exception("Invalid Input!");
			}
		}
		while(n>0&&n<5);
		
		
	}

	static void productionsMenu() throws Exception {
		int n;
		do {
			System.out.println("You are working on the Productions table. Choose workflow :");
			System.out.println("1. Insert");
			System.out.println("2. View");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.print("Enter your choice : ");
			n = Integer.parseInt(br.readLine());
			ProductionsDao pd = new ProductionsDao();
			Productions p = new Productions();
			switch(n){
			case 1:
				System.out.println("-- ADD NEW PRODUCTION --");
				System.out.print("Enter production ID:");
				p.setProductionID(Integer.parseInt(br.readLine()));
				System.out.print("Enter Production Name:");
				p.setProductionName(br.readLine());
				System.out.print("Enter Production Startyear:");
				p.setStartYear(Integer.parseInt(br.readLine()));
				System.out.print("Enter Production Address:");
				p.setAddress(br.readLine());
				System.out.print("Enter Production Owner Name:");
				p.setOwnerName(br.readLine());
				if(pd.insertProductions(p))
					System.out.println("Inserted Successfully!");
					
				break;
			case 2:
				System.out.println("-- ALL PRODUCTIONS --");
				List<Productions> li = pd.getAllProductions();
				for(Productions p1: li) {
					System.out.println(p1);
				}
				break;
			case 3:
				System.out.println("-- UPDATE PRODUCTION --");
				System.out.print("Enter production ID :");
				int productionID = Integer.parseInt(br.readLine());
				p.setProductionID(productionID);
				System.out.print("Enter production Name:");
				p.setProductionName(br.readLine());
				System.out.print("Enter production address:");
				p.setAddress(br.readLine());
				System.out.print("Enter production startyear:");
				p.setStartYear(Integer.parseInt(br.readLine()));
				System.out.print("Enter production owner name:");
				p.setOwnerName(br.readLine());
			
				if(pd.updateProduction(productionID,p))
					System.out.println("Updated Successfully!");
					
				break;
			case 4:
				System.out.println("-- REMOVE PRODUCTION --");
				System.out.print("Enter production ID :");
				int id = Integer.parseInt(br.readLine());
				if(pd.removeProduction(id))
					System.out.println("Deleted Successfully!");
					
				break;
			default:
				throw new Exception("Invalid Input!");
			}
		} while(n>0&&n<5);
			
	}
	
	
	public static void main(String[] args) {
		// Driver function
		try {
		 System.out.print("Choose table :\n"
         		+ "1. Movie\n"
         		+ "2. Productions\n"
         		+ "Enter Choice : ");
		 int choice = Integer.parseInt(br.readLine());
		 switch (choice) {
		 case 1:
			 movieMenu();
			 break;
		 case 2:
			 productionsMenu();
			 break;
		 default:
			throw new Exception("Invalid Input!");
		 }
		 br.close();
		} catch(Exception e) {
			System.out.print(e);
		} finally {
			System.exit(0);
		}
	}

}
