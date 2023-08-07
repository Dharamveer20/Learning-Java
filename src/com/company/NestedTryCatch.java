package com.company;

public class NestedTryCatch {
    public static void main(String[] args){
        int[] arr = {4,2,6};

        try {
//            System.out.println(arr[10]);
                try {
                    // Statement 2
                    System.out.println(arr[12]);
                }
                catch(ArrayIndexOutOfBoundsException a) { // could have handled specific exception.
                    // Statement 3;
                    System.out.println("3");

                }
            System.out.println(arr[10]);
        }
        catch(Exception b){
            // Statement 4
            System.out.println("4");

        }
    }
}
