package Ex04;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Julian Beneche
 */
public class Ass4 {
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a noun ");
        String noun = in.nextLine();

        System.out.print("Enter a verb ");
        String verb = in.nextLine();

        System.out.print("Enter a adjective ");
        String adjective = in.nextLine();

        System.out.print("Enter a adverb ");
        String adverb = in.nextLine();

        String outputString =   "Do you " + verb + " your " + adjective +" "+ noun +" "+ adverb + "? That's hilarious!";

        System.out.println(outputString);


    }

}
