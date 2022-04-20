import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode.
     */
     
    Scanner input = new Scanner(System.in);
    int numberInput = input.nextInt();

    int[] numArray = new int[numberInput];
    
    for (int x = 0; x < numArray.length; x++) {
      int numArrInp = input.nextInt();
      numArray[x] = numArrInp;
    }

    int currentNum = 0;
    int mode = 0;
    int count = 0;
    int modeCount = 0;

    // Loop through array
    for (int i = 0; i < numArray.length; i++) {
      
      // Select one number and compare with the rest in       the array
      currentNum = numArray[i];

      for (int y = 0; y < numArray.length; y++) {
        if (currentNum == numArray[y]) {

          count++;
        }  
      }
      
      if (count > modeCount) {
        mode = currentNum;
        modeCount = count;
      }
      count = 0;
    }
    System.out.println(mode);
  }
}
