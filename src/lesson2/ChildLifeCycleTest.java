package lesson2;

public class ChildLifeCycleTest extends LifeCycleTest {
	static final int 	x = 20;
	static final double z = Math.random();
	
	static {
		System.err.println("Child class init");
	}
	
	int 	x1 = 200;
	double 	y1 = Math.random()+100;
	
	/* public void <init>(){
	 *  java.lang.Object.<init>();
	 * 	x1 = 100;
	 *  y1 = Math.random();
	 *  System.err.println("Instance init");
	 * }
	 */
	
	{
		System.err.println("Child Instance init");
	}

	public ChildLifeCycleTest() {
		this(100);
		System.err.println("Default constructor");
	}
	
	public ChildLifeCycleTest(int x) {
		super(x);
//		 *  java.lang.Object.<init>();
//		 * 	x1 = 100;
//		 *  y1 = Math.random();
//		 *  System.err.println("hild Instance init");
		System.err.println("My child constructor");
		x1 = x;
	}
	
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Hello world: "+LifeCycleTest.x);
		
		ChildLifeCycleTest	clt = new ChildLifeCycleTest(300);
		
		System.err.println("Child instance created: "+((LifeCycleTest)clt).x1);
		
		clt.staticPrint();
		clt.print();
		clt = null;
		
		System.err.println("-------------------");
		
		LifeCycleTest	lt = new ChildLifeCycleTest(400);
		lt.staticPrint();
		lt.print();
		
	}
	
	static void staticPrint() {
		System.err.println("x="+x);
	}
	
	@Override
	void print() {
		
		System.err.println("x1="+this.x1);
		super.print();
	}

	//							this		VMT
	//	invokestatic			-			-
	//	invokevirtual			+			+
	//	invokespecial			+			-
	//	invokeinterface			+			+
	//
}
