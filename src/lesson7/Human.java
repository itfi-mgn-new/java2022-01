package lesson7;

import java.io.Serializable;

public class Human implements Serializable {
	private static final long serialVersionUID = -1997093011393477630L;

	transient Object	obj = new Object();
	String	family;
	String	name;
	String	patroName;
	int		age;
	
	public Human(String family, String name, String patroName, int age) {
		this.family = family;
		this.name = name;
		this.patroName = patroName;
		this.age = age;
		System.err.println("Created");
	}

	@Override
	public String toString() {
		return "Human [family=" + family + ", name=" + name + ", patroName=" + patroName + ", age=" + age + "]";
	}
}
