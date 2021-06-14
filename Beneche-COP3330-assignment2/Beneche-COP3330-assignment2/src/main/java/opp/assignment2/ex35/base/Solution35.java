/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Julian Beneche
 */

package opp.assignment2.ex35.base;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Solution35 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//get user input
        String name = null;
        ArrayList<String> nameList = new ArrayList<String>();//ArrayList for storing names

        // get name with do loop
        do {
            System.out.println("Enter a name:");
            name= input.nextLine();//get the name
            //add the name to the array list only if it is non blank or non empty
            if(!name.isBlank() && !name.isEmpty())
                nameList.add(name);
        }while(!name.isBlank() && !name.isEmpty());

        //Generate a random in
        Random random = new Random();
        int randomIndex = random.nextInt(nameList.size());

        //pick the winner at random
        System.out.println("The winner is... "+nameList.get(randomIndex));

    }
}
