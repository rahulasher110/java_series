package Recursion;

public class SumOfNNaturalNumber {
	
	public static int sum(int n) {
		
		if(n == 0) {
			return 0;
		}
		
		int smallOutput = sum(n - 1);
		int output = n + smallOutput;
		
		
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(10));

	}

}
