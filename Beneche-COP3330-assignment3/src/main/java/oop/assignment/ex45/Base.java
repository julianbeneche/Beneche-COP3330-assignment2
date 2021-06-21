/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Julian Beneche
 */
package oop.assignment.ex45;

import java.util.*;
import java.io.*;

public class Base {
    // While format and fix later
    public static void main(String args[]){
    try{
    File oldfile = new
    File("C://Users??Vipul??Desktop??text.txt");
    BufferedReader reading = new BufferedReader(new FilterReader(oldfile));
    String lines = "";
    String texts = "";
    while((lines = reading.readLine()) != null)
{
texts = tests + lines + "r\n";
}
reading.close();
String newtext = texts.replaceAll("utilize", "use");
File newfile = new File("C://Users??Vipul??Desktop??update.txt");
BufferedWriter writing = new BuffereredWriter(new FileWriter(newfile"));
writing.write(newtext);
writing.close();
}
catch (IOException ioex)
{
ioex.printStackTrace();
}
}
}