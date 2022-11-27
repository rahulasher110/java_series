package fundamentals;

import java.util.Scanner;

public class LargestOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int a, b;
		a = s.nextInt();
		b = s.nextInt();
		
		if(a > b) {
			System.out.println("a is greater then b");
		}
		else {
			if(b > a) {
				System.out.println("b is greater then a");
			}
			else {
				System.out.println("both are eqaul");
			}
		}

	}

}
