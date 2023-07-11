
public class Practice33 {

	public static void main(String[] args) {
		Student p1 = new Student("홍길동", 20111234, "컴퓨터학");
		Student p2 = new Student("성춘향", 20121357, "국문학");
		Student p3 = new Student("성춘향", 20121357, "국문학");
		Student p4 = p1;  // 가리키는 곳이 같음
		
		p1.setAge(22);
		p1.setAddr("서울시");
		p2.setAge(30);
		p2.setAddr("제주시");
		p3.setAge(16);
		p3.setAddr("남원시");
		
		System.out.println("객체 p1의 정보");
		System.out.println(p1.printSafely() + "\n");
		System.out.println("객체 p2의 정보");
		System.out.println(p2.printSafely() + "\n");
		System.out.println("객체 p3의 정보");
		System.out.println(p3.printSafely() + "\n");
		System.out.println("객체 p4의 정보");
		System.out.println(p4.printSafely() + "\n");
		
		printInfo(p1, p2);
		printInfo(p2, p2);
		printInfo(p2, p3);
		printInfo(p1, p4);
	}
	
	public static void printInfo(Student sa, Student sb) {
		if (sa == sb)
		{
			System.out.println("같은 객체");
		}
		else if (sa != sb && sa.isTheSame(sb) == true)
		{
			System.out.println("다른 객체/같은 학번");
		}
		else
		{
			System.out.println("다른 객체/다른 학번");
		}
	}
}
