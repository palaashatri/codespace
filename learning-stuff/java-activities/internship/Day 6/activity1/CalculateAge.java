package day6.activity1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateAge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your date of birth (Day-Month-Year)");
		String ageInput = scanner.next();
		String ageAr[] = ageInput.split("-");
		LocalDate birthDate = LocalDate.of(Integer.parseInt(ageAr[2]), Integer.parseInt(ageAr[1]), Integer.parseInt(ageAr[0]));
		LocalDate now = LocalDate.now();
		System.out.println("Age in years: " + Period.between(birthDate, now).getYears());
	}
}
