public class Duplicate {
  public static void main(String[] args) {
  
  System.out.println("Result: " + checkDuplicate());
  }

  public static int[] checkDuplicate(int[] array) {

     int count = 0;

     int[] array = {9, 5, 1, 9, 4, 5, 1, 7};

     int[] newArray = new int[array.length];

     for(int index = 0; index < array.length; index++) {
	     boolean isSeen = false;
        for(int indexx = 0; indexx < index; indexx++) {
	   if(array[index] == array[indexx]) {
		   isSeen = true;
		   break;
	   }
	}

	if(!isSeen) {
	   count++;
	}
	int ind = 0;
	for(int index = 0; index < array.length; index++) {
	   boolean isSeen = false;
	   for(int indexx = 0; indexx < index; indexx++) {
	      if(array[index] == array[indexx]) {
	         isSeen = true;
	      }
	   }

	   if(!isSeen) {
	      newArray[ind] = array[index];
	      ind++;
	   }
	}
	return newArray;
     }
  }
}//class
