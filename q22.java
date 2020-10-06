import java.util.Arrays;
import java.util.Collections;
class q22 {
 
  public static void main(String[] args) {
    // int Array
    Integer[] intArray = new Integer[] {
        new Integer(15),
        new Integer(9),
        new Integer(16),
        new Integer(2),
        new Integer(30),
		 new Integer(25),
        new Integer(19),
        new Integer(164),
        new Integer(22),
        new Integer(300),
		
    };

    // Sorting int Array in descending order
    Arrays.sort(intArray, Collections.reverseOrder());
 
    // Displaying elements of int Array
    System.out.println("Int Array Elements in reverse order:");
    for (int i = 0; i < intArray.length; i++)
       System.out.println(intArray[i]);
 }
 }