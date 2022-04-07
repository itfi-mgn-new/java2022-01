package lesson4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionTest {
	public static int	x = 10;
	static double 		y = 100;

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
		// TODO Auto-generated method stub
		ReflectionTest	rt = new ReflectionTest();
		about(rt);
		System.err.println("--------------");
		about(new TestClass());
	}

	static void about(final Object obj) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
		Class	cl = obj.getClass();
		Class	cc = int.class;
	
		System.err.println("Type: "+cl.getName());
		System.err.println("Fields: "+Arrays.toString(cl.getDeclaredFields()));
		Field	f = cl.getDeclaredField("y");
		f.setAccessible(true);
		System.err.println("Type: "+f.getType());
		System.err.println("Value: "+f.get(obj));
		f.set(obj, 20);
		System.err.println("Y="+y);
		System.err.println("Superclass: "+cl.getSuperclass());
		
		System.err.println("Methods: "+Arrays.toString(cl.getDeclaredMethods()));
		Method	m = cl.getMethod("print", int.class);
		
		System.err.println("Parameters: "+Arrays.toString(m.getParameterTypes()));
		System.err.println("Returned value: "+m.getReturnType());
		m.invoke(obj, 123);
		
		System.err.println("Constructors: "+Arrays.toString(cl.getDeclaredConstructors()));
		Constructor	c = cl.getDeclaredConstructor();
//		ReflectionTest	instance = (ReflectionTest)c.newInstance();
		
	}
	
	public static void print(int z) {
		System.err.println("Z="+z);
	}
}


class TestClass {
	static int x = 100;
	private static int y = 200;
	
	public static void print(int z) {
		System.err.println("Another Z="+z);
	}
}