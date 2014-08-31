/**
 * Largest prime factor
 * Problem 3
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * @author Isaac Assegai
 */
public class Problem3 {
	public static void main(String [] args){
		long num = 600851475143L;
		for(long i = 1; i < num; i++){
			//System.out.println(i);
			if(i % 100000000 == 0)System.out.println(i);
			if(num % i == 0){
				System.out.println("Factor: " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(isPrime(i, i-1)){
					System.out.println("Prime Factor: "+ i);
				}
			}
		}
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
