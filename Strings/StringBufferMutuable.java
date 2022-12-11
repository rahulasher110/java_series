package Strings;


public class StringBufferMutuable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 String is immutable and it is best for memory optimization
		 string is stored in stringPool
		 */
		
		/*
		 to make our string mutable we use StringBuffer and it is not good for memoryOptimization
		 StringBuffer is not stored in StringPool
		 */
		
		StringBuffer str = new StringBuffer("abc");
		
		str.setCharAt(0, 'd');
		
		str.append("rahul");
		
		System.out.println(str + " " + str.length());
		
		StringBuffer str1=new StringBuffer("");
		for(int i=0;i<5;i++)
		{
		    str1.append((char)('a'+i));
		}
		System.out.println(str1);
		

	}

}
