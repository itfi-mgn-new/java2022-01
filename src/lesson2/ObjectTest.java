package lesson2;

import	java.util.Arrays;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object	x = new Object();
		System.err.println(x.toString());

		int[]	a1 = null, 
				a2 = new int[10], 
				a3 = new int[] {2,3,4},
				a4 = /*new int[]*/{5,6,7,8},
				a5 = a2.clone();
		
		a1 = new int[20];
		a2[0] = 100;
		System.err.println("a5[0]="+a5[0]);
		
		int[][]	b1 = new int[][] {new int[] {2,3}, null, new int[] {4}},
				b2 = new int[4][];
	
		Object[]	oo;
		
		System.err.println("a5:"+Arrays.toString(a5));
	}
}
