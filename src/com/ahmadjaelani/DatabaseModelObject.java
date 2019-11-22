package com.ahmadjaelani;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Scanner;



public class DatabaseModelObject {



  /*  public final void save(String databaseName) {
        boolean db = openDatabase(databaseName);
        File​ attributeInformation = defineAttributeToWrite();
        writeToDatabase();
    }

    public boolean OpenDatabse(String databaseName) {
        // @TODOimplementasi membaca file
        File file = new File(databaseName+".txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String data = scan.nextLine();
            System.out.println(data);
        }
        scans.close();
        return 1;

    }
    public abstract Goods defineAttributeToWrite();

    public void writeToDatabase() {
        File file = new File("scores.txt");
        // Create a Scanner for the file
        Scanner input = new Scanner(file);
        // Read data from file
        String text = input.next();
        // Close the file
        input.close();

        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }*/
}
