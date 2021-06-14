/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Julian Beneche
 */

package opp.assignment2.ex28;

import java.util.*;
import java.lang.*;


public class Solution28 {
    public static void main(String[] args) throws java.lang.Exception {
        // declare variables
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        int element;

        // while loop to print out numbers
        while (count < 6) {
            System.out.print("Enter the value: ");
            element = sc.nextInt();
            System.out.println(element);
            sum += element;
            count++;
        }
        System.out.println("The total is " + sum);

    }
}