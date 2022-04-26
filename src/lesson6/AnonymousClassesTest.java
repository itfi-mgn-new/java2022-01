package lesson6;

import java.util.Arrays;

public class AnonymousClassesTest {
	static int x = 10;
	
	int y = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z = 30;
		
		MyInterface mi = new MyInterface(/*z*/) {
							int t = 40;
							
							{
								System.err.println("237462347");
							}
							@Override
							public void print() {
								// TODO Auto-generated method stub
								System.err.println("Sum="+(x+z+t));
							}
					};
//		z = 40;
		Class	cl = mi.getClass();
		
		System.err.println("Name="+cl.getName());
		System.err.println("Constructors:"+Arrays.toString(cl.getDeclaredConstructors()));
//		MyInterface mi2 = new MyInterface() {
//					@Override
//					public void print() {
//						// TODO Auto-generated method stub
//						
//					}
//			};
		Object	obj = new Object() {
			{System.err.println("sdsds");
			}
		};
		
		Class	cln = MyEnum.class;
		
		System.err.println("Name="+cln.getName());
		System.err.println("Constructors"+Arrays.toString(cln.getDeclaredConstructors()));
		System.err.println("Fields: "+Arrays.toString(cln.getDeclaredFields()));
		System.err.println("COnst: "+Arrays.toString(cln.getEnumConstants()));
		MyEnum	me = MyEnum.ARAGORN;
		switch (me/*.ordinal*/) {
			case ARAGORN/*.ordinal()*/:
				break;
			case FRODO/*.ordinal()*/:
				break;
			case GANDALF/*.ordinal()*/:
				break;
			case LEGOLAS/*.ordinal()*/:
				break;
			default:
				break;
		}
		Class act = AnonymousClassesTest.class;
		
		System.err.println("MEthods: "+Arrays.toString(act.getDeclaredMethods()));
	}

	void call() {
		MyInterface mi = new MyInterface(/*this*//*z*/) {
			int t = 40;
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.err.println("Sum="+(x+y+t));
			}
		};
	}
}

interface MyInterface {
	void print();
}
