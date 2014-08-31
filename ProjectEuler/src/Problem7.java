/**
 * 10001st prime
 * Problem 7
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
 * we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 * @author Isaac Assegai
 */
public class Problem7 {
	public static void main(String [] args){
		int nth = 0;
		long q = 1;
		long prime = 0;
		while(nth < 10001){
			if(isPrime(q)){
				prime = q;
				nth++;
				//System.out.println("Prime: " + prime);
			}
			q++;
		}
		System.out.println("nth: " + (nth) + " prime: " + prime);
		System.out.println("Answer: " + prime);
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
