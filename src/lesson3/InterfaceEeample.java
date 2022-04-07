package lesson3;

public class InterfaceEeample implements Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callPrint(new InterfaceEeample());
		callPrint(new MyExampleClass());
	}

	public static void callPrint(Example e) {
		e.print(100);
	}
	
	@Override
	public void print(int x) {
		System.err.println("x="+x);
	}

	public void aaa() {
		// lkjkljklj
	}
}

interface Example {
	void print(int x);
	default void zzz() {
		// DO nothing
	}
	static void assa() {
		// ldf;ld
	}
}

class MyExampleClass implements Example {

	@Override
	public void print(int x) {
		System.err.println("aslkasjdkjaslkdjklasdjlk"+x);
	}
	
}