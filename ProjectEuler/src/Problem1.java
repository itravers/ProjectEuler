/**
 * Multiples of 3 and 5
 * If we list all the natural numbers below 10 that 
 * are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * @author Isaac Assegai
 */
public class Problem1 {
	public static void main(String [] args){
		int sum = 0;
		for(int i = 0; i < 1000; i++){
			if(isMultipleOf3Or5(i)){
				sum += i;
			}
		}
		System.out.println("Answer: " + sum);
	}

	private static boolean isMultipleOf3Or5(int i) {
		if(i % 3 == 0 || i % 5 == 0){
			return true;
		}else{
			return false;
		}
	}
}
