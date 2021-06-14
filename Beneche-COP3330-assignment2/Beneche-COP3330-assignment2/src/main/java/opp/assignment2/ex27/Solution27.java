/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Julian Beneche
 */

package opp.assignment2.ex27;

import java.util.*;
import java.lang.Math;

public class Solution27 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        // ask user to input balance, apr, and monthly payment
        System.out.print("What is your balance? ");
        double b = Double.parseDouble(in.nextLine());

        System.out.print("What is the APR in the card (as a percent)? ");
        double apr = Double.parseDouble(in.nextLine());

        System.out.print("What is the monthly payment you can make? ");
        double p = Double.parseDouble(in.nextLine());

        // find rate
        double i = apr/(365*100);

        // calculate balance divi price
        double temp = b/p;

        double temp1 = Math.pow((1+i),30);

        double temp2 = Math.log(1+i);

        double temp3 = Math.log(1 + temp *(1 - temp1));

        // enter formula -(1/30) * log(1 + b/p * (1 - (1+i)^30)) / log(1+i)
        int n = (int)Math.ceil((-1 * temp3) / (temp2*30));

        // write answer
        System.out.println("It will take you " + n + " months to pay off this card.");
    }
}

