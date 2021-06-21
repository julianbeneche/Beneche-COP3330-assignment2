/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Julian Beneche
 */
package oop.assignment.ex41;

import java.io.*;

import java.util.*;

public class Base {
    // read names to array

    public static void readNames(Scanner input, ArrayList<String> names) {

        // while loop that reads and outputs data
        while (input.hasNextLine()) {
            names.add(input.nextLine());
        }
    }

    // prints out the names
    public static void outputNames(ArrayList<String> names) throws IOException {

        // creates as file to write it in
        FileWriter output = new FileWriter("exercise41_output.txt");
        output.write("Total of " + names.size() + " names\n");

        output.write("--------------------\n");

        // write names after formatying
        for (String i : names) {
            output.write(i + "\n");
        }
        // close it
        output.close();
    }

    public static void main(String[] args) throws FileNotFoundException {

        // make scanner to read it

        Scanner inputFile = new Scanner(new File("exercise41_input.txt"));

        ArrayList<String> names = new ArrayList<String>();

        readNames(inputFile, names);

        // sort names
        Collections.sort(names, String.CASE_INSENSITIVE_ORDER);

        // closing the scanner object after reading the file

        inputFile.close();

        // writing the required data to the output file

        try {
            outputNames(names);
        }

        // if any exception is raised in writing to the output file then printing the exception on the console

        catch (Exception e) {
            System.out.println(e);
        }
    }
}

