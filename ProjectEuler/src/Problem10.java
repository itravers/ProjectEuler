import java.util.ArrayList;

/**
 * Summation of primes
 * Problem 10
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * @author Isaac Assegai
 */
public class Problem10 {
	public static void main(String[] args){
		long limit = 2000000;
		ArrayList primes = getPrimes(limit);
		long sum = sumSet(primes);
		System.out.println("Answer: " + sum);
	}
	
	private static long sumSet(ArrayList primes) {
		long sum = 0;
		for(int i = 0; i < primes.size(); i++){
			sum += (int)primes.get(i);
		}
		return sum;
	}

	private static ArrayList getPrimes(long limit) {
		ArrayList primes = new ArrayList();
		for(long i = 0; i < limit; i++){
			if(isPrime(i)) primes.add(i);
		}
		return primes;
	}

	static boolean isPrime(long n) {
	    if(n < 2) return false;
	    if(n == 2 || n == 3) return true;
	    if(n%2 == 0 || n%3 == 0) return false;
	    long sqrtN = (long)Math.sqrt(n)+1;
	    for(long i = 6L; i <= sqrtN; i += 6) {
	        if(n%(i-1) == 0 || n%(i+1) == 0) return false;
	    }
	    return true;
	}
}
