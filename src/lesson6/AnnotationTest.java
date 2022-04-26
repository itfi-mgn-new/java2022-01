package lesson6;

@MyAnnotation(value="test value")
public class AnnotationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class	cl = AnnotationTest.class;
		MyAnnotation	ann = (MyAnnotation)cl.getAnnotation(MyAnnotation.class);
	
		System.err.println("Value="+ann.value());
		System.err.println("Number="+ann.number());
		System.err.println("Flag="+ann.flag());
	}

}
