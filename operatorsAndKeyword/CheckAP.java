/*
 
 Given input consists of n numbers. Check whether those n numbers form an arithmetic progression or not. Print true or false.

Input format :
Line 1 : n
Line 2 : n numbers

Sample Input 1 :
6
2 6 10 14 18 22

Sample Output 1 :
true

Sample Input 2 :
6
2 6 10 15 19 23

Sample Output 2 :
false
 
 
 */


package operatorsAndKeyword;

import java.util.Scanner;

public class CheckAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i<n ;i++) {
			arr[i] = s.nextInt();
		}
		
		int diff = arr[1] - arr[0];
		
		boolean isAp = false;
		
		for(int i = 1; i<n-1; i++) {
			if((arr[i+1] - arr[i] == diff)) {
				isAp = true;
				continue;
			}
			else {
				isAp = false;
				System.out.println("false");
				break;
			}
			
		}
		if(isAp)
			System.out.println("true");

	}

}
