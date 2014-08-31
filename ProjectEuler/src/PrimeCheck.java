
public class PrimeCheck {
	public static void main(String[] args){
		//long i = 7;
		for(long i = 0; i < 1000; i++){
			System.out.println(i + " is prime: " + isPrime(i,i-1));
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
