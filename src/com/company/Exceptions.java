package com.company;
import java.util.Scanner;
public class Exceptions{
    public static void main(String[] args){
        int a = 10;
        int b = 0;
//        Scanner sn = new Scanner(System.in);
//        b = sn.nextInt();
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch (ArrayIndexOutOfBoundsException e){
            // Some code
        }
        catch(Exception e){ // e (could have name anything) stores the error.
            System.out.print("We Failed. Reason: ");
            System.out.println(e);
        }
    }
}
