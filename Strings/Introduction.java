// string is a collection of characters

package Strings;

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to store collection of characters we have 2 ways
		
		int arr[] = {'r', 'a', 'h', 'u', 'l'}; // primitive data type
		String str = "rahul";  // non primitve data type and it is a wrapper of character array
		
		System.out.println(str.length());

		
		System.out.println(str.charAt(0));
		
		str = "";
		System.out.println(str.length());
		
		str = " ";
		System.out.println(str.length());
		
		// in java we cannot use str[i]  , insteadof this we use str.charAt(i)
		
		
		
		// concatination two string
		
		String str1 = "rahul";
		String str2 = " kumar";
		
		str1 += str2;
		System.out.println(str1);
		
		str = str1.concat(str2);
		System.out.println(str);
		
		
		// two string are equal or not
		
		System.out.println(str1.equals(str2));
		
		String str4 = " kumar";
		System.out.println(str2.equals(str4));
		
		System.out.println(str2.contains("kum"));
		
		System.out.println(str2.compareTo(str4));  // compare ascii values
		
		System.out.println(str1.compareTo(str2)); // compare each ascii values
		
		String a ="abcd";
		String b="abcda";
		System.out.println(a.compareTo(b));
		
		
		System.out.println(str1.substring(2));
		
		String str5 = str1.substring(2, 5);
		System.out.println(str5);
		System.out.println(str5.length());
		
		String str6="coding";
		for(int i=2;i<4;i++)
		{
		    System.out.print(str6.substring(i));
		}
		
		System.out.println("");
		
		String str7="coding";
		for(int i=2;i<5;i++)
		{
		    System.out.print(str7.substring(i-2,i+1));
		}
 	}

}
