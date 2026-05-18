public class NumberGuessingGame {
  public static void main(String[] args) {

    java.util.Random random = new java.util.Random();
    java.util.Scanner inputCollector = new java.util.Scanner(System.in);

    System.out.println(" ** W.E.L.C.O.M.E  T.O  N.U.M.B.E.R  G.U.E.S.S.I.N.G  ** ");
    System.out.println("Welcome To Mini Number Guessing Game.\nPick a random number between 1 to 100.\nYou have 5 attempt to guess the number.");

    while(true) {
    int numberToGuess = random.nextInt(100) + 1;

    System.out.print("\nEnter Number: ");
    int userInput = inputCollector.nextInt();
    if(userInput == -1) {
      System.out.println("Terminated");
      break;
    }

    int numberGuessed = 0;
    int numberOfAttempt = 5;
    int rating = 0;
    int correctNumber = numberToGuess;

    if(userInput < numberToGuess || userInput > 100) {
      System.out.println("Too High, Enter Number between 1 to 100");
      numberOfAttempt--;
    }
    else if(userInput == numberToGuess) {
      System.out.println("YOU WIN!!");
      break;

    } else if(userInput < numberToGuess) {
        System.out.println("Too Low");
	numberOfAttempt--;
	numberGuessed++;

    } else if(userInput > numberToGuess) {
        System.out.println("Too High");
	numberGuessed++;
	numberOfAttempt--;
    }
    System.out.println("The correct number is: " + correctNumber);
    }// end of while true braces
  }// end of main meth0d braces
}// end of class brace
