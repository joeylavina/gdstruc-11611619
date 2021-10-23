package com.gdstruc.quiz2;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;
    private ArrayList<Card> discarded;

    public Deck() {

        cards = new ArrayList(30);
        for(int val=0; val <=4; val++){
            for (int cl = 0; cl <= 5; cl++){
                cards.add(new Card(val, cl));
            }
        }
    }

    public Card drawRandom()
    {
        Random generator = new Random();
        int index = generator.nextInt(cards.size());
        return cards.remove(index);

    }

    public String toString(){

        String result = "Cards remaining: " + cards;

        return result;
    }

}
