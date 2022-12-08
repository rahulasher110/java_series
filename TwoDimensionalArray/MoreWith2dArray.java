package TwoDimensionalArray;

public class MoreWith2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = new int[3][4];
		
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<4; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		
		
		arr = new int[4][];
		
		System.out.println(arr);
		
		for(int i=0; i<4; i++) {
			System.out.println(arr[i]); // null
		}
		
//		System.out.println(arr[2].length);
		
//		System.out.println(arr[0][0]); // null pointer exception
		
		// in primitive data type we get 
		/*
		 
		  int - 0
		  double - 0.0
		  char - /0
		 
		 */
		
		// but in case of non primitive data type we get null
		
		for(int i=0; i<4; i++) {
			arr[i] = new int[4];
		}
		
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<4; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		// jacked arrays
		for(int i=0; i<4; i++) {
			arr[i] = new int[i+2];
		}
		
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
