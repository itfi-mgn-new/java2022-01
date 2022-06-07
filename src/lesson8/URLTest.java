package lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;

public class URLTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URI uri = URI.create("file:/c:/temp/x.txt");
		URL	url = uri.toURL();
		try(final InputStream	is = url.openStream();
			final Reader		rdr = new InputStreamReader(is);
			final BufferedReader	brdr = new BufferedReader(rdr)) {
			
			String	line;
			
			while ((line = brdr.readLine()) != null) {
				System.err.println("Line="+line);
			}
		}
		
		HttpServer server = HttpServer.create();
		server.bind(new InetSocketAddress(2000), 0);
		server.createContext("/", new EchoHandler());
		server.start();
		
		url = new URL("http://localhost:2000/test");
		try(final InputStream	is = url.openStream();
			final Reader		rdr = new InputStreamReader(is);
			final BufferedReader	brdr = new BufferedReader(rdr)) {
			
			String	line;
			
			while ((line = brdr.readLine()) != null) {
				System.err.println("Line server="+line);
			}
		}
		
		
		System.in.read();
		
		server.stop(0);
		
	}

	static class EchoHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            System.err.println("method "+exchange.getRequestMethod());
        	
        	StringBuilder builder = new StringBuilder();

            builder.append("<h1>URI: ").append(exchange.getRequestURI()).append("</h1>");

            Headers headers = exchange.getRequestHeaders();
            for (String header : headers.keySet()) {
                builder.append("<p>").append(header).append("=")
                        .append(headers.getFirst(header)).append("</p>");
            }

            byte[] bytes = builder.toString().getBytes();
            exchange.sendResponseHeaders(200, bytes.length);

            OutputStream os = exchange.getResponseBody();
            os.write(bytes);
            os.close();
        }
	}
}
