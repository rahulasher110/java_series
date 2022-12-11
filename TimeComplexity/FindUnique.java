/*
 
 You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.
 Note:
Unique element is always present in the array/list according to the given condition.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
For each test case, print the unique element present in the array.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^6

Time Limit: 1 sec
Sample Input 1:
1
7
2 3 1 6 3 6 2
Sample Output 1:
1
Sample Input 2:
2
5
2 4 7 2 7
9
1 3 1 3 6 6 7 10 7
Sample Output 2:
4
10
 
 */

package TimeComplexity;

import java.util.*;

public class FindUnique {
	
	public static int findUnique(int[] arr) {
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			
			int num = arr[i];
			
			if(hm.containsKey(num)) {
				
				int oldVal = hm.get(num);
				int newVal = oldVal + 1;
				
				hm.put(num, newVal);
				
			}
			else {
				hm.put(num, 1);
			}
			
		}
		
		int min = arr[0];
		
		for(Integer key: hm.keySet()) {
			
			if(hm.get(key) == 1) {
				min = key;
			}
			
		}
				
		return min;
		
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
			
			int res = findUnique(arr);
			
			System.out.println(res);
			
			i++;
		}

	}

}
