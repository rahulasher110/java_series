package SearchingAndSorting;

import java.util.Scanner;

public class MergeTwoSortedArrays {
	
	public static int[] merge(int[] arr1, int[] arr2) {
		
		int n1 = arr1.length;
		int n2 = arr2.length;
		int res[] = new int[n1+n2];
		
		int i=0,j=0,k=0;
		
		while(i<arr1.length && j<arr2.length) {
			
			if(arr1[i]<=arr2[j]) {
				res[k++] = arr1[i++];
			}
			else {
				res[k++] = arr2[j++];
			}
		}
		
		while(i<arr1.length) {
			res[k++] = arr1[i++];
		}
		
		while(j<arr2.length) {
			res[k++] = arr2[j++];
		}
		
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int t;
		t = s.nextInt();
		
		int i = 1;
		
		while(i<=t) {
			
			int n1;
			n1 = s.nextInt();
			
			int arr[] = new int[n1];
			
			for(int j=0; j<n1; j++) {
				arr[j] = s.nextInt();
			}
			
			int n2;
			n2 = s.nextInt();
			
			int arr1[] = new int[n2];
			
			for(int j=0; j<n2; j++) {
				arr1[j] = s.nextInt();
			}
			
			
			int res[] = merge(arr, arr1);
					
			for(int j = 0; j<res.length; j++) {
				System.out.print(res[j] + " ");
			}
			
			i++;
		}

	}

}
