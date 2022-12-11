/*
 
 For a given string(str), remove all the consecutive duplicate characters.
Example:
Input String: "aaaa"
Expected Output: "a"

Input String: "aabbbcc"
Expected Output: "abc"
 Input Format:
The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
Output Format:
The only line of output prints the updated string.
Note:
You are not required to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
aabccbaa
Sample Output 1:
abcba
Sample Input 2:
xxyyzxx
Sample Output 2:
xyzx
 
 */

package Strings;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
	
	public static String removeConsecutiveDuplicates(String str) {
		
		String ans = "";
		for(int i=0; i<str.length()-1; i++) {
			
			if(str.charAt(i) == str.charAt(i+1)) {
				continue;
			}
			else {
				ans += str.charAt(i);
			}
			
		}
		
		return ans + str.charAt(str.length()-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str;
		str = s.next();
		
		String res = removeConsecutiveDuplicates(str);
		System.out.println(res);

	}

}
