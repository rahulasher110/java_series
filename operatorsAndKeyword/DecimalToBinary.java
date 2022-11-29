/*
 
 Given a decimal number (integer N), convert it into binary and print.
The binary number should be in the form of an integer.
Note: The given input number could be large, so the corresponding binary number can exceed the integer range. So you may want to take the answer as long for CPP and Java.


Note for C++ coders: Do not use the inbuilt implementation of "pow" function. The implementation of that function is done for 'double's and it may fail when used for 'int's, 'long's, or 'long long's. Implement your own "pow" function to work for non-float data types.


Input format :
Integer N

Output format :
Corresponding Binary number (long)
 
 
 */


package operatorsAndKeyword;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		int arr[] = new int[100];
		
		int binaryNumberIndex = 0;
		
		while(n > 0) {
			
			int rem = n % 2;
			
			arr[binaryNumberIndex] = rem;
			
			n = n / 2;
			binaryNumberIndex++;
			
		}
		
//		System.out.println(arr[0]); // it print the address of an array
		
		for(int i = binaryNumberIndex-1 ; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		
	}

}
