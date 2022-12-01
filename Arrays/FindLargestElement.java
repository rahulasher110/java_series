package Arrays;

import java.util.Scanner;

public class FindLargestElement {
	
	public static int findMax(int[] arr) {
		int max = arr[0];
		
		for(int i = 1; i<arr.length ; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = takeInput();
		
		int max = findMax(arr);
		
		System.out.println(max);
	}

}
