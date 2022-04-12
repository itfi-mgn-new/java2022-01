package lesson5;

import java.util.Arrays;

public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("X="+Arrays.toString(
				(int[])concat(new int[] {2,5}, new int[] {1,3,2})
				));	// [2,5,1,3,2]
		System.err.println("Y="+Arrays.toString(
				(double[])concat(new double[] {2.5,5.5}, 
							new double[] {1.5,3.5,2.5})
				)); // [2.5,5.5,1.5,3.5,2.5]
		System.err.println("Sum="+calc(3,'+',5));	// Sum=8
	}

	public static Object concat(Object... arrays) {
		// 1. arrays.length > 0
		// 2. No null elements inside
		// 3. All elements are arrays
		// 4. All elements has the same type
		// TODO:
	}
	
	// + - * /
	public static int calc(int x, char op, int y) {
		// TODO:
		switch (op) {
			case '+' : return x + y; 
			case '-' : return x - y; 
			case '*' : return x * y; 
			case '/' :
				if (y == 0) {
					throw new IllegalArgumentException("Attempt to divide by zero");
				}
				else {
					return x / y; 
				}
			default : 
				throw new IllegalArgumentException("Illegal op ["+op
						+"], only '+', '-', '*' and '/' are available");
		}
	}
}
