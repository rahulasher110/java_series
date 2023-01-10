/*
 You are given an integer array, arr, of size N and a positive integer K. Out of all subarrays of 'arr' of size K, find the sum of the subarray that has the maximum sum.
Input format:
The first line of the input contains two space-separated integers, N and K
The second line contains N space-separated integers which represent the elements of the array, arr
Output format:
The output only consists of a single integer, the sum of the subarray that has the maximum sum
Constraints:
1 <= N <= 10^6
1 <= K <= N
Time limit: 1 sec 
Sample Input 1:
4 1
1 2 3 4
Sample Output 1:
4
Sample Input 2:
6 2
2 7 3 6 7 7 
Sample Output 2:
14
Explanation for Sample Output 2:
There are 5 subarrays of size 2 in this array. They are {2, 7}, {7, 3}, {3, 6}, {6, 7}, {7, 7}. Since the subarray {7, 7} has the maximum sum among all the subarrays, the output will be 7 + 7 = 14
 */

package TimeComplexity;

import java.util.Scanner;

public class FindMaxSubarraySum {
	
	public static int maxSum(int arr[], int n, int k)
    {
        if (n < k)
        {
           return -1;
        }
      
        // Compute sum of first window of size k
        int res = 0;
        for (int i=0; i<k; i++)
           res += arr[i];
      
        // Compute sums of remaining windows by
        // removing first element of previous
        // window and adding last element of
        // current window.
        int curr_sum = res;
        for (int i=k; i<n; i++)
        {
           curr_sum += arr[i] - arr[i-k];
           res = Math.max(res, curr_sum);
        }
      
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n, k;
		n = s.nextInt();
		k = s.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		
		System.out.println(maxSum(arr, n, k));

	}

}
