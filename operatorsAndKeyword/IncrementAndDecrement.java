package operatorsAndKeyword;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		
		System.out.println(a++); // post incerment 
		System.out.println(++a); // pre increment
		
		
		System.out.println(a--); // post decrement
		System.out.println(--a); // pre decrement
		
		int b = a++;
		
		System.out.println(b);
		
		b = ++a;
		
		System.out.println(b);
		
		b = a--;
		
		System.out.println(b);
		
		b = --a;
		
		System.out.println(b);
		
		
		int c = 1, d = 3;
		
		if(c++ > 1 && d++ > 3) {
			System.out.println("inside if");
		}
		else {
			System.out.println("inside else");
		}
		
		
		System.out.println("c : " + c + " d : " + d);
		
		
		if(++c > 1 || ++d > 3) {
			System.out.println("inside if");
		}
		else {
			System.out.println("inside else");
		}
		
		
		System.out.println("c : " + c + " d : " + d);

	}

}
