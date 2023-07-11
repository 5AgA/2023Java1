
public class Practice29 {

	public static void main(String[] args) {
		Student s1 = new Student("김동덕", 20132468, "컴퓨터학");
		Student s2 = new Student("홍길동", 20111234);
		Student s3 = new Student("성춘향");
		
		s1.setAge(22);
		s1.setAddr("서울시");
		s2.setAge(30);
		s2.setAddr("제주시");
		s2.setMajor("컴퓨터학");
		s3.setAge(16);
		s3.setAddr("남원시");
		s3.setSid(20121357);
		s3.setMajor("국문학");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s1.printSafely());
		System.out.println(s2.printSafely());
		System.out.println(s3.printSafely());
	}

}
