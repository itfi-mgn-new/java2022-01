package lesson3;

import java.util.Arrays;

public class Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.err.println("Fibonacci(10)="+fibonacci(10));
		System.err.println("Concat="+
		Arrays.toString(concat(new int[] {2,3,4}, new int[] {1,6}))
		);
		// Concat=[2,3,4,1,6]

		System.err.println("FActorial(10)="+factorial(10));
	}

//	private static int fibonacci(int x) {
//		// TODO Auto-generated method stub
//	}
	
	private static int factorial(int x) {
		return x <= 0 ? 1 : x * factorial(x - 1);
	}
	
	private static int[] concat(int[]/*[]*/... content) {
		
		//
		int	size = 0;
		for (int[] item : content) {
			size += item.length;
		}
		
		int[]	result = new int[size];
		int		to = 0;
		
		for (int[] item : content) {
			System.arraycopy(item, 0, result, to, item.length);
			to += item.length;
//			for (int value : item) {
//				result[to++] = value;
//			}
		}
		return result;
	}

	
}
