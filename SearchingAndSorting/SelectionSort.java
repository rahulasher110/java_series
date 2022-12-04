package SearchingAndSorting;

import java.util.Scanner;

public class SelectionSort {
	
	public static void selectionSort(int[] arr) {
				
		for(int i=0; i<arr.length; i++) {
			
			int min = arr[i];
			int index = i;
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(min > arr[j]) {
					min = arr[j];
					index = j;
				}
				
			}
			
			// now i got the minimum value
			
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
						
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
		
		while(i <= t) {
			
			int n;
			n = s.nextInt();
			
			int arr[] = new int[n];
			
			for(int j = 0; j<n; j++) {
				arr[j] = s.nextInt();
			}
			
			selectionSort(arr);
			
			i++;
		}

	}

}
