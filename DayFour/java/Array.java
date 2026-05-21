//a python function that takes an array integer and a integer and return------
//array number = [8, 6, 12, 4, -2] and an integer = 6
//my algorith
//loop through the array
//pick element in index 0, sum it with itself, if equals t0 (number = 6), count
//pick element in index 0, sum it with element in index 1, if equals to (number = 6), count
//till it finds it

public class Array {
  public static void main(String[] args) {
  
  System.out.println(anArray());
  }

  public static int anArray() {
    int[] array = {8, 6, 12, 4, -2};
    int number = 6;
    int result = 0

    for(int index 0; index < array.length; index++) {
       for(int indexx = 0; indexx < array.length; indexx++) {
          result = array[index] + array[indexx];
       }
       if(result == number) {
          
    }
  }
}
