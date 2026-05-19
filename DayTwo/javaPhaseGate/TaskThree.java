public class TaskThree {
  public static void main(String[] args) {
  
  java.util.Scanner inputCollector = new java.util.Scanner(System.in);

  System.out.print("Enter First Number: ");
  int firstNumber = inputCollector.nextInt();

  System.out.print("Enter Second Number: ");
  int secondNumber = inputCollector.nextInt();

  int sum = firstNumber + secondNumber;

  System.out.println("Sum = " + sum);
  }
}
