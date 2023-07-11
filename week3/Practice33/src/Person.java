
public class Person {
	private String name;
	private int age;
	private String address;
	
	public void setName(String name) { this.name = name; }
	public void setAge(int age) { this.age = age; }
	public void setAddr(String address) { this.address = address; }
	public String getName() { return this.name; }
	public int getAge() { return this.age; }
	public String getAddr() { return this.address; }
	
	public Person() { this("모름", -1, "모름"); }
	public Person(String name) { this(name, -1, "모름"); }
	public Person(String name, int age) { this(name, age, "모름"); }
	public Person(String name, int age, String address) { setName(name); setAge(age); setAddr(address); }
	
	public String toString() {
		String ret = "";
		
		ret += "이름: " + getName() + ", ";
		ret += "나이: " + getAge() + ", ";
		ret += "주소: " + getAddr();
		
		return ret;
	}
}
