package com.company;
import java.util.*;
//@FunctionalInterface
 interface Par{
    abstract void meth1();
}
// Traditional way
//class ChildC extends Par{
//    public void meth1(){
//        System.out.println("I'm Meth1");
//    }
//}
public class AnonymousClass {
    public static void main(String[] args) {
        // Traditional way
//       ChildC obj = new ChildC();
//       obj.meth1();

//        Par obj = new Par() {
//            @Override
//            void meth1() {
//                System.out.println("I'm Meth1");
//            }
//        };
//        obj.meth1();

        Par obj1 = ()->{System.out.println("I'm Meth1 using Lambda Expression");};
        obj1.meth1();

        ArrayList a = new ArrayList();
        a.add(5);
        a.add("H");
        System.out.println(a);
    }
}
