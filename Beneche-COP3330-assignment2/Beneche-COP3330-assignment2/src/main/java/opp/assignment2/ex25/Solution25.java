/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Julian Beneche
 */

package opp.assignment2.ex25;


import java.util.Scanner;

public class Solution25 {
    public static void main(String[] args)
    {
        // Stuff to validate
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the password");
        String inputPassword = scan.next();
        int uppercase = 0;
        int lowercase = 0;
        int specialcharacters = 0;
        int digits = 0;
        char[] Password = inputPassword.toCharArray();
        for (int index = 0; index < inputPassword.length(); index++)
        {
            // if statements to test
            if (Character.isUpperCase(Password[index]))
            {
                uppercase = 1;
            }
            if (Character.isLowerCase(Password[index]))
            {
                lowercase = 1;
            }
            if (Character.isDigit(Password[index]))
            {
                digits = 1;
            }
        }
        if (inputPassword.contains("~") || inputPassword.contains("!") || inputPassword.contains("@")
                || inputPassword.contains("#") || inputPassword.contains("$") || inputPassword.contains("%")
                || inputPassword.contains("^") || inputPassword.contains("&") || inputPassword.contains("*")) ;
        {
            specialcharacters = 1;
        }
        if (inputPassword.length() < 8)

            System.out.println("The password '" +inputPassword+ "' is a very weak password");

        else if (uppercase == 1 && lowercase == 1 || digits == 1 || specialcharacters == 1)

            System.out.println("The password '"+ inputPassword+"' is a weak password");

        else if ((inputPassword.length() >= 8 && (((uppercase == 1) && (lowercase == 1)) || (digits == 1) && (specialcharacters == 1)))
                &&
                (inputPassword.length() >= 8 && (((uppercase == 1) && (lowercase == 1)) && (digits == 1) || (specialcharacters == 1))))

            System.out.println("The password '"+ inputPassword+"' is a strong password");

        else if (inputPassword.length() >= 8 && (uppercase == 1) && (lowercase == 1) && (digits == 1) && (specialcharacters == 1))

            System.out.println("The password '"+ inputPassword+"' is a very strong password");

    }
}


