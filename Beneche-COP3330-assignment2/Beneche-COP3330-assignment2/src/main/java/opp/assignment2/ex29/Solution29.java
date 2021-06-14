/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Julian Beneche
 */

package opp.assignment2.ex29;

import java.util.*;
import java.lang.*;


public class Solution29 {
    public static boolean main (String[] args) throws java.lang.Exception
    {
        // initialize
        Scanner sc=new Scanner(System.in);
        int value;

        // ask rate in while form
        while(true){
            System.out.print("What is the rate of return? ");
            value = sc.nextInt();
            System.out.println(value);
            if(value>=1 && value<=72){
                System.out.println("it will take "+(72/value)+" year to double your initial investment");

                return true;
            }
            else
            {// print answers
                System.out.println("Sorry this is not a valid input");
            }
        }
    }
}
