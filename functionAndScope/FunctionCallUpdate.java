package functionAndScope;

import java.util.Scanner;

public class FunctionCallUpdate {
	
	public static int functionCall(int n) {
		return ++n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		n = functionCall(n);
		
		System.out.println(n);

	}

}
