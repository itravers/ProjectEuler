/**
 * Almost equilateral triangles
 * Problem 94
 * It is easily proved that no equilateral triangle exists 
 * with integral length sides and integral area. 
 * However, the almost equilateral triangle 5-5-6 has an area of 12 square units.
 * We shall define an almost equilateral triangle to be a 
 * triangle for which two sides are equal and the third differs by no more than one unit.
 * Find the sum of the perimeters of all almost equilateral triangles with integral 
 * side lengths and area and whose perimeters do not exceed one billion (1,000,000,000).
 * @author Isaac Assegai 
 */
public class Problem94 {
	public static void main(String[] args){
		long x = 2;
		long y = 1;
		long limit = 1000000000;
		long result = 0;
		 
		while(true){
		    // b = a+1
		    long aTimes3 = 2 * x - 1;
		    long areaTimes3 = y * (x - 2);
		    if (aTimes3 > limit) break;
		 
		    if (aTimes3 > 0 &&
		        areaTimes3 > 0 &&
		        aTimes3 % 3 == 0 &&
		        areaTimes3 % 3 == 0) {
		 
		        long a = aTimes3 / 3;
		        long area = areaTimes3 / 3;
		 
		        result += 3 * a + 1;
		    }
		 
		    //b = a-1
		    aTimes3 = 2 * x + 1;
		    areaTimes3 = y * (x + 2);
		 
		    if (aTimes3 > 0 &&
		        areaTimes3 > 0 &&
		        aTimes3 % 3 == 0 &&
		        areaTimes3 % 3 == 0) {
		 
		        long a = aTimes3 / 3;
		        long area = areaTimes3 / 3;
		 
		        result += 3 * a - 1;
		    }
		 
		    long nextx = 2 * x + y * 3;
		    long nexty = y * 2 + x;
		 
		    x = nextx;
		    y = nexty;
		}
		System.out.println("Answer: " + result);
	}
	
	
	
	public static double getArea(long a, long b, long c){
		double s = (double) ((a+b+c)/2);
		
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
}


