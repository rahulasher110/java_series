package Strings;

import java.util.Scanner;

public class PrintAllSubstrings {
	
	public static void printSubstrings(String str) {
		
//		for(int i=0; i<str.length(); i++) {
//			
//			String str1 = "";
//			
//			for(int j=i; j<str.length(); j++) {
//				str1 += str.charAt(j);
//				System.out.println(str1);
//			}
//			
//		}
		
		
		for(int i=0; i<str.length(); i++) {
			
			for(int j=i; j<str.length(); j++) {
				
				System.out.println(str.substring(i, j+1));
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String str;
		str = s.next();
		
		printSubstrings(str);

	}

}
