
public class Person implements Speakable{
	int age;
	String name;
	
	public Person(String name, int age) { this.name = name; this.age = age; }
	public void speak() {
		if (this.age < 2)
			System.out.println("응애");
		else
			System.out.println("안녕");
	}
}
