package com.JoseGabriel;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        numbers[0] = 90;
        numbers[1] = 85;
        numbers[2] = 250;
        numbers[3] = 13;
        numbers[4] = 900;

        int index = -1;

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] == 13)
            {
                index = i;
                break;
            }
        }

        System.out.println(index);

    }
}
