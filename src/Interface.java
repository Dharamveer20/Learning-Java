import java.sql.SQLOutput;

//class hey {
//    public int a;
//}
//interface Bowler{
//     default void setMatches(int m) {};
//     void setWickets(int w);
//};
//interface BowlerBatStat{
//    void setRuns(int r);
//    float average(float a);
//}
//
//class Ishant extends hey implements Bowler,BowlerBatStat {
//    public int m,w;
//    public float runs;
//    @Override
//    public void setMatches(int m) {
//        this.m = m;
//    }
//    @Override
//    public void setWickets(int w){
//        this.w = w;
//        a = 10;
//
//    }
//    public void setRuns(int r) {
//        runs = r;
//    }
//    public float average(float a) {
//        return a;
//    }
//
//    public void printStat() {
//        System.out.printf("Matches Played = %d. Wickets taken = %d. a = %d", m,w,a);
//    }
//}
interface greetComp {
    void gInNonIndLang();
    private void gHindi() {
        System.out.println("Hindi: Namaskar.");
    }
    private void gGujrati(){
        System.out.println("Gujrati: KhemCho.");
    }
    default void gInIndLang(){
        System.out.println("Greeting in Indian Language");
        gHindi();
        gGujrati();
    }
}
class Greeting implements greetComp{
    public void gInNonIndLang() {
        System.out.println("\nGreeting in Non Indian Language");
        System.out.println("English: Hello");
        System.out.println("Japanese: Konichiwa");
        System.out.println("Chinise: Ni hao");
    }
}
public class Interface {
    public static void main(String[] args) {
        Greeting greet = new Greeting();
        greet.gInIndLang();
        greet.gInNonIndLang();
//        Ishant p1 = new Ishant();
//        p1.setMatches(102);
//        p1.setWickets(398);
//        p1.printStat();
    }
}
