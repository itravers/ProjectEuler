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
		System.out.println(getArea(5, 5, 6));
	}
	
	public static double getArea(int a, int b, int c){
		double s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
}


