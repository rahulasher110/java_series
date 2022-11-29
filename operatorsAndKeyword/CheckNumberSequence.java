/*
 
 You are given S, a sequence of n integers i.e. S = s1, s2, ..., sn. Compute if it is possible to split S into two parts : s1, s2, ..., si and si+1, si+2, ….., sn (0 <= i <= n) in such a way that the first part is strictly decreasing while the second is strictly increasing one.
Note : We say that x is strictly larger than y when x > y.
So, a strictly increasing sequence can be 1 4 8. However, 1 4 4 is NOT a strictly increasing sequence.


That is, in the sequence if numbers are decreasing, they can start increasing at one point. Thereafter, they cannot decrease at any point further.
Sequence made up of only increasing numbers or only decreasing numbers is a valid sequence. So, in both the cases, print true.


You just need to print true/false. No need to split the sequence.

Input format :
Line 1 : Integer 'n'
Line 2 and Onwards : 'n' integers on 'n' lines(single integer on each line)

Output Format :
"true" or "false" (without quotes)
 
 
 */


package operatorsAndKeyword;

import java.util.Scanner;

public class CheckNumberSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		
		
		int arr[] = new int[n];
		
		for(int i = 0; i<n ; i++) {
			// taking input
			arr[i] = s.nextInt();
		}
		
		boolean isDecreasing = false;
		boolean isIncreasing = false;
		
		if(n > 3) {
			for(int i = 0; i<n-1 ; i++) {
				
				if(arr[i] > arr[i+1]) {
					if(isDecreasing && isIncreasing) {
						System.out.println("false");
						isDecreasing = false;
						isIncreasing = false;
						break;
					}
					isDecreasing = true;
				}
				else if(arr[i] < arr[i + 1]) {
					if(isDecreasing && isIncreasing) {
						System.out.println("false");
						isDecreasing = false;
						isIncreasing = false;
						break;
					}
					isIncreasing = true;
				}
				else {
					System.out.println("false");
					isDecreasing = false;
					isIncreasing = false;
					break;
				}
				
			}
			
			if(isDecreasing) {
				System.out.println("true");
			}
			
			if(isIncreasing) {
				System.out.println("true");
			}
		}
		else if(n == 1 || n == 2 || n == 3 ){
			System.out.println("true");
		}
		
	}

}
