/*
 
 You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left).
 Note:
Change in the input array/list itself. You don't need to return or print the elements.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.

Third line contains the value of 'D' by which the array/list needs to be rotated.
Output Format :
For each test case, print the rotated array/list in a row separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^4
0 <= N <= 10^6
0 <= D <= N
Time Limit: 1 sec
Sample Input 1:
1
7
1 2 3 4 5 6 7
2
Sample Output 1:
3 4 5 6 7 1 2
Sample Input 2:
2
7
1 2 3 4 5 6 7
0
4
1 2 3 4
2
Sample Output 2:
1 2 3 4 5 6 7
3 4 1 2
 
 */

package SearchingAndSorting;

import java.util.Scanner;

public class RotateArray {
	
	public static void reverse(int[] arr, int high, int low) {
		
		while(low<high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
		
	}
	
	public static void rotate(int[] arr, int d) {
		
//		O(n^2) // brute approach
		
//		while(d>0) {
//			int temp = arr[0];
//			int i;
//			for(i=1; i<arr.length; i++) {
//				
//				arr[i-1] = arr[i];
//				
//			}
//			arr[i-1] = temp;
//			d--;
//		}
		
		// best approach 
		// reverse 0 to d element and after d+1 to n element
		// then reverse the whole array
		
		int low = 0;
		int high = d-1;
				
		reverse(arr, high, low);
		
		low = d;
		high = arr.length-1;
		
		reverse(arr, high, low);
		
		low = 0;
		high = arr.length - 1;
		
		reverse(arr, high, low);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int t;
		t = s.nextInt();
		
		int i = 1;
		while(i<=t) {
			
			int n;
			n = s.nextInt();
			
			int arr[] = new int[n];
			
			for(int j=0;j<n;j++) {
				arr[j] = s.nextInt();
			}
			
			int d;
			d = s.nextInt();
			
			rotate(arr, d);
			
			i++;
		}

	}

}
