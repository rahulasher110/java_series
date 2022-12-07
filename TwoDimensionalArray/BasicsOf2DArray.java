package TwoDimensionalArray;

import java.util.Scanner;

public class BasicsOf2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int[][] arr = new int[3][4];
		
		arr[1][2] = 2;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
