abstract class Greet {
    public Greet() {
        System.out.println("Use Abstract method greetInYourLang to greet in your lang.");
    }
    abstract void greetInYourLang();

}

// Creating a class (Child class) from the Abstract Class.
// We must override all the abstract Method. (Here only 1)
class Hindi extends Greet{
    @Override
    void greetInYourLang() {
        System.out.println("Namaste");
    }
}

// Creating another Abstract class (Child Class) from the Abstract Class.
abstract class Abs2 extends Greet{
   public Abs2() {
       System.out.println("I'm a Abstract Method created from Greet (Parent) Method");
   }
}
public class AbstractClass {
    public static void main(String[] args) {
        Hindi gre1 = new Hindi();
        gre1.greetInYourLang();
    }
}
