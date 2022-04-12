package lesson5;

import java.io.IOException;

public class ExceptionTEst {
	static void error(int err) throws Exception, Throwable {
		switch (err) {
			case 0 : throw new RuntimeException("Runtime..."); 
			case 1 : throw new Exception("EXception...");
			case 2 : throw new Throwable("Throwable...");
			default :
		}
	}
	
	static void nestedError(int err) throws Throwable {
		try {
			error(err);
		} catch (Exception e) {
			System.err.println("Nested exception: "+e.getMessage());
		} finally {
			System.err.println("Nested FINALLY");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throwable	t = new Throwable("Shit happens...");
		
		t.printStackTrace();
		
		for (int index = 0; index <= 3; index++) {
			try {
				nestedError(index);
				System.err.println("Success");
			} catch (RuntimeException exc) {
				System.err.println("Runtime detected: "+exc.getMessage());
			} catch (Exception exc) {
				System.err.println("Exception detected: "+exc.getMessage());
			} catch (Throwable exc) {
				System.err.println("Throwable detected: "+exc.getMessage());
				exc.printStackTrace();
			} finally {
				System.err.println("FINALLY");
			}
		}
		
	}

}
