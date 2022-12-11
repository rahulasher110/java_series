package Strings;

import java.util.Scanner;

public class ReverseEachWord {
	
	public static String reverseEachWord(String str) {
		String str1 = "";
		int currentWordStartIndex = 0;
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) == ' ') {
				
				// reverse current word
				int currentWordEndIndex = i-1;
				
				String reverse = "";
				
				for(int j=currentWordStartIndex; j<=currentWordEndIndex; j++) {
					reverse = str.charAt(j) + reverse;
				}
				
				// add it to the final string str1
				
				str1 += reverse + " ";
				
				currentWordStartIndex = i+1;
				
			}
			
		}
		
		// but last word cannot reverse
		
		String reverse = "";
		for(int j=currentWordStartIndex; j<str.length(); j++) {
			reverse = str.charAt(j) + reverse;
		}
		
		str1 += reverse;
		
		return str1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String str;
		str = s.nextLine();
		
		String result = reverseEachWord(str);
		
		System.out.println(result);

	}

}
