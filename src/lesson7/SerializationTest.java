package lesson7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerializationTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		try(final OutputStream	os = new FileOutputStream("c:/temp/z.txt");
			final ObjectOutputStream oos = new ObjectOutputStream(os)) {
			
			oos.writeInt(123);
			oos.writeDouble(0.5);
			final Human	h = new Human("ivanov","ivan","ivanovich",21);
			
			oos.writeObject(h);
			oos.reset();
			oos.writeObject(h);
		}
		
		try(final InputStream	is = new FileInputStream("c:/temp/z.txt");
			final ObjectInputStream ois = new ObjectInputStream(is)) {

			System.err.println(ois.readInt());
			System.err.println(ois.readDouble());
			Object	obj1 = ois.readObject();
			Object	obj2 = ois.readObject();
			
			System.err.println(obj1);
			System.err.println(obj2);
			System.err.println(obj1.equals(obj2));
			
		}
	}
}
