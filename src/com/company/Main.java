package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("Let's play hangman");

        ArrayList<String> secretWords = new ArrayList<String>();
        Collections.addAll(secretWords, "hen", "preposition", "insta", "face");
        Collections.shuffle(secretWords);
        String gameWord = secretWords.get(0);

        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= gameWord.length(); i++) {
            builder.append("-");
            System.out.print("_");
        }

        String guess = "";
        String string ="";

        while (!string.equals(gameWord)) {

            Scanner reader = new Scanner(System.in);

            int totalChance = 6;

            System.out.println("\nEnter your guess");
            guess = reader.next();


            if (gameWord.contains(guess)) {

                builder.replace(gameWord.indexOf(guess), gameWord.indexOf(guess) + 1, guess);

                 string = builder.toString();

                System.out.println(string);

            }

            if (string.equals(gameWord)) {

                System.out.println("You've won");
            }
        }
    }
}








