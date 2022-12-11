package Strings;
import java.util.Scanner;

public class ReverseSentence {
	
	public static String reverseSentence(String str) {
		
		String ans = "";
		
		int currentStartIndex = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			String reverse = "";
			if(str.charAt(i) == ' ') {
				
				int currentEndIndex = i-1;
				
				for(int j=currentStartIndex; j<=currentEndIndex; j++) {
					
					reverse += str.charAt(j);
					
				}
				
				currentStartIndex = i+1;
				ans = reverse + ' ' + ans;
				
			}
			
			
			
		}
		
		String word = "";
		for(int i=currentStartIndex; i<str.length(); i++) {
			word += str.charAt(i);
		}
		
		ans = word + ' ' + ans;
		
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String str;
		str = s.nextLine();
		
		String result = reverseSentence(str);
		
		System.out.println(result);
		
	}

}
