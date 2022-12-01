package Arrays;

import java.util.Scanner;

public class LinearSearch {
	
	public static int linearSearch(int[] arr) {
		Scanner s = new Scanner(System.in);
		
		int x;
		x = s.nextInt();
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
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
		
		int index = linearSearch(arr);

	}

}
