package Arrays;

public class PrimitiveAndNonPrimitives {
	
	public static void printArray(int[] arr) {
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public static void incrementArray(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			arr[i] = arr[i] + 1;
		}
	}
	
	public static int[] passReference(int[] input) {
		
		input = new int[10];
		
		for(int i = 0 ; i<input.length; i++) {
			input[i] += 1;
		}
		
		return input;
	}
	
	public static void increment(int n) {
		n++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		
		increment(n);
		
		System.out.println(n);
		
		int[] arr = {1,2,3,4,5};
		
		incrementArray(arr);
		
		printArray(arr);
		
		System.out.println("");
		
		arr = passReference(arr);
		
		printArray(arr);

	}

}
