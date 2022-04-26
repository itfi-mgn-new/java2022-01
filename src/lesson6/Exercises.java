package lesson6;

public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exec(/*inner class*/);
		exec(/*inner static class*/);
		exec(/*anonymous class*/);
		exec(/*lambda*/);
	}

	public static void exec(CallInterface ci) {
		ci.call(100);
	}
}

interface CallInterface {
	void call(int x);
}