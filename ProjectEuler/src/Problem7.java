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
		int i = 2;
		long prime = 0;
		while(nth < 10000){
			if(isPrime(i, i-1)){
				prime = i;
				nth++;
			}
			i++;
		}
		System.out.println("nth: " + nth + " prime: " + prime);
	}
	
	static boolean isPrime(long i, long i2) {
        if(i2 <= 1) {
            return true;
        }
        if(i % i2 == 0) {
            return false;
        }
        return isPrime(i, i2-1);
    }
}
