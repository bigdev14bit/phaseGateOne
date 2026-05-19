public class TaskTwo {
  public static void main(String[] args) {

  java.util.Scanner inputCollector = new java.util.Scanner(System.in);

  System.out.print("Enter Number: ");
  int userInput = inputCollector.nextInt();

  for(int index = 1; index < 13; index++) {
    System.out.println(userInput + " x " + index + " = " + (userInput * index));
  }
  }
}
