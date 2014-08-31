/**
 * Smallest multiple
 * Problem 5
 * 2520 is the smallest number that can be divided by 
 * each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly 
 * divisible by all of the numbers from 1 to 20?
 * @author Isaac Assegai
 */
public class Problem5 {
	public static void main(String[]args){
		int num = 0;
		boolean answerFound = false;
		while(!answerFound){
			num++;
			for(int i = 1; i < 20; i++){
				if(num % i == 0){
					answerFound = true;
				}else{
					answerFound = false;
					break;
				}
			}
		}
		if(answerFound){
			System.out.println("Answer: " + num);
		}else{
			System.out.println("No Answer Found");
		}
		
	}
}
