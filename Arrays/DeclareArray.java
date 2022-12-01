package Arrays;

public class DeclareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[10]; // it print 0
		
		char arr1[] = new char[10]; // it print null character element
		
		double arr2[] = new double[10]; // it print 0.0
		
		boolean arr3[] = new boolean[10];
		
		for(int i = 0; i<10 ; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("");

		for(int i = 0; i<10 ; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println("");

		for(int i = 0; i<10 ; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println("");

		for(int i = 0; i<10 ; i++) {
			System.out.print(arr3[i] + " ");
		}
	}

}
