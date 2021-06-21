/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Julian Beneche
 */

package oop.assignment.ex44;
import java.io.*;
import java.util.*;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Base {
    public static void main(String[] args) {

        //Create one json parser object
        JsonParser parser = new JsonParser();
        try {
            //Read json file using parser and store it in obj
            Object obj = parser.parse(new FileReader("D:/products.json"));
            JsonObject jsonObject = (JsonObject) obj;
            JsonArray subjects = (JsonArray) jsonObject.get("products");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String input;

            //Flag is used whether given string is present or not
            int flag = 0;
            System.out.print("What is the product name? ");
            input = bufferedReader.readLine();

            //Create iterator for products array
            Iterator iterator = subjects.iterator();

            //loop to get info
            while (iterator.hasNext()) {
                //get name and make another json
                JsonObject json = (JsonObject) iterator.next();
                String name = jsonObject.get("Name").toString();

                // compare
                if(input.toLowerCase().equals(name.toLowerCase())){
                    System.out.println("Name: "+name);
                    System.out.println("Price: "+json.get("price"));
                    System.out.println("Quantity: "+json.get("quantity"));
                    flag = 1;
                }
            }
            if(flag == 0){
                System.out.println("Sorry, that product was not found in our inventory");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
