import java.util.Scanner;
//class Batsman {
//   String name;  // Attribute 1 / Property 1
//    int match;  // Attribute 2
//
//    public void printDetail() {
//        System.out.println("The name of the batsman is " + name + ".\nMatches played = " + match);
//    }
//
//}
//class Employee {
//    String name;
//    int salary;
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setName() {
//        Scanner setN = new Scanner(System.in);
//        System.out.print("Enter Your Name: ");
//        name = setN.nextLine();
//    }
//
//    public String getName() {
//        return name;
//    }
//}

//class Circle {
//    private float radius;
//
//    public void setRadius(float rad) {
//        radius = rad;
//    }
//    public float getRadius() {
//        return radius;
//    }
//}

class Book {
    private String author;
    int bookNo;

    public Book() {
        System.out.println("Hello");
    }
    public Book(String name) {
        author = name;
    }
    public Book(String name, int no) {
        author = name;
        bookNo = no;
    }
}
public class firstClass {
        public static void main(String[] args) {
            Book c = new Book("Dharam",1); // 3rd Book Constructor will be invoked immediately

//            Circle c1 = new Circle();
//            c1.radius = 3.32f; // --> will throw error since we are trying to access radius through the object directly.
//            c1.setRadius(3.32f);
//            System.out.println(c1.getRadius());

//            Employee emp1 = new Employee();
//            emp1.salary = 150000;
//            emp1.setName();
//            System.out.println("Employee name is: " + emp1.getName());
//            System.out.println("Employee salary is: " + emp1.getSalary());

//        className objName = new className();
//        Batsman bat1 = new Batsman();
//        bat1.name = "Dharam";
//        bat1.match = 34;
//        bat1.printDetail();
        }
}
