package TwoDimensionalArray;

public class Store2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 		      address
		 			
		 		      500  ---->>>    0  1  2  3
		 			
	arr2d  -> 300 --> 600  ---->>>    4  5  6  7
	 		
		 		      700  ---->>>    8  9  10  11
		 				
		 					
		 */
		
		int[][] arr = {
				{0, 1, 2, 3},
				{4, 5, 6, 7},
				{8, 9, 10, 11}
		};
		
		System.out.println(arr);  //300 
		System.out.println(arr[0]);  //  500
		System.out.println(arr[1]); // 600 
		System.out.println(arr[2]);  // 600 
		
		System.out.println(arr.length);  // 3  number of rows
		
		System.out.println(arr[0].length);  // 4 number of cols

	}

}
