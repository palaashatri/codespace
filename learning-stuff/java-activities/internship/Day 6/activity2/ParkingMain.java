package day6.activity2;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ParkingMain {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Set the price per day in rupees");
		double pricePerDay = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter the vehicle Number: ");
		String vehicleNumber= scanner.next();		
		System.out.println("Enter mobile number");
		String mobileNumber= scanner.next();
		System.out.println("Enter your incoming Date (Date-Month-Year)");
		String inTime = scanner.next();
		String inTimeArr[] = inTime.split("-");
		LocalDate inDate = LocalDate.of(Integer.parseInt(inTimeArr[2]), Integer.parseInt(inTimeArr[1]), Integer.parseInt(inTimeArr[0]));
		LocalDate now = LocalDate.now();
		
		System.out.println("Enter your outgoing Date (Date-Month-Year)");
		String outTime = scanner.next();
		String outTimeArr[] = outTime.split("-");
		LocalDate outDate = LocalDate.of(Integer.parseInt(outTimeArr[2]), Integer.parseInt(outTimeArr[1]), Integer.parseInt(outTimeArr[0]));
		MallParking mallParking = new MallParking(vehicleNumber,mobileNumber, pricePerDay, inDate, outDate);
		System.out.println("The total fare is: "+ mallParking.calculateTotalFare());
	}
}
