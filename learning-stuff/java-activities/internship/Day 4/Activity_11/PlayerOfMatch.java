package Activity_11;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class PlayerOfMatch {
	
	 public static void main(String[] args)
	 {
		 try {
			 Scanner sc = new Scanner(System.in);
			 int n=sc.nextInt();
			 ArrayList<String> list = new ArrayList<String>();
			 for(int i=0;i<n;i++)
			 {
				 list.add(sc.next());
			 }
			 TreeSet<String> treeSet = new TreeSet<String>(list);
					 
			 for(String s:treeSet)
			 {
				 System.out.println(s); 
			 }
			 sc.close();
			 
		 }
		 catch(Exception e)
		 {
			 System.out.print(e);
		 }
	 }


}
