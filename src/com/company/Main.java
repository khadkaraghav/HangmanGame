package com.company;

import javafx.collections.ArrayChangeListener;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Let's play hangman");

        ArrayList<String> secretWords = new ArrayList<String>();

        Collections.addAll(secretWords, "hangmans", "youtube", "instagram", "face");

        Collections.shuffle(secretWords);

        String gameWord = secretWords.get(0);
        // System.out.println(gameWord);

        StringBuilder builder = new StringBuilder(gameWord);


        for (int i = 1; i <= gameWord.length(); i++) {

            builder.append("-");

            System.out.print("_");

        }

        int totalLife = 6;

        for (int i = 1; i < 7; i++) {

            System.out.println("\nEnter your guess");

            Scanner reader = new Scanner(System.in);

            String guess = reader.next();

if (gameWord.contains(guess)){

    int start =0; int end =0;

    start = gameWord.indexOf(guess);

    end = start + guess.length();

    builder.replace(start,end,guess);

    System.out.println(builder);



}

        }

    }
}



