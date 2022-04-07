package lesson4;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

class Ex1 {
	int		x = 100;
	int		y = 200;
	
	void print(int zzz) {
		System.err.println("ZZZ="+zzz);
	}
}

public class Example {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		System.err.println("Sum1: "+sum(new Ex1()));	//SUm1: 300
		System.err.println("Sum2: "+sum(new Ex2()));	//SUm2: 600
		callPrint(new Ex1());
		callPrint(new Ex2());
	}

	public static void callPrint(Object obj) {
		// find print(int.class) and call it with all the int fields from class
		for(Class cl = obj.getClass(); cl != null; cl = cl.getSuperclass()) {
			for (Method m : cl.getDeclaredMethods()) {
				if ("print".equals(m.getName()) 
					&&
					Arrays.deepEquals(m.getParameterTypes(), new Class[]{int.class})) {
					// kllkjlkjlkjkjjjjkl
				}
			}
		}
	}
	
	
	public static int sum(Object obj) throws IllegalArgumentException, IllegalAccessException {
		// TODO: find all integer fields and calculate it's sum
		int 	sum = 0;
		
		for(Class cl = obj.getClass(); cl != null; cl = cl.getSuperclass()) {
			for (Field f: cl.getDeclaredFields()) {
				if (f.getType() == int.class) {
					f.setAccessible(true);
					sum += f.getInt(obj);
				}
			}
		}
		return sum;
	}
}



class Ex2 extends Ex1 {
	int		z = 300;
}