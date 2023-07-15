import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
class Game {
   private int random;
   private int guessedNum;
   private int noOfGuess = 1;

   public Game() {
       Random rn = new Random();
       random = rn.nextInt(1,101);
//       System.out.println(random);
   }
   public void userInput() {
       System.out.printf("Enter a number: ");
       Scanner sc = new Scanner(System.in);
       guessedNum = sc.nextInt();
   }
   public int getNoOfGuessFun(int guessNo){
       return guessNo;
   }
   public void isCorrectNum() {
       if (random == guessedNum) {
           System.out.printf("Correct!\nRandom num: %d. Your num: %d.\n", random, guessedNum);
           System.out.println("No of Guess = " + getNoOfGuessFun(noOfGuess));
       }
       while (random != guessedNum) {
            if (guessedNum < random) System.out.println("Guessed Low!");
            else System.out.println("Guessed High!");
            noOfGuess++;
            userInput();
            isCorrectNum();
        }
   }
}
public class CodingChallengeClass {
    public static void main(String[] args){
        Game g1 = new Game();
        g1.userInput();
        g1.isCorrectNum();
    }
}
