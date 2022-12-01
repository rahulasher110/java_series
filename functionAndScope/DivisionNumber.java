package functionAndScope;

import java.util.Scanner;

public class DivisionNumber {
	
//	public static int divisionNumber(int num1, int num2) {
//		if(num2 == 0) {
//			return Integer.MIN_VALUE;
//		}
//		
//		return num1 / num2;
//	}
	
	
	public static void divisionNumber(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("invalid division");
			return;
		}
		
		System.out.println(num1 / num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int num1, num2;
		num1 = s.nextInt();
		num2 = s.nextInt();
		
//		System.out.println(divisionNumber(num1, num2));
		
		divisionNumber(num1, num2);

	}

}
