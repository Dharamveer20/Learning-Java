package com.company;
class Monkey{
    public void jump(){
        System.out.println("Jump.");
    }
    public void bite(){
        System.out.println("Bite.");
    }
}
interface basicHuman{
    void eat();
    void sleep();
}
class Human extends Monkey implements basicHuman{
    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }
}
public class CodingChallengeAbsInter {
    public static void main(String[] args) {
        Human m = new Human();
        m.eat();
        m.sleep();
        m.jump();
        m.bite();
    }
}
