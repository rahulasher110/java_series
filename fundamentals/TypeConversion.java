package fundamentals;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'a';
		int i = ch; // type casting success
		
//		ch = i; // not possible
		ch = (char)i; // its possible
		
		ch = (char)(ch + 1); // its possible
		
		System.out.println(i);
		
		short s = 12;
		int a = s;
		
		s = (short)a; // type casting
		System.out.println(s);
		
		float f = (float)10.5;
		
		int val = (int)10.4;

	}

}
