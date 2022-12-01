package functionAndScope;

import java.util.*;

public class FunctionCall {
	
	public static int functionCall(int n) {
		return n++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		
		n = s.nextInt();
		
		int res = functionCall(n); // here value is passed not the address of a variable
		
		System.out.println(res);

	}

}
