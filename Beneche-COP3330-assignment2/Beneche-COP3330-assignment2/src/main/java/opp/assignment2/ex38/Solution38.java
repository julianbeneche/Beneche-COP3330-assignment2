/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Julian Beneche
 */

package opp.assignment2.ex38;
import java.util.*;
public class Solution38 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // prompt user to enter a string containing numbers separated by space
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String data = in.nextLine();

        String list[] = data.split(" ");

        Integer evenList[] = filterEvenNumbers(list);

        // display the filtered even number as per the given format
        System.out.print("The even numbers are ");
        for(int i=0; i<evenList.length; i++){
            if(i < evenList.length-1){
                System.out.print(evenList[i] + " ");
            }
            else
            {
                System.out.print(evenList[i] + ".");
            }
        }
    }

    public static Integer[] filterEvenNumbers(String list[]) {

        // declare an empty array list of Integer
        ArrayList<Integer> newList = new ArrayList<>();

        // loop to  input array
        for(int i=0; i<list.length; i++){

            // convert string number to integer number
            int num = Integer.parseInt(list[i]);

            // check if number is divisible by 2 (means it is even)
            if(num % 2 == 0){

                newList.add(num);
            }
        }

        //convert the array list to integer array
        Integer[] arr = new Integer[newList.size()];
        arr = newList.toArray(arr);

        // return Integer array
        return arr;
    }
}
