package Activity_4;
import java.util.*;
public class InningsMain {
    public static void main(String[] args) {
		
		Innings inn = new Innings();
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the team name:");
	    inn.setTeamname(s.nextLine());
	    System.out.println("Enter session:");
	    inn.setInningsname(s.nextLine());
	    System.out.println("Enter runs:");
	    inn.setRuns(s.nextInt());
	    inn.displayInningsDetails();
	    s.close();
	}

}
