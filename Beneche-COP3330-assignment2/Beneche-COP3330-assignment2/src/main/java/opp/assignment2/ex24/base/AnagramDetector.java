/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Julian Beneche
 */
package opp.assignment2.ex24.base;

public class AnagramDetector {
    public boolean isAnagram (String str1, String str2){
        if(str1.equals(str2)) {
            return true;
        }else{
            return false;
        }
    }
}
