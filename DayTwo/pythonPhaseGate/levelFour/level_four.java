public class LevelFour {
  public static void main(String[] args) {
  
  System.out.print("Adding two numbers: 2, 22");
  System.out.println("Result: " + add(2, 22));

  System.out.println("\nChecking if number: 17, is even or odd.");
  System.out.println("Result: " + checkEven(17));

  System.out.print("Checking the largest in 30, 20, 10");
  System.out.println("Largest number:",findLargest(30, 20, 10));

  System.out.println("Reverse letter");
  System.out.println(countLetter(letters));
  }

  public static int add(int firstNumber, int secondNumber) {
	  return firstNumber + secondNumber;
  }

  public static int checkEven(int firstNumber) {
	  if(firstNumber % 2 == 0) {
	    return "Even Number";
	  } else {
	      return "Odd Number";
	  }
  }

  public static int findLargest(int firstNumber, int secondNumber, int thirdNumber) {
	 largest = firstNumber
         if secondNumber > largest:
             largest = secondNumber;
         if thirdNumber > largest:
             largest = thirdNumber;
         else:
             largest = firstNumber;
         return largest;
  }

  public static int countLetter(letters) {
	 reverse = " ";
         letters = "ololo";

         for(letter : letters) 
         reverse = reverse + letter;
         System.out.println("Result:",reverse);
         System.out.println(reverseLetter(letters));
  } 
}//class
