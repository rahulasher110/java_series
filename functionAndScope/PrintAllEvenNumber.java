package functionAndScope;

import java.util.Scanner;

public class PrintAllEvenNumber {
	
	public static void printEvenNumber(int start, int end) {
		for(int i = start; i<= end; i += 2) {
			if(i%2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int startNumber, endNumber;
		startNumber = s.nextInt();
		
		endNumber = s.nextInt();
		
		
		printEvenNumber(startNumber, endNumber);
		

	}

}
