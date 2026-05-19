public class TaskTwo {
 public static void main(String[] args) {

   java.util.Scanner inputCollector = new java.util.Scanner(System.in);
   
   System.out.print("Enter Age: ");
   int age = inputCollector.nextInt();

   int age_in_five_years = age * 5;

   System.out.println("You'd be " + age_in_five_years + " in five years time");
 }
}
