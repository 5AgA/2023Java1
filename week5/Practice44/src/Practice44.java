import java.util.Scanner;

public class Practice44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 정보 입력:");
		Student s = new Student(sc.nextInt(), sc.nextInt(), sc.nextDouble());
		System.out.print("학부생 정보 입력:");
		UndergraduateStudent u = new UndergraduateStudent(sc.nextInt(), sc.nextInt(), sc.nextDouble(), sc.nextInt());
		System.out.print("대학원생 정보 입력:");
		GraduateStudent g = new GraduateStudent(sc.nextInt(), sc.nextInt(), sc.nextDouble(), sc.next());
		System.out.println("");
		
		System.out.println("입력된 정보입니다.");
		System.out.println(s.toString());
		System.out.println(u.toString());
		System.out.println(g.toString());
		
		sc.close();
	}
}
