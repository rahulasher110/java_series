package Strings;

import java.util.Scanner;

public class ReverseString {
	
	public static String reverseString(String str) {
		
		String reversedString = "";
//		for(int i=str.length()-1; i>=0; i--) {
//			reversedString += str.charAt(i);
//		}
//		
//		return reversedString;
//		
		
		for(int i=0; i<str.length(); i++) {
			
			reversedString = str.charAt(i) + reversedString;
			
		}
		
		return reversedString;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String str;
		str = s.next();
		String res = reverseString(str);
		System.out.println(res);

	}

}
