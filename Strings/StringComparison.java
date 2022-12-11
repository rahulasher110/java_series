package Strings;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2};
		int arr1[] = {1, 2};
		
		if(arr == arr1) {
			System.out.println("both are eqaul");
		}
		else {
			System.out.println("both are not eqaul");
		}
		
		System.out.println(arr + " " + arr1);
		
		String str = "abc";
		String str1 = "abc";
		
		if(str == str1) { // same address 
			System.out.println("both are eqaul");
		}
		else {
			System.out.println("both are not eqaul");
		}
		
		System.out.println(str + " " + str1);
		
		String str2 = new String("abc");
		
		if(str == str2) { // different address 
			System.out.println("both are eqaul");
		}
		else {
			System.out.println("both are not eqaul");
		}
		
		System.out.println(str + " " + str2);
		
		
		// to compare one string to another string use eqaul()
		
		if(str.equals(str2)) { // different address 
			System.out.println("both are eqaul");
		}
		else {
			System.out.println("both are not eqaul");
		}
		
		String str3 = "abc";
		String str4 = "";
		String str5 = " ";
		
		System.out.println(str3.contains(str4));
		System.out.println(str3.contains(str5));
	}

}
