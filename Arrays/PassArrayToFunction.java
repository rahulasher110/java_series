package Arrays;

import java.util.Scanner;

public class PassArrayToFunction {
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		
		
		int n;
		n = s.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = takeInput();
		
		printArray(arr);

	}

}
