/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Julian Beneche
 */
package opp.assignment2.ex31;

import java.util.*;
import java.lang.*;


public class Solution31 {
    public static void main (String[] args) throws java.lang.Exception
    {
        // setting up
        int restingHR,age;
        Scanner sc=new Scanner(System.in);
        restingHR = sc.nextInt();
        age = sc.nextInt();

        //generating output

        System.out.println("Resting Pulse: " + restingHR + " Age: " + age);

        int intensity = 55;
        System.out.println("Intensity | Rate ");
        System.out.println("------------------------");

        // insert formula for answer
        while(intensity<96){
            int Target = (((220 - age) - restingHR) * intensity) + restingHR;
            System.out.println(intensity+"% | "+Target +"bpm");
            intensity+=5;
        }
    }
}
