package functionAndScope;

import java.util.Scanner;

public class FunctionCallnCr {
	
	public static int factorial(int n) {
		int fact = 1;
		
		for(int i = 1; i<=n ; i++) {
			fact = fact * i;
		}
		
		return fact;
	}
	
	
	public static int nCr(int n, int r) {
		
		int factN = factorial(n);
		int factR = factorial(r);
		int factNr = factorial(n - r);
		
		int result = factN / (factR * factNr);
		
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n, r;
		n = s.nextInt();
		r = s.nextInt();
		
		int result = nCr(n , r);
		
		System.out.println(result);

	}

}
