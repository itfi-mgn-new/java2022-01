package lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		Thread	t = new Thread(()->callServer());
		t.setDaemon(true);
		t.start();
		
		try(final Socket		sock = new Socket("localhost",2000);
			final OutputStream	os = sock.getOutputStream();
			final PrintStream	ps = new PrintStream(os);
			final InputStream	is = sock.getInputStream();
			final Reader		rdr = new InputStreamReader(is);
			final BufferedReader	brdr = new BufferedReader(rdr)) {
			
			ps.println("test string");
			ps.flush();
			System.out.println("Send");
			System.out.println("Receive "+brdr.readLine());
			System.in.read();
		}
	}

	private static void callServer() {
		try(final ServerSocket 	ss = new ServerSocket(2000)) {
			
			try(final Socket		s = ss.accept();
				final InputStream	is = s.getInputStream();
				final Reader		rdr = new InputStreamReader(is);
				final BufferedReader	brdr = new BufferedReader(rdr);
				final OutputStream	os = s.getOutputStream();
				final PrintStream	ps = new PrintStream(os)) {
				
				System.err.println("port="+s.getLocalPort());
				String	line;
				
				while ((line = brdr.readLine()) != null) {
					System.err.println("Line server="+line);
					ps.println(line.toUpperCase());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
