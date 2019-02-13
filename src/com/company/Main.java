package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("Let's play hangman");

        ArrayList<String> secretWords = new ArrayList<String>();
        Collections.addAll(secretWords, "hen", "insta", "face", "javascript");
        Collections.shuffle(secretWords);
        String gameWord = secretWords.get(0);

        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= gameWord.length(); i++) {
            builder.append("-");
            System.out.print("_");
        }

        String guess = "";
        String newGuessedWord = "";

        int totalChance = 6;

        while (!newGuessedWord.equals(gameWord)) {

            Scanner reader = new Scanner(System.in);
            System.out.println("\nEnter your guess");
            guess = reader.next();

            if (gameWord.contains(guess)) {

                builder.replace(gameWord.indexOf(guess), gameWord.indexOf(guess) + 1, guess);
                newGuessedWord = builder.toString();
                System.out.println(newGuessedWord);
            } else if (!gameWord.contains(guess)) {

                while (totalChance > -1) {
                    System.out.println("WRONG");
                    System.out.println("YOU HAVE " + totalChance + " chances");
                    totalChance--;
                    if (totalChance == -1) {
                        System.out.println("YOU HAVE BEEN HANGED");
                        System.exit(0);
                    }

                    break;
                }
            }
            if (newGuessedWord.equals(gameWord)) {
                System.out.println("Congratulations. You've won. The word was " + gameWord);
            }
        }
    }
}


















