package Activity_10;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TeamNameNotFound {

	 static void ipl() throws TeamNameNotFoundException {
		  
		 String teams[] = {"Chennai Super Kings", "Sun Risers Hyderabad","Mumbai Indians", "Royal Challengers Bangalore", "Delhi Capitals","Kings X1 Punjab", "Kolkata Knight Riders", "Rajasthan Royals"};      
		   System.out.println("Enter the expected winner team of IPL Season 13");
		   Scanner sc = new Scanner(System.in); 
		   String winnerTeam = sc.nextLine();
	        System.out.println("Enter the expected runner Team of IPL Season 13");
	        String runnerUpTeam = sc.nextLine();
	        List<String> ll = Arrays.asList(teams);
	        if(ll.contains(winnerTeam) && ll.contains(runnerUpTeam))
	        {
	        	System.out.println("Expected IPL Season 13 winner: "+ winnerTeam+"\nExpected IPL Season 13 RunnerUp: "+runnerUpTeam);
	        	
	        }
	        else
	        	{
	    	            throw new TeamNameNotFoundException("TeamNameNotFoundException: Entered team is not a part of IPL Season 13");
	    	        
      	}
	    }

	    public static void main(String[] args) {
	        try {
	            ipl();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	}