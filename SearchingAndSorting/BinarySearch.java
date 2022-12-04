package SearchingAndSorting;

import java.util.Scanner;

public class BinarySearch {
	
	
	public static int binarySearch(int[] arr, int x) {
		
		int start = 0, end = arr.length - 1;
		
		while(start<=end) {
			
			int mid = (start + end) / 2;
			
			if(arr[mid] == x) {
				return mid;
			}
			else if(arr[mid] < x) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		
		int t;
		t = s.nextInt();
		
		int i = 1;
		
		while(i <= t) {
			
			int x;
			x = s.nextInt();
			
			int res = binarySearch(arr, x);
			
			System.out.println(res);
			
			i++;
		}

	}

}
