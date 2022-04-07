package lesson3;

public class InterFaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterFaceTest	it = new InterFaceTest();
		ChildInterfaceTEst	cit = new ChildInterfaceTEst();
		MyInterface mi = new ChildInterfaceTEst();
		mi = cit;
		mi = (MyInterface)it;
	}

	public void print() {
		System.err.println("print");
	}
}

class ChildInterfaceTEst extends InterFaceTest implements TotalInterface{

	@Override
	public void print2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print3() {
		// TODO Auto-generated method stub
		
	}
//	@Override
//	public void print() {
//		System.err.println("print");
//	}

	@Override
	public void print4() {
		// TODO Auto-generated method stub
		
	}
}

interface MyInterface {
	/*public static final */ int myVale = 100;
	/*public static final */ double myY = Math.random();
	/*public abstract*/ void print();
	void print4();
}

interface MyNewInterface {
	void print2();
	void print4();
}

interface TotalInterface extends MyInterface, MyNewInterface {
	// void print();
	// void print2();
	void print3();
	// void print4();
}
