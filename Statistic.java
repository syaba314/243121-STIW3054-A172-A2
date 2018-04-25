/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment2rt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author ASUS
 */
public class Statistic {
    
 public static void countLetters(String filename)throws IOException {
    BufferedReader in = new BufferedReader(new FileReader(filename));
  Map<String, Integer> map = new HashMap<String, Integer>();
        String[] tokens =filename.split("");
        for (int i = 0; i < tokens.length; i++) 
        {
            String string = tokens[i];
            if(map.containsKey(string))
            {
                int value=map.get(string);
                value++;
                map.put(string, value);
            }
            else
            {
                map.put(string, 1);
            }
        }
        Set<Entry<String,Integer>> entryset = map.entrySet();
        for(Entry<String,Integer> entry: entryset)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}