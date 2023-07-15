class BaseClass {
    BaseClass() {
        System.out.println("Cons with 0 para.");
    }
    BaseClass(int x) {
        System.out.println("Cons with 1 para.");
    }
}
class DerivedClass extends BaseClass {
    DerivedClass() {
        super(5); // BaseClass with 1 para will be called due to super keyword.
        System.out.println("Derived: Cons with 0 para.");
    }
    DerivedClass(int a, int b) {
        // BaseClass with 0 para will be called by default.
        System.out.println("Derived: Cons with 2 para.");
    }
}
class A{
    public void meth1(){ // I will be called, if object is created from Class A
        System.out.println("I am method 1 of class A");
    }
}

class B extends A{
    @Override
    public void meth1(){  // I will be called, if object is created from Class B
        System.out.println("I am method 1 of class B");
    }


}
public class Inheritance {
    public static void main(String[] args) {
//        DerivedClass d1 = new DerivedClass(); // 1. BaseClass with 1 para due to super keyword--> 2. Derived class with 0 para
//        DerivedClass d2 = new DerivedClass(5,34); // 1. BaseClass with 0 para by default --> 2. Derived class with 2 para.

        A a = new A();
        a.meth1();

        B b = new B();
        b.meth1();
    }
}
abstract class Parent2{
    public Parent2(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}