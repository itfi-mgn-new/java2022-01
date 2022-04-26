package lesson6;

public /*final*/ enum MyEnum /*extends java.lang.Enum*/{
	/*static final MyEnum */GANDALF("MAG") /*=new MyEnum('GANDALF',0)*/, 
	FRODO("DEBIL")/*=new MyEnum('FRODO',1)*/,
	LEGOLAS("ESHE ODIN ")/*=new MyEnum('LEGOLAS',2)*/,
	ARAGORN("????")/*=new MyEnum('ARAGORN',3)*/;
	
	private final String speciality;
	
	MyEnum(final String speciality) {
		this.speciality = speciality;
	}
	
	public String getSpeciality() {
		return speciality;
	}
}
