package com.company;

class Rectangle{
    public int l,b;

    public void set(int x, int y) {
        l = x;
        b = y;
    }
    public void get() {
        System.out.printf("Length is %d and Breath is %d \n", l,b);
    }
}
class Cuboid extends Rectangle{
    public int h;

    public void setH(int h) {
        this.h = h;
    }
    public void printAll(){
        System.out.printf("Length is %d, Breath is %d, Height is %d.",l,b,h);
    }

}
public class CodingChallengeInheritance {
    public static void main(String[] args) {
        Cuboid Cuboid1 = new Cuboid();
        Cuboid1.set(10,12);
        Cuboid1.setH(8);
        Cuboid1.printAll();
    }
}
