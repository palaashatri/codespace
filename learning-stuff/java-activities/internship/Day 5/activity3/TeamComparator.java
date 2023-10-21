/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5.activity3;

import java.util.Comparator;

/**
 *
 * @author Benzee
 */
public class TeamComparator implements Comparator<Team> {

    @Override
    public int compare(Team o1, Team o2) {
        if (o1.getNoOfMatches() > o2.getNoOfMatches()) {
            return 1;
        } else if (o1.getNoOfMatches() < o2.getNoOfMatches()) {
            return -1;
        }
        return 0;
    }

}
