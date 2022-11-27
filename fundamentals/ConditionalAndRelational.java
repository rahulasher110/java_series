package fundamentals;

import java.util.Scanner;

public class ConditionalAndRelational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int a, b;
		a = s.nextInt();
		b = s.nextInt();
		
		if(a > 0 && b > 0) {
			System.out.println("both is +ve");
		}
		else {
			System.out.println("both are not +ve ");
		}
		
		
		
		if(a > 0 || b > 0) {
			System.out.println("one is +ve");
		}
		else {
			System.out.println("none is +ve");
		}
		
		
		if(a == b) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("not equal");
		}
		
		
		if(a != b) {
			System.out.println("not eqaul");
		}
		else {
			System.out.println("equal");
		}
		
	
	   if(10/0 == 1)
	    {

	        System.out.println("Hello");
	    }
	    else
	    {
	        System.out.println("Hi");
	    }
	   
	   


	}

}
