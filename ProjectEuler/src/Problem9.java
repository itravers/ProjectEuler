/**
 * Special Pythagorean triplet
 * Problem 9
 * A Pythagorean triplet is a set of three natural 
 * numbers, a < b < c, for which, a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 * @author Isaac Assegai
 */
public class Problem9 {
	public static void main(String [] args){
		int goalNum = 1000;
		long product = findPythagoreanTripletProduct(goalNum);
		System.out.println("Answer: " + product);
	}

	private static long findPythagoreanTripletProduct(int goalNum) {
		long product = 0;
		for(int a = 0; a <= 1000; a++){
			for(int b = (a+1); b <= goalNum; b++){
				for(int c = (b+1); c <= goalNum; c++){
					if(((a+b+c)) == goalNum  && ((a*a)+(b*b) == (c*c))){
						product = a*b*c;
					}
				}
			}
		}
		return product;
	}
}
