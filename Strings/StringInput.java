package Strings;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String str;
		str = s.next();  // rahul kumar  .. 
		
		// s.next() will return the next token and in this case delimeter -->> space
		
		// various delimeter are space, tab, newLine
		
		System.out.println(str + " " + str.length());  // rahul 5
		
		
		str = s.nextLine(); // rahul kumar
		
		System.out.println(str + " " + str.length()); // kumar 6  becasue after s.next only kumar left
		
//		int i = s.nextInt();
		
		String str1 = s.nextLine();
		System.out.println(str1 + " " + str1.length());
		
		String str4=s.next();
		String str2=s.nextLine();
		String str3=str2+str4;
		System.out.println(str3);

	}

}
