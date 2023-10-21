package Activity_11;
import java.util.ArrayList;
import java.util.Scanner;
public class Countsof50and100 {
public static void main(String[] args)
{
	try {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		
		int noOfFifty=0,noOfHundreds=0;
		for(int i: list)
		{
			if(i>=50 && i<=99)
			{
				noOfFifty++;
			}
			if(i>=100)
			{
				noOfHundreds++;
			}
		}
		System.out.println(noOfFifty+ "\n" + noOfHundreds);
		sc.close();
		
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
