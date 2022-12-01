/*
 
 Function overloading is a feature of Oops where 2 or more funcitons can have the same name but having different parameters
 
 */

package functionAndScope;

import java.util.Scanner;

public class FunctionOverloading {
	
	public static double sum(double n1, double n2) {
		return n1 + n2;
	}

	
	public static int sum(int n, int n1) {
		return n + n1;
	}

	
	public static int sum(int n) {
		return ++n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		System.out.println(sum(n));
		
		System.out.println(sum(n, 4));
		
		System.out.println(sum(10.5, 11.5));
		

	}

}
