package com.company;
public class FinallyBlock{
    static int calc(int a, int b){
        try{
            System.out.println("I'm in try block");
            return a/b;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("I ran");
        }
        return 0;
    }
//   I'm in try block
//   I ran
//   1
    public static void main(String[] args){
        System.out.println("Division is: "  + calc(5,3));
//        for(int i=3; i>=0; i--){
//            try{
//                if(i == 0) break;
//                System.out.println(i/2);
//            }
//            catch(Exception e){
//                System.out.println(e);
//            }
//            finally {
//                System.out.println("I ran " + i);
//            }
        }
    }

