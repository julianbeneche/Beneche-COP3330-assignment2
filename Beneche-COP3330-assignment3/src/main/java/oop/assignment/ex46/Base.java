/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Julian Beneche
 */

package oop.assignment.ex46;

import java.io.File;
import java.util.Scanner;

public class Base {
    public class Main
    {

        public static void main(String[] args)
        {
            try {
                File myObj = new File("filename.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();

            String[] keys = text.split(" ");
            String[] uniqueKeys;
            int count = 0;
            System.out.println(text);
            uniqueKeys = getUniqueKeys(keys);

            for(String key: uniqueKeys)
            {
                if(null == key)
                {
                    break;
                }
                for(String s : keys)
                {
                    if(key.equals(s))
                    {
                        count++;
                    }
                }
                System.out.println("Count of ["+key+"] is : "+count);
                count=0;
            }
        }

        private static String[] getUniqueKeys(String[]String[] keys;
            keys)
        {
            String[] uniqueKeys = new String[keys.length];

            uniqueKeys[0] = keys[0];
            int uniqueKeyIndex = 1;
            boolean keyAlreadyExists = false;

            for(int i=1; i<keys.length ; i++)
            {
                for(int j=0; j<=uniqueKeyIndex; j++)
                {
                    if(keys[i].equals(uniqueKeys[j]))
                    {
                        keyAlreadyExists = true;
                    }
                }

                if(!keyAlreadyExists)
                {
                    uniqueKeys[uniqueKeyIndex] = keys[i];
                    uniqueKeyIndex++;
                }
                keyAlreadyExists = false;
            }
            return uniqueKeys;
        }
    }
}

    private String[] getUniqueKeys(String[] keys) {
    }
