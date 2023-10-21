/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5.activity3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Benzee
 */
public class TeamMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of teams:");
        int noOfTeams = scanner.nextInt();
        scanner.nextLine();
        List<Team> teamList = new ArrayList<>();
        for (int i = 0; i < noOfTeams; i++) {
            System.out.println("Enter team " + (i + 1) + " detail\nEnter Name");
            String teamName = scanner.nextLine();
            System.out.println("Enter number of matches");
            long noOfMatches = scanner.nextLong();
            scanner.nextLine();
            teamList.add(new Team(teamName, noOfMatches));
        }
        System.out.println("Team list after sort by number of matches");
        Collections.sort(teamList, new TeamComparator());
        for (int i = 0; i < teamList.size(); i++) {
            System.out.println(teamList.get(i).getName() + " - " + teamList.get(i).getNoOfMatches());
        }
    }

}
