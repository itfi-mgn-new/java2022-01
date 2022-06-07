package lesson8;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UDPTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Thread	t = new Thread(()->callReceiver());
		t.setDaemon(true);
		t.start();
		
		try(final DatagramSocket	ds = new DatagramSocket(2001)) {
			final byte[]			buffer = "test string".getBytes();
			final DatagramPacket	pack = new DatagramPacket(buffer, buffer.length, new InetSocketAddress("localhost",2000));
			
			ds.send(pack);
			System.out.println("Send");
		} catch (IOException e) {
		}
		
		System.in.read();
	}

	static void callReceiver() {
		try(final DatagramSocket	ds = new DatagramSocket(2000)) {
			final byte[]			buffer = new byte[100];
			final DatagramPacket	pack = new DatagramPacket(buffer, buffer.length);
			
			ds.receive(pack);
			System.err.println("Received: "+new String(buffer,0,pack.getLength()));
		} catch (IOException e) {
		}
	}
	
}
