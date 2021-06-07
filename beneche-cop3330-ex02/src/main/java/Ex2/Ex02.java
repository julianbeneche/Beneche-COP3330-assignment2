
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Julian Beneche
 */


package Ex2;

import java.util.Scanner;


public class Ex02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String input = in.nextLine();
        int length = input.length();

        String outputString =   input + " has " + length + " characters!";

        System.out.println(outputString);


    }
}
