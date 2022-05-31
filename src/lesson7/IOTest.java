package lesson7;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;

public class IOTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		java.lang.AutoCloseable a;
		java.io.Closeable c;
		byte[] temp = null;
		
		
		try(final Duration	d = new Duration();
			final OutputStream os = new ByteArrayOutputStream();//new FileOutputStream("c:/temp/test.txt");
			final PrintStream ps = new PrintStream(os)) {
			
			ps.println("test string"/*.getBytes()*/);
			ps.flush();
			temp = ((ByteArrayOutputStream)os).toByteArray();
		} // finally {os.close();}
		// java.lang.AutoCloseable
		//
		byte[]	buffer = new byte[100];
		char[]	bufferC = new char[100];
		
		try(final InputStream is = new ByteArrayInputStream(temp);//new FileInputStream("c:/temp/test.txt");
			final Reader rdr = new InputStreamReader(is);
			final BufferedReader brdr = new BufferedReader(rdr)) {
			int	len;
			
//			while ((len = rdr.read(bufferC)) > 0) {
//				System.err.println("Len: "+len);
//				System.err.println("Data="+new String(buffer,0,len));
//			}
			String line;
			
			while ((line = brdr.readLine()) != null) {
				System.err.println("Data="+line);
			}
		}
	}

}

class Duration implements AutoCloseable {
	private final long	startTime = System.currentTimeMillis();
	
	public Duration() {	
	}

	@Override
	public void close() throws RuntimeException {
		// TODO Auto-generated method stub
		System.err.println("Duration="+(System.currentTimeMillis()-startTime));
	}
}
