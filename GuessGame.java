import java.util.Scanner;
public class GuessGame{
  public static void main (String[] args){
    int numToGuess = (int) (Math.random() * 100 + 1), guess = 0, numOfGuess = 0;
    boolean notCorrect = true;
    Scanner scan = new Scanner (System.in);
    System.out.println("Time to play Guessing Game!");
    do{
      System.out.println("Guess a number!(1-100)");
      guess = scan.nextInt();
      numOfGuess++;
      if(guess == numToGuess){
        notCorrect = false;
      }
      else if(guess > numToGuess){
        System.out.println("Too high");
      }
      else{
        System.out.println("Too low");
      }
    }
    while(notCorrect);
    System.out.println("well done, you win");
    System.out.println("The number of guesses required: " + numOfGuess);
  }
}

    