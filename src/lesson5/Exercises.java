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
	}

	public static Object concat(Object... arrays) {
		// TODO:
	}
}