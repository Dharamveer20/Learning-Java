package com.company;

public class CodingChallengeMember {
    static void starPatRecursion(int s) {
        if(s<5){
            for (int i = 1; i <= s; i++) System.out.print("*");

            System.out.println();

            starPatRecursion(s + 1);
        }
    }

    static void revStarPatRecursion(int s) {
        if(s>0){
            for (int i = 1; i <= s; i++) System.out.print("*");

            System.out.println();

            revStarPatRecursion(s - 1);
        }
    }
    public static void main(String[] args) {
//        System.out.println(starPatRecursion(1));
        starPatRecursion(1);
        revStarPatRecursion(4);
    }
}
 