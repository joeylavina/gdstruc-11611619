package com.gdstruc.quiz2;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Card C;
        Deck deck = new Deck();
        
        System.out.println("Cards drawn: ");
        for (int i = 0; i < 30; i++){
            C = deck.drawRandom();
            System.out.println(C.toString());
        }
        









    }
}
