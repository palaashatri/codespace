package Activity_2;
import java.util.*;

public class CompanyMain {
    public static void main(String[] args) {
		
		Company company=new Company();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the company name : ");
		company.setname(scan.nextLine());
		System.out.println("Enter the employees : ");
		company.setemployees(scan.nextLine());
		System.out.println("Enter TeamLead");
		company.setteamlead(scan.nextLine());
		
		
		String[]c=company.getemployees().split(",");
		int flag=0;
		for(String x:c) {
			if(x.equals(company.getteamlead())) {
				flag=1;
				break;
			}
			
		}
		
		if(flag==0) {
			System.out.println("Invalid input.");
		}
		else {
			System.out.println("Name: "+company.getname());
			System.out.println("Employees: "+company.getemployees());
			System.out.println("Lead: "+company.getteamlead());
		}
		
		scan.close();
		
	}    
}
