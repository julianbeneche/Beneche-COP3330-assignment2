/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Julian Beneche
 */

package oop.assignment.ex43;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Base {
    //Create site parts
    String siteName;
    String author;
    String path;

    //make folder for webstie
    public String createWebsite() {

//Make file within directory
        String directory = path + siteName;
        File newFolder = new File(directory);

        newFolder.mkdirs();
        return directory;
    }

    //Make a J function
    public String createJSFolder() {

        String directory = path + siteName + "/js";
        File newFolder = new File(directory);

        newFolder.mkdirs();
        return directory;
    }
    //make css folder
    public String createCSSFolder() {

        String directory = path + siteName + "/css";
        File newFolder = new File(directory);

        newFolder.mkdirs();
        return directory;
    }

    public String createHTMl() {
        String directory = path + siteName + "/index.html";

        //Make stuff for file
        String htmlContent = "<title> " + siteName + " </title>\n<meta> " + author + " </meta>";

        //Make file
        File file = new File(directory);

        try {

            //Write on file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(htmlContent);
            writer.close();
            return directory;

        } catch(Exception ex) {
            return "Failure";
        }

    }

}
