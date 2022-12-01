package functionAndScope;

import java.util.Scanner;

public class CheckPrimeOrNot {
	
	
	// 1st method
	
//	public static boolean checkPrime(int n) {
//		
//		int div = 2;
//		
//		while(div <= n/2) {
//			if(n % div == 0) {
//				return false;
//			}
//			div++;
//		}
//		
//		return true;
//		
//	}
	
	// 2nd method
	
	public static boolean checkPrime(int n) {
		
		int div = 2;
		
		boolean isPrime = true;
		
		while(div <= n/2) {
			if(n % div == 0) {
				isPrime = false;
			}
			div++;
		}
		
		if(isPrime)
			return true;
		else
			return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		boolean result = checkPrime(n);
		
		System.out.println(result);

	}

}
