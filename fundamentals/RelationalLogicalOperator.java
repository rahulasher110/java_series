package fundamentals;

public class RelationalLogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0, b = 20;
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(10 > 10);
		System.out.println(10 == 10);
		System.out.println(10 != 10);
		System.out.println(a >= b);
		System.out.println(a <= b);
		
		System.out.println(10 > 20 && 10 < 20);

		// and operator 
		/*
		 
		 true && true = true
		 true && false = false
		 false && true = false
		 false && false = false
		 
		 */
		
		// or operator
		
		/*
		 
		 true || true = true
		 true || false = true
		 false || true = true
		 false || false = false
		 
		 */
		
		// not operator
		
		/*
		 
		 !true = false
		 !false = true
		 
		 */
		byte bs = 50;
		bs = (byte)(bs * 50);
		System.out.println(bs);
		 double as = 6 / 4;
	        int bb  = 6 / 4;
	        double c = as + bb;
	        System.out.println(c);
	        
	        double ad = 55.5;
	        int bd = 55;
	        ad = ad % 10;
	        bd = bd % 10;
	        System.out.println(ad + " "  + bd);

	}

}
