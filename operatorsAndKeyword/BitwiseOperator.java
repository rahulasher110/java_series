package operatorsAndKeyword;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;  //    1 0 1 0  =  10
		
		int b = 2;  //     0 0 1 0  =   2
		
		
		// bitwise and
		int c = a & b; //  0 0 1 0  =   2
		
		System.out.println(c);
		
		
		
		// bitwise or
		int d = a | b; //   1 0 1 0  =  10
		
		System.out.println(d);
		
		
		
		// xor operator
		
		/*
		 
		 0 ^ 0 = 0
		 1 ^ 1 = 0
		 0 ^ 1 = 1
		 1 ^ 0 = 1
		 
		 
		 
		 */
		
		//  10  ==   1 0 1 0
		//   2  ==   0 0 1 0
//		10 ^ 2  ==   1 0 0 0  ===  8
		
		int e = a ^ b;    
		
		System.out.println(e);
		
		
		System.out.println(a ^ 0);
		
		
		
		// not operator
		
		int f = 10; // 1010
		
		System.out.println(~f);
		
		
		// left shift operator
		
		
		System.out.println(a >> 1); // 1010 --->   101
		
		System.out.println(a >> 2); // 1010  --->  10
		
		
		// right shift operator
		
		System.out.println(a << 1); // 1010  --->   10100
		
		System.out.println(a << 2); // 1010  ---->  101000
	}

}
