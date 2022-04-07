package lesson3;

public class ParametersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(10,20,30);	// print(new int[]{10,20,30});
		print(new int[]{10,20,30});
	}

	public static void print(int... x) {
		print1(x);
	}
	
	public static void print1(int[] x) {
//		print(x);
	}
	
}
