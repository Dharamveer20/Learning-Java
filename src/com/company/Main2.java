package com.company;

public class Main2 {
    static void sum(int ...arr){ // ... packs the arguments passed in an array
        // for 1st member call
        int result = 0;
        for(int ele: arr) {
            result += ele;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        sum();              //In the parameter it would become int[] arr = {}
        sum(5);       // int[] arr = {5}
        sum(2,10);    // int[] arr = {2,10}
        sum(45,3,43); // int[] arr = {45,3,43}
    }
}
