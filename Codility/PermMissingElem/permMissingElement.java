public class permMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 2, 3, 1, 5 };
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
		/* The summation of the array with the missing element should be
		 * based on the summation rule. Now the we now the range is from 1..N
		 * where N is the length of the array + 1 because we have a missing element
		 */

		int length = A.length +1;
		long arraySum = length * (length+1) / 2;
		long currentSum = 0;
		for (int i : A) {
			currentSum += i;
		}
		return (int) (arraySum - currentSum);
	}

}
