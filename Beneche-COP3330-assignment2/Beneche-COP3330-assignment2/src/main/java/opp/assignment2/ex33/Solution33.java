/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Julian Beneche
 */

package opp.assignment2.ex33;

import java.util.Random;
import java.util.Scanner;

public class Solution33 {
    public static void main(String[] args) {
        //storing possible responses in array

        String[] responses = {"Yes","No","Maybe","Ask again later"};
        //Create random object
        Random random = new Random();

        //read user input
        Scanner sc = new Scanner(System.in);

        System.out.println("What's your question?");
        String question = sc.nextLine();

        // gets random index and spits it out
        int randomResponseIndex = random.nextInt(responses.length);

        String response = responses[randomResponseIndex];

        System.out.println();
        System.out.println(response);//print the response
        System.out.println();
    }
}
