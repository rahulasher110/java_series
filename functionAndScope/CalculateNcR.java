/*
 
 Calculate NcR
 
 nCr = n! / r! * (n - r)!
 n! = 1 * 2 * 3 * ........... * n ;
 r! = 1 * 2 * 3 ........... r;
 
 */

package functionAndScope;

import java.util.Scanner;

public class CalculateNcR {
	
	public static int factorial(int num) {
		int factN = 1;
		for(int i = 1; i<=num ;i++) {
			factN = factN * i;
		}
		return factN;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n, r;
		
		n = s.nextInt();
		
		r = s.nextInt();
		
		int factN = factorial(n);
		int factR = factorial(r);
		int factNr = factorial(n - r);
				
		int result = factN / ( factR * factNr );
		
		System.out.println(result);
	}

}
