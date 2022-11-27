/*
 
 Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
1, if the character is an uppercase alphabet (A - Z)
0, if the character is a lowercase alphabet (a - z)
-1, if the character is not an alphabet
 
 */


package fundamentals;

import java.util.Scanner;

public class FindCharacterCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		char ch;
		ch = s.next().charAt(0);
		
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("1");
		}
		else if(ch >= 'a' && ch <= 'z') {
			System.out.println("0");
		}
		else {
			System.out.println("-1");
		}

	}

}
