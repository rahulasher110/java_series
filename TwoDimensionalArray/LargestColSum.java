/*
 
 
 		
 		1  4  5
 		2  3  4
 		6  9  2
 		
 		output = 4 + 3 + 9  => 16  
 		
 		
 		
 		
 		
 
 */

package TwoDimensionalArray;

import java.util.Scanner;

public class LargestColSum {
	
	public static int largestColumnSum(int[][] arr) {
		
		int rows = arr.length;
		int cols = arr[0].length;
		
		int largest = Integer.MIN_VALUE;
		
		for(int j=0; j<cols; j++) {
			
			int sum = 0;
			
			for(int i=0; i<rows; i++) {
				
				sum += arr[i][j];
				
			}
			if(largest < sum) {
				largest = sum;
			}
			
		}
		
		return largest;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int rows;
		rows = s.nextInt();
		
		int cols;
		cols = s.nextInt();
		
		int arr[][] = new int[rows][cols];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
		int res = largestColumnSum(arr);
		
		System.out.println(res);

	}

}
