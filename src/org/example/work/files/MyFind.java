package org.example.work.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.example.work.files.Color.*;


public class MyFind {
    public static void main(String[] args) {
        String searchInput = args.length == 0 ? ".*" : args[0] ;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while ((line = in.readLine()) != null) {
                String outputLine = line.replace(searchInput, ANSI_YELLOW.getValue() + "**" + searchInput + "**" + ANSI_RESET.getValue());
                System.out.println(outputLine);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
