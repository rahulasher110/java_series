/*
 
 Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
    totalSalary = basic + hra + da + allow – pf
where :
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic.
 
 */

package fundamentals;

import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner s = new Scanner(System.in);
		
		int basicSalary;
		basicSalary = s.nextInt();
		
		char ch;
		ch = s.next().charAt(0);
		
		double totalSalary = 0;
		double hra = (double)(20 * basicSalary) / 100;
		System.out.println(hra);
		double da = (double)(50 * basicSalary) / 100;
		System.out.println(da);
		
		double pf = (double)(11 * basicSalary) / 100;
		System.out.println(pf);
		
		int allow = 0;
		
		if(ch == 'A') {
			allow = 1700;
		}
		else if(ch == 'B') {
			allow = 1500;
		}
		else {
			allow = 1300;
		}
		
		totalSalary = (basicSalary + hra + da + allow - pf);
		System.out.println(totalSalary);
		
		System.out.println((int)Math.round(totalSalary));
		

	}

}
