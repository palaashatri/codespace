package Activity_3;
import java.util.*;

public class CustomerMain {
    public static void main(String[] args) {
		Customer c=new Customer();
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter the details: ");
		str = sc.nextLine();
		String[] arrofstr = str.split(",");
		System.out.println(java.util.Arrays.toString(arrofstr));
        sc.close();
	}
}
