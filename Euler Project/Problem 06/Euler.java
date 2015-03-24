public class Euler {

	public static void main(String[] args) {
		System.out.println(solution(100));
	}

	/*
		The problem is a trivial, summation rule can be applied first to calculate the range sum
		Iteration with o(n) to calculate squared sums
	 */
   public static long solution(int n) {
   	 // Check if the number we want to sum for is greater than zero (non negative)
	   if (n <= 0) return -1;
	   // Check if the number of element is larger than 1 or return the 1
	   if (n > 1) {
		   // int[] arr = new int[n];
		   long squaresSummation = 0;
		   long sum = (n * (n+1)) / 2;
		   for (int i=1; i<=n; i++) {
			   squaresSummation += Math.pow(i,2);
		   }
		   return (long) ((Math.pow(sum,2)) - squaresSummation);
	   } else return 1;
   }
}