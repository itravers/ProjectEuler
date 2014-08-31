
public class PrimeCheck {
	public static void main(String[] args){
		for(int i = 0; i < 1000; i++){
			System.out.println("prime: " + isPrime(i,i));
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
