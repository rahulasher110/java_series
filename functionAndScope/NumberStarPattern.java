/*
 
 Print the following pattern for given number of rows.
Input format :

Line 1 : N (Total number of rows)

Sample Input :
   5
Sample Output :
1234554321
1234**4321
123****321
12******21
1********1
 
 */

package functionAndScope;

import java.util.Scanner;

public class NumberStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		int i = 1;
		
		while(i <= n) {
			
			// number
			int j = 1;
			while(j <= n - i + 1) {
				System.out.print(j);
				j++;
			}
			
			// star
			
			int k = 1;
			
			while(i > 1 && k < i) {
				System.out.print("*");
				k++;
			}
			
			// star
			
			int l = 1;
			
			while(i > 1 && l < i) {
				System.out.print("*");
				l++;
			}
			
			// number
			
			int m = 1;
			
			while(m <= n - i + 1) {
				System.out.print(n - m - i + 2);
				m++;
			}
			
			System.out.println("");
			
			i++;
		}

	}

}
