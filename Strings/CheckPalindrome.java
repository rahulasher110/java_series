package Strings;

import java.util.Scanner;

public class CheckPalindrome {
	
	public static boolean checkPalindrome(String str) {
		
		for(int i=0, j=str.length()-1; i<j;) {
			
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			else {
				i++;
				j--;
			}
			
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String str;
		str = s.next();
		
		boolean res = checkPalindrome(str);
		
		System.out.println(res);

	}

}
