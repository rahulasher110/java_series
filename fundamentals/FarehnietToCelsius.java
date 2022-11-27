/*
 
 Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
Input Format :
3 integers - S, E and W respectively 
Output Format :
Fahrenheit to Celsius conversion table. One line for every Fahrenheit and corresponding Celsius value in integer form. The Fahrenheit value and its corresponding Celsius value should be separate by single space.
 
 
 */


package fundamentals;

import java.util.Scanner;

public class FarehnietToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int startF, endF, stepF;
		startF = s.nextInt();
		endF = s.nextInt();
		stepF = s.nextInt();
		
		
		
		
		while(startF <= endF) {
			
			int celsiusVal = ((startF - 32) * 5) / 9;
			
			System.out.println(startF + " " + celsiusVal);
			
			
			startF = startF + stepF;
		}

	}

}
