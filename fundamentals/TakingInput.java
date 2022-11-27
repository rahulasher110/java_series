package fundamentals;

import java.util.Scanner;

public class TakingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		
//		int a, b;
//		
//		a = s.nextInt();
//		b = s.nextInt();
//		
//		int c = a + b;
//		System.out.println(c);
//		
//		double d;
//		d = s.nextDouble();
////		s.nextLong();
		
		String str;
//		str = s.next();  read only one word in a sentence
		
//		System.out.println(str);
		
		str = s.nextLine();
		System.out.println(str);
		
		char ch = str.charAt(0);
		
		System.out.println(ch);
		
		String str1 = s.next();
		int a = s.nextInt();
		System.out.print(str1 + " " + a);

		

	}

}
