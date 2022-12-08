package TwoDimensionalArray;

import java.util.Scanner;

public class InputAndOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int rows;
		rows = s.nextInt();
		
		int cols;
		cols = s.nextInt();
		
		int arr[][] = new int[rows][cols];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		
		

	}

}
