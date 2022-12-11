package Strings;

public class StorageOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 
		 in java there are 2 memory system
		 1) stack
		 2) heap
		 
		 in heap there is a special memory system which is String pool , which stores the string values
		 and it is used by the Java runtime system for better memory utilization
		 
		 */
		
		String str = "abc"; // it store in string pool
		String str1 = "abc"; // it get the refernce value of "abc", so here 
							// if "abc" is already there in string pool . so it will not create a new
							// variable , instead of this it will return the address where it stored
		
		
		String str2 = new String("abc"); // this goes in heap , not int string pool
		
		System.out.println(str); // abc
		System.out.println(str1); // abc
		System.out.println(str2); // abc
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		String str4="abc";
		String str5=new String("abc");
		System.out.println(str4==str5);
		System.out.println(str4.equals(str5));

	}

}
