package com.company;
// Import it as it contains all file handling classes
import java.io.*;
import java.util.Scanner;

public class FIleHandling {
    public static void main(String[] args) {
        // Creating a File
        File myFile = new File("Dharam.txt"); // Construction that creates the file
        try{
            myFile.createNewFile();
        }
        catch(IOException e){
            System.out.println("Unable to create file.");
            System.out.println(e);
        }

        // Writing in the file
        try{
            FileWriter fw = new FileWriter("Dharam.txt"); // Kis file me likhna h inside ()
            fw.write("Binod Pappu"); // kya likhna h inside ()
            fw.close(); // File me likh ke close it
        }
        catch(IOException e){
            System.out.print(e);
        }

        // Reading from a file
        try {
            Scanner sc = new Scanner(myFile); // Obj ka naam jaha file create kiya tha
            while(sc.hasNextLine()){
                String s = sc.nextLine();
                System.out.println(s);
            }
            sc.close();
        }
        catch(IOException e){
            System.out.println(e);
        }

        // Deleting a File
        if (myFile.delete()) { // Obj ka naam jaha file create kiya tha
            System.out.println(myFile.getName() + " is successfully deleted");
        } else {
            System.out.println("Failed to delete " + myFile.getName() + " file");
        }
    }
}
