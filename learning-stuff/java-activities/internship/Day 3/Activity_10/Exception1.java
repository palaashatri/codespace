package Activity_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exception1 {

    public static void main(String[] args) {

        int runScored;
        int overFaced;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        try {            
            System.out.println("Enter the total runs scored");
            runScored = Integer.parseInt(reader.readLine());
            System.out.println("Enter the total overs faced");
            overFaced = Integer.parseInt(reader.readLine());
            double runRate = (double) runScored / (double) overFaced ;
            System.out.println("Current Run Rate :" + String.format("%.2f", runRate));
        }
       
        catch (Exception e) {
            System.out.println(e.getClass());
        }
       

    }
}