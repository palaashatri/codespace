package Activity_11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class List3
{
	
	public static void main(String[] args)
	{
		try {
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			list1.add(sc.next());
		}
		for(int i=0;i<5;i++)
		{
			list2.add(sc.next());
		}
		list1.retainAll(list2);
		Collections.sort(list1);
		for(String s:list1){
			  System.out.println(s);
		}
		sc.close();
		}
		catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }
		
	}
	}