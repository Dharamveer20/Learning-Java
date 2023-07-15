import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
// Coding Challenge 1
public class Main {
    //    static int add(int x, int y) {
//        int z = x + y;
//        return z;
//    }
//    int add(int x, int y) {
//        int z = x + y;
//        return z;
//    }
//    1.
    static void calc() {
        System.out.println("No value");
    }

    //     2.
    static void calc(int x) {
        System.out.println("Value is " + x);
    }

    //    3.
    static void calc(int x, int y) {
        System.out.println("Value is " + x + y);
    }

    static int calc(int x, int y, int z) {
        return x+y+z;
    }

    //syntax
//  ClassName objectName = new ClassName();
    public static void main(String[] args) {
        System.out.println("hey");
//        int a = 10, b = 20;
//        calc(); // 1 will be called
//        calc(a); // 2 will be called.
//        calc(a, b); // 3 will be called
//        System.out.println(calc(a,b,5)); // 4 will be called
    }
}
        // Member call
//        int a = 10, b = 12;
//        Main objName = new Main();
//        System.out.println(objName.add(a,b));
//        Main obj = new Main();
//        int c = obj.add(a, b);

//        System.out.println(c);
//        int c = add(a,b);
 //       System.out.println(c); // Output --> 22

//        Coding Challenge (Reverse an array)
//        int []arr = {10,20,30,20,3};
//        int len = arr.length-1;
//        for(int i=0; i < len; i++) {
//            int temp = arr[i];
//            arr[i] = arr[len];
//            arr[len] = temp;
//            len--;
//        }
//        for(int el: arr) System.out.print(el + " ");
//        For each loop
//        int [] arr1 = {10,20,30};
//        for(int el: arr1) {
//            System.out.println(el);
//        }
//        int [] num = new int[14];
//        int [] arr = {10,120,33,4,443,4,44,4,3,3,3,3,4,5};
//        System.out.println(arr.length); // gives the size of the array.gives the size of the array.
//        for(int i =0; i<13; i++) System.out.print(num[i] + " ");

//Coding Challenge (Rock Paper Scissor)
//        int comp;
//        byte user;
//        Random rn = new Random();
//        comp = rn.nextInt(1, 4);
//
//        System.out.print("Rock paper scissor with the Computer. \n 1.Rock \n 2.Paper \n 3.Scissor \n Enter a number: ");
//
//        Scanner sc = new Scanner(System.in);
//        user = sc.nextByte();
////        System.out.println(user);
//
//        if (comp == user) {
//            if (comp == 1) System.out.println("Computer: Rock. \n You: Rock.\n Game Draw.");
//            else if (comp == 2) System.out.println("Computer: Paper. \n You: Paper.\n Game Draw.");
//            else System.out.println("Computer: Scissor. \n You: Scissor.\n Game Draw.");
//        }
//        if (comp == 1 && user == 2) System.out.println("Computer: Rock. \n You: Paper.\n You won.");
//        else if(comp == 1 && user == 3) System.out.println("Computer: Rock. \n You: Scissor.\n You Lose.");
//        else if(comp == 2 && user == 1) System.out.println("Computer: Paper. \n You: Rock.\n You Lose.");
//        else if(comp == 2 && user == 3) System.out.println("Computer: Paper. \n You: Scissor.\n You Won.");
//        else if(comp == 3 && user == 1) System.out.println("Computer: Scissor. \n You: Rock.\n You Won.");
//        else if (comp == 3 && user == 2)System.out.println("Computer: Scissor. \n You: Paper.\n You Lose.");
//        else System.out.println("Invalid User Input");







// String Method Coding Challenge
////        1.
//        String s1 = "Dh ara m";
//        System.out.println(s1.replace(" ", "_"));
//
////        2
//        String s2 = "Dh  a   ram";
//        System.out.printf("%d \n",s2.indexOf("  "));
//        System.out.printf("%d \n",s2.indexOf("   "));
////        3
//        String s3 = "\"Dear Hary\"";
//        System.out.println(s2.contains("D"));

// Escape Sequence
//        System.out.println("He said \"hey"); // Output --> He said "hey
//        System.out.println("Hey \\ Dharam"); // Output --> Hey \ Dharam
//        String name = "Harry";
////        System.out.println(name.indexOf("r",3));
//        System.out.println(name.lastIndexOf("r", 2));

// String
//        String s = "hey";
//        String a = new String("hey");
//        System.out.println(a);
//        s = "d";
//        System.out.println(s);
//        System.out.println("Enter a num");
//        Scanner sn = new Scanner(System.in);
//        System.out.println(sn.hasNextInt());

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter your subject 1 Mark: ");
//        byte sub1 = in.nextByte();
//        System.out.print("Enter your subject 2 Mark: ");
//        byte sub2 = in.nextByte();        int a = 9/3 + 5*10;
//
//        System.out.print("Enter your subject 3 Mark: ");
//        byte sub3 = in.nextByte();
//
//        System.out.print("Enter your subject 4 Mark: ");
//        byte sub4 = in.nextByte();
//
//        System.out.print("Enter your subject 5 Mark: ");
//        byte sub5 = in.nextByte();
//
//        float percent = (sub1+sub2+sub3+sub4+sub5)/5;
//        System.out.print("Percentage scored = ");
//        System.out.println(percent);
//    }
//}
// Taking input from the user
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        // here sc is object name.
//        // System.in reads the input from the keyboard
//        System.out.println("Begin");
//
//        boolean a = sc.hasNextInt();
//        System.out.println(a);
//
//        int num2 = sc.nextInt();
//        boolean b = sc.hasNextInt();
//        System.out.println(b);
//        System.out.println(num2);

//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        String s1 = "Hey Dharam";
//        System.out.println(s1); // prints whatever mentioned in bracket and a new line
//        System.out.println("Hello World");
//    }
//}