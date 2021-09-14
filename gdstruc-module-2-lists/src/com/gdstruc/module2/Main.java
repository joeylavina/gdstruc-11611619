package com.gdstruc.module2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


    List<Player> playerList = new ArrayList<>();

     playerList.add(new Player(1, "Asuna", 100));
     playerList.add(new Player(2, "LethalBacon", 205));
     playerList.add(new Player(3, "HPDeskJet", 34));


     //to show an element
     //System.out.print(playerList.get(1));

     playerList.add(2, new Player( 553, "Arctis", 55));

     playerList.remove(2);

     //to check if player is in the list
        // System.out.println(playerList.contains(new Player(2, "LethalBacon", 205)));

       //returns false if list doesn't have the element
        System.out.println(playerList.indexOf(new Player(2, "LethalBacon", 205)));
     //to print out playerList
        // for (Player p : playerList)
     //{
       //  System.out.println(p);
     //}
    }
}
