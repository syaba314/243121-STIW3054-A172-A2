package com.mycompany.assignment2rt;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class Count {

    public static void count1() throws FileNotFoundException, IOException {

        BufferedReader reader = null;

        //Initializing charCount, wordCount and lineCount to 0
        int charCount = 0;

        int wordCount = 0;

        int lineCount = 0;

        try {
            //Creating BufferedReader object

            reader = new BufferedReader(new FileReader("C:\\hello.xlsx"));

            //Reading the first line into currentLine
            String currentLine = reader.readLine();

            while (currentLine != null) {
                //Updating the lineCount

                lineCount++;

                //Getting number of words in currentLine
                String[] words = currentLine.split(" ");

                //Updating the wordCount
                wordCount = wordCount + words.length;

                //Iterating each word
                for (String word : words) {
                    //Updating the charCount

                    charCount = charCount + word.length();
                }

                //Reading next line into currentLine
                currentLine = reader.readLine();
            }

            //Printing charCount, wordCount and lineCount
            System.out.println("Number Of Words : " + wordCount);
            System.out.println("Number Of Character : " + charCount);

            // System.out.println("Number Of Lines In A File : "+lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();           //Closing the reader
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
