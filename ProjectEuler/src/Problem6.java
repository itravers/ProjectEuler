/**
 * Sum square difference
 * Problem 6
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 552 = 3025
 * Hence the difference between the sum of the squares of 
 * the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the 
 * first one hundred natural numbers and the square of the sum.
 * @author Isaac Assegai
 */
public class Problem6 {
	public static void main(String[]args){
		long sumOfSquares = getSumOfSquares();
		long squareOfSums = getSquareOfSums();
		long diff = Math.abs(sumOfSquares - squareOfSums);
		System.out.println("Answer: " + diff);
		
		
	}

	private static long getSquareOfSums() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static long getSumOfSquares() {
		// TODO Auto-generated method stub
		return 0;
	}
}
