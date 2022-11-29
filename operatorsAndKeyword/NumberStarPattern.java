/*
 
 Print the following pattern for given number of rows.
Input format :
Integer N (Total number of rows)
Output Format :
Pattern in N lines
Sample Input :
   5
Sample Output :
 5432*
 543*1
 54*21
 5*321
 *4321
 
 */


package operatorsAndKeyword;

import java.util.Scanner;

public class NumberStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		int i = 1;
		
		while(i <= n) {
			
			int j = n;
			
			while(j >= 1) {
				if(j == i) {
					System.out.print("*");
				}
				else {
					System.out.print(j);
				}
				j--;
			}
			
			System.out.println("");
			
			i++;
		}
		
	}

}
