/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Julian Beneche
 */

package opp.assignment2.ex32;

import java.util.Random;
import java.util.Scanner;

// i skipped this one and might come back if stuck on others
public class Solution32 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        //takes input from user
        System.out.println("Enter the difficulty level (1, 2, or 3): ");
        int difficult = input.nextInt();
        if (difficult == 1) {
            int difficult = rand.nextInt(10);
            int numguess = rand.nextInt(10);

            System.out.println("I have my number. What's your guess? ");
            numguess = input.nextInt();

        }





        }
    }

