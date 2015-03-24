import java.util.Arrays;

public class Euler {

  public static void main(String[] args) {
      // TODO Auto-generated method stub
      int[][] triangle = {
          {75},
          {95,64},
          {17,47,82},
          {18,35,87,10},
          {20,04,82,47,65},
          {19,01,23,75,03,34},
          {88,02,77,73,07,63,67},
          {99,65,04,28,06,16,70,92},
          {41,41,26,56,83,40,80,70,33},
          {41,48,72,33,47,32,37,16,94,29},
          {53,71,44,65,25,43,91,52,97,51,14},
          {70,11,33,28,77,73,17,78,39,68,17,57},
          {91,71,52,38,17,14,91,43,58,50,27,29,48},
          {63,66,04,68,89,53,67,30,73,16,69,87,40,31},
          {04,62,98,27,23,9,70,98,73,93,38,53,60,04,23}};
      System.out.println(solution(triangle));
  }

 public static int solution(int[][] n) {
     /* How about we start from the bottom
      * A value has to be chosen if either its the only value (aka root node) or if if it is the maximum of points under a previously selected value
      * We check the maximums of every element with its exact match in the row before and the element in the row before+1
      */

     // check as long as we have elements in the array
     while (n.length > 1) {
         int numberOfRows = n.length;
         // We chose the start row to be the one before so that we dont have indexOutOfBounds when checking with i+1
         int[] startRow = n[numberOfRows-2];
         int[] endRow = n[numberOfRows-1];
         // The temp array will be of the same size as the starting array
         int[] temp = new int[startRow.length];

         for (int i=0; i< startRow.length; i++) {
             // the value will be the max of start[i] + end[i] or start[i] + end[i+1]
             temp[i] = Math.max((startRow[i] + endRow[i]), (startRow[i] + endRow[i+1]));
         }

         // remove the last two elements of the array because we already checked them
         System.out.println(Arrays.toString(temp));
         // we need to remove the last two rows now, well we remove one and substitute the other with the new temp containing the sums
         n = Arrays.copyOf(n, n.length-1);
         n[n.length-1] = temp;
     }
     return n[0][0];
   }

}