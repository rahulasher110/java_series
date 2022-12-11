package Strings;

import java.util.*;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 
		 String immutable means we cannot change the content of the string
		 
		 */
		
		String str = "abc";
		
//		str.setCharAt(0) = 'd'; // this gives an error because string is immutable
		
		/*
		 
		 but why we cannot change the content of the string
		 
		 because it is doing memory optimization in string pool but java cannot change the content of string
		 
		 */
		
		str = str + "def"; // this doesn't give an error because we cannot change the content of string
		str = "xyz"; // this also doesn't give an error because we cannot chnage the content of the string, instead we initialize the new value to the variable
		System.out.println(str);
		
		String str1 = "abc";
		String str2 = str1 + "";
		System.out.println(str1 == str2);

	}

}
