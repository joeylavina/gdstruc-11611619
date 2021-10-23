package com.gdstruc.quiz2;

public class Card {

    private int value, Class;
    private String[] cardClass = {"Tank", "Support", "Healer", "Magician", "Hunter" };
    private String[] cardValue = {"S1", "S2", "S3", "S4", "General", "Commander"};

    public Card(int values, int cardClass) {

        value = values;
        Class = cardClass;

    }

    public String toString()
    {
        String finalCard = cardValue[value] + " of the " + cardClass[Class] + " class.";

        return finalCard;
    }
}
