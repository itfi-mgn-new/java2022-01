package lesson6;

import java.util.Arrays;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallInterface ci = LambdaTest::print1; // ci = print1;
		ci.print(1);
		ci = LambdaTest::call2;					// ci = call2
		ci.print(2);
		
		call((int x)->System.err.println(x));
		Class	cl = LambdaTest.class;
		System.err.println("MEthod: "+Arrays.toString(cl.getDeclaredMethods()));
	}
	
	static void call(CallInterface ci) {
		ci.print(100);
	}
	
	static void print1(int x) {
		System.err.println("Print 1");
	}

	static void call2(int y) {
		System.err.println("Call 2");
	}
}

@FunctionalInterface
interface CallInterface { // typedef void (*print)(int x);
	void print(int x);
	default void print1() {print(100);}
}


// typedef void (*print)(int x);
//
//