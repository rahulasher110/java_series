/*
 
 Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.

Input Format :
3 integers - S, E and W respectively

Output Format :
Fahrenheit to Celsius conversion table. One line for every Fahrenheit and Celsius Fahrenheit value. Fahrenheit value and its corresponding Celsius value should be separate by tab ("\t")

Constraints :
0 <= S <= 1000
0 <= E <= 1000
0 <= W <= 1000

Sample Input 1:
0 
100 
20

Sample Output 1:
0   -17
20  -6
40  4
60  15
80  26
100 37
 
 
 */


package functionAndScope;

import java.util.Scanner;

public class FarehneitToCelsius {
	
	public static void printFarehneitToCelsiusTable(int start, int end, int step) {
		for(int i = start; i<=end; i += step) {
			int celsius = 1;
			
			celsius = (i - 32) * 5 / 9;
			
			System.out.println(i + " " + celsius);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int startF, endF, stepSize;
		
		startF = s.nextInt();
		
		endF = s.nextInt();
		
		stepSize = s.nextInt();
		
		printFarehneitToCelsiusTable(startF, endF, stepSize);

	}

}
