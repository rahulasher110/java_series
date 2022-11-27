package fundamentals;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n;
		n = s.nextInt();
		
		int i = 1;
		
		while(i <= n) {
			System.out.println("Hello");
			i++; 
		}
		
		
		i = 1;
		while(i <= n) {
			System.out.println(i);
			i++; 
		}


	}

}
