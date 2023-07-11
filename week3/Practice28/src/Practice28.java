
public class Practice28 {

	public static void main(String[] args) {
		Person p1 = new Person("김동덕", 22, "서울시");
		Person p2 = new Person("홍길동", 30);
		Person p3 = new Person("성춘향");
		p2.setAddr("제주시");
		p3.setAge(16);
		p3.setAddr("남원시");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}

}
