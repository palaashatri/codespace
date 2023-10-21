package Activity_7;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Hotel Tariff Calculator\n1. Deluxe Room\n2. Deluxe AC Room\n3. Suite AC Room\nSelect Room Type:");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Hotel Name:");
            String hotelName = sc.next();
            System.out.println("\nRoom Square Feet Area");
            int numberOfSqFeet = sc.nextInt();
            System.out.println("\nRoom has TV(true/false)");
            boolean hasTV = sc.nextBoolean();
            System.out.println("\nRoom has Wifi(true/false)");
            boolean hasWifi = sc.nextBoolean();
            DeluxeRoom dr = new DeluxeRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
            int rate = dr.getRatePerSqFeet();
            dr.calculateTariff(numberOfSqFeet, rate);
        } else if (choice == 2) {
            System.out.println("Hotel Name:");
            String hotelName = sc.next();
            System.out.println("\nRoom Square Feet Area");
            int numberOfSqFeet = sc.nextInt();
            System.out.println("\nRoom has TV(true/false)");
            boolean hasTV = sc.nextBoolean();
            System.out.println("\nRoom has Wifi(true/false)");
            boolean hasWifi = sc.nextBoolean();
            DeluxeACRoom dr = new DeluxeACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
            int rate = dr.getRatePerSqFeet();
            dr.calculateTariff(numberOfSqFeet, rate);
        } else if (choice == 3) {
            System.out.println("Hotel Name:");
            String hotelName = sc.next();
            System.out.println("\nRoom Square Feet Area");
            int numberOfSqFeet = sc.nextInt();
            System.out.println("\nRoom has TV(true/false)");
            boolean hasTV = sc.nextBoolean();
            System.out.println("\nRoom has Wifi(true/false)");
            boolean hasWifi = sc.nextBoolean();
            SuiteACRoom sar = new SuiteACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
            int rate = sar.getRatePerSqFeet();
            sar.calculateTariff(numberOfSqFeet, rate);
        } else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
    
}
