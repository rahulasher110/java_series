/*
 
 Given a string S (that can contain multiple words), you need to find the word which has minimum length.
Note : If multiple words are of same length, then answer will be first minimum length word in the string.
Words are seperated by single space only.
Input Format :
String S
Output Format :
Minimum length word
Constraints :
1 <= Length of String S <= 10^5
Sample Input 1 :
this is test string
Sample Output 1 :
is
Sample Input 2 :
abc de ghihjk a uvw h j
Sample Output 2 :
a
 
 */

package TimeComplexity;

import java.util.*;

public class MinimumLengthWord {
	
	public static String minLengthWord(String str) {
		
		str = str.trim();
		
		int len = str.length();
        int si = 0, ei = 0;
        int min_length = len, min_start_index = 0;
        
        // this is the string
        while (ei <= len){
        	
            if (ei < len && str.charAt(ei) != ' ')
            {
                ei++;
            }
            else
            {
                // end of a word
                // find curr word length
                int curr_length = ei - si;
 
                if (curr_length < min_length)
                {
                    min_length = curr_length;
                    min_start_index = si;
                }
                ei++;
                si = ei;
            }
        }
        
        return str.substring(min_start_index, min_start_index+min_length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String str;
		
		str = s.nextLine();
		
		String res = minLengthWord(str);
		
		System.out.println(res);
	}

}
