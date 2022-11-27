package fundamentals;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		int div = 2;
		
		while(div < n) {
			
			if(n % div == 0) {
				System.out.println("composite");
				break;
			}
			
			div++;
			
		}
		
		if(div == n) {
			System.out.println("prime");
		}

	}

}
