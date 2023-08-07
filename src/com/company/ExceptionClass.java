package com.company;

//class MyException extends Exception{
//    @Override
//    public String getMessage() {
//        return "getMessage is called.";
//    }
//    @Override
//    public String toString(){
//        return "toString is called.";
//    }
//}
//
//public class ExceptionClass {
//    public static void main(String[] args){
//        int a = 10; // Could have input from user.
//
//        if(a<18) {
//            try{
////                throw new MyException();
//                throw new ArithmeticException("hey");
//            }
//            catch(Exception b){
////                System.out.println(b.getMessage()); // getMessage is called.
//                System.out.println(b); // toString is called.
////                System.out.println(b.toString()); // toString is called.
////                b.printStackTrace();  // kaha kya error h batata h.
//            }
//        }
//    }
//}
//package com.company;
//
//class NegativeRadiusException extends Exception{
//    @Override
//    public String toString() {
//        return "Radius cannot be negative!";
//    }
//
//    @Override
//    public String getMessage() {
//        return "Radius cannot be negative!";
//    }
//}

//public class Main{
//
//
//    public static int divide(int a, int b) throws ArithmeticException{
//        int result = a/b;
//        return result;
//    }
//    public static void main(String[] args) {
//
//        System.out.println(divide(10,6)); // It'll still work
////        But Better rahega surround the code with Try Catch block
//        try{
//            double ar = divide(6,0);
//            System.out.println(ar);
//        }
//        catch(Exception e){
//            System.out.println("Exception");
//        }
//    }
//}