/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5.activity1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Benzee
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the player name");
        String playerName = scanner.nextLine();
        System.out.println("Enter wickets - seperated by \"|\" symbol");
        String wickets = scanner.next();

        Map<String, List<Wicket>> hashMap = new HashMap<>();

        boolean addPlayer = true;
        while (addPlayer) {
            System.out.println("Enter the player name");
            playerName = scanner.nextLine();
            System.out.println("Enter wickets - seperated by \"|\" symbol");
            wickets = scanner.next();
            String bowlersWickets[] = wickets.split("%|%");
            for (int i = 0; i < bowlersWickets.length; i++) {
                if (hashMap.containsKey(playerName)) {
//                    List<Wicket>
                }
            }
            System.out.println("Do you want to add another player (yes/no)");
            addPlayer = scanner.nextBoolean();
        }
    }
}
