package SearchingAndSorting;

import java.util.Scanner;

public class InsertionSort {
	
	public static void insertionSort(int[] arr) {
		
		
		for(int i = 1; i<arr.length; i++) {
			
			int j = i-1;
			int temp = arr[i];
			
			while(j >=0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = temp;
		}
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
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
			
			for(int j =0; j<n; j++) {
				arr[j] = s.nextInt();
			}
			
			insertionSort(arr);
			
			i++;
		}

	}

}
