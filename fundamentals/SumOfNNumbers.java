package fundamentals;

import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		
		   int i=10;
		   while(i>0)
		   {
		       if(i%2==0)
		       {
		           System.out.print(10-i);
		       }
		       i--;
		   }
	}

}
