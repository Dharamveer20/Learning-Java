package com.company;
// ways of importing a package
////1.
//import java.util.Scanner; // Import Scanner from util package
//2
import java.util.*; // Import everything from util package

public class AboutPackage {
    public static void main(String[] args){
        System.out.print("Enter a num: ");
        // Used Scanner without importing.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x = sc.nextInt();
    }
}
