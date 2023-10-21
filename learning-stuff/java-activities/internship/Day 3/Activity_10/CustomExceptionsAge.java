package Activity_10;

import java.util.Scanner;
public class CustomExceptionsAge {

    String playerName;
    int playerAge;

    static void getInput() throws InvalidAgeRange{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the player name");
        String name = sc.nextLine();
        System.out.println("Enter the player age");
        int age = sc.nextInt();

        if (age < 19) {
            throw new InvalidAgeRange("CustomException: InvalidAgeRangeException");
        }else{
            System.out.println("Player name: "+ name +"\nPlayer age: "+ age);
        }
    }

    public static void main(String[] args) {
        try {
            getInput();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}