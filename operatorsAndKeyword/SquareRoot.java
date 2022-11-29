/*
 
 Given a number N, find its square root. You need to find and print only the integral part of square root of N.
For eg. if number given is 18, answer is 4.

Input format :
Integer N

Output Format :
Square root of N (integer part only)
 
 */

package operatorsAndKeyword;
import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		int squareRootOfANumber = 1;
		
		int i = 2;
		
		if(n == 0) {
			System.out.println(0);
		}
		else if(n == 1 || n == 2 || n == 3) {
			System.out.println(squareRootOfANumber);
		}
		else {
			
			while(i <= n) {
				 
				if(i * i <= n) {
					squareRootOfANumber = i;
					i++;
				}else {
					break;
				}
				
			}
			System.out.println(squareRootOfANumber);
		}
		
		
//		System.out.println(squareRootOfANumber);

	}

}
