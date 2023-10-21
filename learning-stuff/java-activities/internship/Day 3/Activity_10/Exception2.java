package Activity_10;

import java.util.Scanner;
public class Exception2 {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of overs");
            int n = sc.nextInt();
            int runsArray[] = new int[n];
            System.out.println("Enter the number of runs for each over");
            for (int i = 0; i < n; i++) {
                runsArray[i] = sc.nextInt();
            }
            System.out.println("Enter the over number");
            int index = sc.nextInt();
            System.out.println(runsArray[index-1]);
        } catch (Exception e) {
            System.out.println(e.getClass());
        }

    }

}