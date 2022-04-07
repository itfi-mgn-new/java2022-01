package lesson2;

public class LifeCycleTest {
	static final int	x = 10;			// ConstValue x<-10
	static final double	y = Math.random();

	/*static void <clinit>(){ 
	 * 	y = Math.random();
	 * 	System.err.println("Class init");
	 * }
	 * 
	 * */
	static {
		System.err.println("Class init");
	}
	
	int 	x1 = 100;
	double 	y1 = Math.random();
	
	/* public void <init>(){
	 *  java.lang.Object.<init>();
	 * 	x1 = 100;
	 *  y1 = Math.random();
	 *  System.err.println("Instance init");
	 * }
	 */
	
	{
		System.err.println("Instance init");
	}
	
	public LifeCycleTest(int value) {
//		 *  java.lang.Object.<init>();
//		 * 	x1 = 100;
//		 *  y1 = Math.random();
//		 *  System.err.println("Instance init");
		System.err.println("My constructor "+value);
		x1 = value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Hello world");
		
		LifeCycleTest	lct = new LifeCycleTest(100);
		
		System.err.println("Instance created");
		lct.staticPrint();
		lct.print();

		lct = new LifeCycleTest(200);
		lct.staticPrint();
		lct.print();	// LifeCycleTest.print(lct);
	}

	static void staticPrint() {
		System.err.println("x="+x);
	}
	
	void print(/*LifeCycleTest this*/) {
		System.err.println("x1 = "+this.x1);
	}
	
}
