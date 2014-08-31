import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Largest palindrome product
 * Problem 4
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.

 * @author Isaac Assegai
 *
 */
public class Problem4 {
	 ArrayList palindromeList;
	public static void main(String[] args){
		new Problem4();
		
	}
	
	public Problem4(){
		palindromeList = new ArrayList();
		int a = 999;
		int b = 999;
		if(isPalindrome(a, b)){
			
		}
		Collections.sort(palindromeList);
		System.out.println("Answer: " + palindromeList.get(palindromeList.size()-1));
		
	}
	
	 boolean isPalindrome(int a, int b){
		boolean returnVal = false;
		//System.out.println(a + " + " + b + " = " + (a*b));
		if(isPalindrome(a*b)){
			
			returnVal = true;
		}else{
			for(int i = 999; i > 0; i--){
				for(int j = 999; j > 0; j--){
					if(isPalindrome(i*j)){
						//System.out.println("PalinDrome: " + (i*j));
						palindromeList.add(i*j);
						
					}
				}
				
			}
		}
		//System.out.println( " : " + returnVal);
		return returnVal;
	}
	
	 boolean isPalindrome(int x) {
	    if (x < 0)
	        return false;
	    int div = 1;
	    while (x / div >= 10) {
	        div *= 10;
	    }
	    while (x != 0) {
	        int l = x / div;
	        int r = x % 10;
	        if (l != r)
	            return false;
	        x = (x % div) / 10;
	        div /= 100;
	    }
	    
	    return true;
	}
}
