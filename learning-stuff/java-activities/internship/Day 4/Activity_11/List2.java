package Activity_11;
import java.util.*;
public class List2 {
	public static void main(String[] args)
	{
		try {
		ArrayList<String> list=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			list.add(sc.next());
		}
		int index=sc.nextInt();
		Collections.swap(list, 0,index);
		
		for(String s:list)
		{System.out.println(s);}		
		sc.close();
		}
		catch (IndexOutOfBoundsException e) {
            System.out.println("\nException thrown : " + e);
        }
		
	}

}
