package com.company;
//
//class MyThread1 extends Thread{
//    @Override
//    public void run(){
//        int i =0;
//        while(i<40){
//            System.out.println("I am happy!");
//            i++;
//        }
//    }
//}
//
//class MyThread2 extends Thread{
//    @Override
//    public void run(){
//        int i =0;
//        while(i<40){
//            System.out.println("I am sad!");
//            i++;
//        }
//    }
//}
//
//public class CreatingThread {
//    public static void main(String[] args) {
//        MyThread1 t1 = new MyThread1();
//        MyThread2 t2 = new MyThread2();
//        t1.start();
//        t2.start();
//
//    }
//}

class t1 implements Runnable{
@Override
    public void run(){
        int i=1;
        while(i<5000) {
            System.out.println("Thread 1");
            i++;
        }
    }
}
class t2 implements Runnable{
    @Override
    public void run(){
        int i=1;
        while(i<5000) {
            System.out.println("Thread 2");
            i++;
        }
    }
}
public class CreatingThread{
    public static void main(String[] args) {
        t1 bullet1 = new t1();
        t2 bullet2 = new t2();

        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
