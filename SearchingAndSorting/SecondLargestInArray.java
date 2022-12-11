/*
 
 You have been given a random integer array/list(ARR) of size N. You are required to find and return the second largest element present in the array/list.
If N <= 1 or all the elements are same in the array/list then return -2147483648 or -2 ^ 31(It is the smallest value for the range of Integer)
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains an integer 'N' representing the size of the array/list.

The second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
For each test case, print the second largest in the array/list if exists, -2147483648 otherwise.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5

Time Limit: 1 sec
Sample Input 1:
1
7
2 13 4 1 3 6 28
Sample Output 1:
13
Sample Input 2:
1
5
9 3 6 2 9
Sample Output 2:
6
Sample Input 3:
2
2
6 6
4
90 8 90 5
Sample Output 3:
-2147483648
8
 
 */

package SearchingAndSorting;

import java.util.Scanner;

public class SecondLargestInArray {
	
	public static int secondLargestElement(int[] arr) {
		
		int secondLargest = Integer.MIN_VALUE;
		
		if(arr.length <= 1) {
			return secondLargest;
		}
		
		// check whether all elements are same or not
		int isSame = arr[0];
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == isSame) {
				count++;
			}
		}
		if(count == arr.length) {
			return secondLargest;
		}
		
		int firstLargest = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(firstLargest < arr[i]) {
				firstLargest = arr[i];
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == firstLargest) {
				continue;
			}
			if(arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
			
		}
		
		return secondLargest;
		
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
			
			for(int j=0; j<n; j++) {
				arr[j] = s.nextInt();
			}
			
			int res = secondLargestElement(arr);
			
			System.out.println(res);
			
			i++;
		}
		

	}

}
