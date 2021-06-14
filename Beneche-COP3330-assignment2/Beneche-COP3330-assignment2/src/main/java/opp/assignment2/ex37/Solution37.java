/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Julian Beneche
 */
package opp.assignment2.ex37;
import java.util.*;

public class Solution37 {
    public static void main(String[] args)
    {
        // create an object of Scanner class for user input
        Scanner in = new Scanner(System.in);

        // prompt user to enter password length
        System.out.print("What's the minimum length? ");
        int size = Integer.parseInt(in.nextLine());

        // enter number of special characters in password
        System.out.print("How many special characters? ");
        int special = Integer.parseInt(in.nextLine());

        // enter number of numbers in password
        System.out.print("How many numbers? ");
        int numbers = Integer.parseInt(in.nextLine());

        // make a function call that will return a random password
        // display that password
        System.out.println("Your password is " + generatePassword(size, special, numbers));
    }

    // this method takes length, required special Characters and numbers as input parameter
    // and the generate and return a random password
    public static String generatePassword(int length, int special, int nums)
    {
        // declare String of letters
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        // declare a String of Characters
        String specialCharacters = "!@#$%^&*";

        // declare a String of numbers
        String numbers = "1234567890";

        // create an object of Random class
        Random random = new Random();

        // declare an ArrayList of Characters
        ArrayList<Character> chars = new ArrayList<>();

        // now, run a loop for required number of special characters times
        for(int i=0; i<special; i++){
            // find random special Character and add it to the list
            chars.add(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
        }

        // now, run a loop for required number of numerals times
        for(int i=0; i<nums; i++){
            // find random numeral and add it to the list
            chars.add(numbers.charAt(random.nextInt(numbers.length())));
        }

        // now, run a loop for the remaining length of password
        for(int i=chars.size()-1; i<length; i++){
            // find random letter and add it to the list
            chars.add(letters.charAt(random.nextInt(letters.length())));
        }

        Collections.shuffle(chars);

        String password = "";

        // loop
        for(Character s : chars)
        {
            password += Character.toString(s);
        }

        // return result
        return password;
    }
}
