package Activity_1;
import java.util.*;
public class Player {

	public static void main(String[] args) {
		String first_name, last_name;
		Scanner sc= new Scanner(System.in); 

		first_name= sc.nextLine();    
		last_name= sc.nextLine();  

		String firstChar = first_name.substring(0, 1);
	    String remainingChars = first_name.substring(1, first_name.length());
		remainingChars = remainingChars.toLowerCase();
		firstChar = firstChar.toUpperCase();
		first_name = firstChar + remainingChars;
		last_name = last_name.toUpperCase();

	    System.out.println(first_name);
		System.out.println(last_name);

		sc.close();
	}

}