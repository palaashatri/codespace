package Activity_6;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    TwoWheeler t;
	    FourWheeler f;
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.Four Wheeler\n2.Two Wheeler\nEnter Vehicle Type:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:f=new FourWheeler();
				   System.out.println("Vehicle Make:");
				   sc.nextLine();
				   f.setMake(sc.nextLine());
				   System.out.println("Vehicle  Number:");
				   f.setVehicleNumber(sc.nextLine());
				   System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
				   int c=sc.nextInt();
				   if(c==1) {
					   f.setFuelType("Petrol");
				   }
				   else {
					   f.setFuelType("Diesel");
				   }
				   System.out.println("Fuel Capacity:");
				   f.setFuelCapacity(sc.nextInt());
				   System.out.println("Engine CC:");
				   f.setCc(sc.nextInt());
				   System.out.println("Audio System:");
				   sc.nextLine();
				   f.setAudioSystem(sc.nextLine());
				   System.out.println("Number of Doors");
				   f.setNumOfDoors(sc.nextInt());
				   System.out.println(f.getMake());
				   f.displayBasicInfo();
				   f.displayDetailInfo();
				   
				   
			      
				  break;
			case 2:t=new TwoWheeler();
			       System.out.println("Vehicle Make:");
			       sc.nextLine();
			       t.setMake(sc.nextLine());
			       System.out.println("Vehicle  Number:");
				   t.setVehicleNumber(sc.nextLine());
			       System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
			       int x=sc.nextInt();
			       if(x==1) {
				      t.setFuelType("Petrol");
			       }
			       else {
				      t.setFuelType("Diesel");
			       }
			      System.out.println("Fuel Capacity:");
			      t.setFuelCapacity(sc.nextInt());
			      System.out.println("Engine CC:");
			      t.setCc(sc.nextInt());
			      System.out.println("kickStartAvailable(yes/no):");
			      sc.nextLine();
			      String y=sc.nextLine();
			      if(y.equals("yes")) {
			    	  t.setKickStartAvailable(true);
			      }
			      else {
			      t.setKickStartAvailable(false);
			      }
			      System.out.println(t.getMake());
			      t.displayBasicInfo();
			      t.displayDetailInfo();

				  break;
				  
			
			 
			}
			
			
		}while(ch==1||ch==2);

        sc.close();

	}

    
    
}
