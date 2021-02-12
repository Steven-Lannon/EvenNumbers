package evennumbers;

/**
 *
 * @author Steven
 */
public class EvenNumbers {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //loop for number from 0-100
        for(int i=0;  i<=100;  i++){ 
        //nested if for even numbers
         if (i % 2 == 0) {
        //print out all even numbers
		System.out.println(" " + i);
	   }
      
       }
    }
    
}
