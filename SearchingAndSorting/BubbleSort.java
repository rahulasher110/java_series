package SearchingAndSorting;

import java.util.Scanner;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr) {
		
		for(int i = 0; i<arr.length-1; i++) {
			
			for(int j=0; j<arr.length-1-i; j++) {
				
				if(arr[j] > arr[j+1]) {
					// swap
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
				// do nothing
			}
			
			
		}
		for(int k=0; k<arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		System.out.println("");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s =  new Scanner(System.in);
		
		int t;
		t = s.nextInt();
		
		int i = 1;
		
		while(i <= t) {
			
			int n;
			n = s.nextInt();
			
			int arr[] = new int[n];
			
			for(int j = 0; j<n; j++) {
				arr[j] = s.nextInt();
			}
			
			bubbleSort(arr);
			
			i++;
		}

	}

}
