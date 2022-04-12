package lesson5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReflectionTest {
	static int[]	x = {10,20,30};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class	cl = ReflectionTest.class;
		Class	xcl = x.getClass();
		
		System.err.println("Is array:"+xcl.isArray());
		System.err.println("COntains:"+xcl.getComponentType());
		System.err.println("Size: "+Array.getLength(x));
		System.err.println("x[0]="+Array.getInt(x, 0));
		Array.setInt(x,0,100);
		System.err.println("New val="+x[0]);
		int[]	y = (int[])Array.newInstance(int.class, 10);
		System.err.println("Y="+Arrays.toString(y));
	}

}
