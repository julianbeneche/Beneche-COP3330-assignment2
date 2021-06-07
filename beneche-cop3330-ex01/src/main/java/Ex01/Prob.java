/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Julian Beneche
 */
package Ex01;

import java.util.Scanner;

public class Prob {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = in.nextLine();

        String outputString = "Hello, " + name + ", nice to meet you!";

        System.out.println(outputString);

    }

}
