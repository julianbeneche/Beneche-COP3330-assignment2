/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Julian Beneche
 */

package oop.assignment.ex42;

import java.util.*;
import java.io.*;

public class Base {

    public static void readNames(Scanner input, ArrayList<String> names)

    {
        // loop to see lines
        while(input.hasNextLine())
        {
            names.add(input.nextLine());
        }
    }

    // outputs names
    public static void outputNames(ArrayList<String> names) throws IOException
    {
        FileWriter output = new FileWriter(new File("exercise41_output.txt"));

        output.write("Total of " + names.size() + " names\n");
        output.write("--------------------\n");

        // formats and prints
        for(String i: names)
        {
            output.write(i+"\n");
        }

        // close it
        output.close();
    }

    public static void main(String[] args) throws FileNotFoundException
    {

// make scanner
        Scanner inputFile = new Scanner(new File("exercise41_input.txt"));
        ArrayList<String> names = new ArrayList<String>();
        readNames(inputFile, names);

// sort names
        Collections.sort(names);

        inputFile.close();

// write file

        try
        {
            outputNames(names);
        }

// print output
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
