package lesson6;

import java.util.Arrays;

public class InnerClassesTest {
	static int x = 10;
	int y = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class	cl = Inner.class;
		System.err.println("Name="+cl.getName());
		System.err.println("Constr: "+Arrays.toString(cl.getDeclaredConstructors()));
		System.err.println("Fields: "+Arrays.toString(cl.getDeclaredFields()));
		InnerClassesTest	owner = new InnerClassesTest();
		Inner	inst = owner.new Inner(/*owner*/);

		Class	cls = InnerStatic.class;
		
		System.err.println("Name="+cls.getName());
		System.err.println("Canonical Name="+cls.getCanonicalName());
		System.err.println("Constr: "+Arrays.toString(cls.getDeclaredConstructors()));
		System.err.println("Fields: "+Arrays.toString(cls.getDeclaredFields()));
		
		InnerStatic is = new InnerStatic();
	}
	
	private class Inner {	// 15%
		// final InnerCLassesTest this$0
		// Inner(InnerCLassesTest owner) {
		//   this$0 = owner;
		// }
		
		int z = 30;
		
		public void print() {
			System.err.println("Sum="+(x+/*this$0.*/y+z));
		}
	}

	private static class InnerStatic {	// 85%
		// final InnerCLassesTest this$0
		// Inner(InnerCLassesTest owner) {
		//   this$0 = owner;
		// }
		
		int z = 30;
		
		public void print() {
			System.err.println("Sum="+(x+z));
		}
	}
	
}
