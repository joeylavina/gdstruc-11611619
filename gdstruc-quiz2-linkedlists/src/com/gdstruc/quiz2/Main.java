package com.gdstruc.quiz2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<PlayerLinkedList> playerList = new ArrayList<>();

       Player asuna = new Player(1, "Asuna", 100);
       Player lethalBacon = new Player(2, "LethalBacon", 205);
       Player hpDeskJet = new Player(3, "HpDeskJet", 34);
       Player SistineChapel = new Player(4, "SistineChapel", 45);


        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(hpDeskJet);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(SistineChapel);

        playerLinkedList.removeHead();


        playerLinkedList.printList();
        playerLinkedList.printCount();







    }
}
