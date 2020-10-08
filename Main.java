import java.util.Scanner;
/**
 *
 * @author celer7841
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
   public static void main(String[] args) {
   // create the Scanner for user input
   Scanner input = new Scanner(System.in);

   // create the array to store all the grades
   System.out.println("How many heights would you like to enter");
   int HEIGHT_NUMBER = input.nextInt();
   int[] heights = new int[HEIGHT_NUMBER];
   // get grades from the user and store them in the array
   System.out.println("Please enter the heights on separate lines");
   for(int i = 0; i < HEIGHT_NUMBER; i++){
     heights[i] = input.nextInt();



   } int total = 0;
   for(int i = 0; i < HEIGHT_NUMBER; i++){
     total = total + heights[i];
   } int average = total/HEIGHT_NUMBER;
   System.out.println("The average height is  " + average + " cm "); 
   System.out.println("The heights above average are");
   for(int i = 0; i < HEIGHT_NUMBER; i++){
     if (heights [i] > average){
      System.out.println(heights [i]);
     }
   }


 
  }
}
