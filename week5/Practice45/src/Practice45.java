import java.util.Scanner;

public class Practice45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size, type;
		
		System.out.print("배열의 크기:");
		size = sc.nextInt();
		
		Student[] sArray = new Student[size];
		
		for (int i = 0 ; i < size; i++) {
			System.out.print((i+1) + "번 학생 타입 (1-학생/2-학부생/3-대학원생):");
			type = sc.nextInt();
			switch(type) {
			case 1 :
				System.out.print("학생 정보 입력:");
				sArray[i] = new Student(sc.nextInt(), sc.nextInt(), sc.nextDouble());
				break;
			case 2:
				System.out.print("학부생 정보 입력:");
				sArray[i] = new UndergraduateStudent(sc.nextInt(), sc.nextInt(), sc.nextDouble(), sc.nextInt());
				break;
			case 3:
				System.out.print("대학원생 정보 입력:");
				sArray[i] = new GraduateStudent(sc.nextInt(), sc.nextInt(), sc.nextDouble(), sc.next());
				break;
			}
			System.out.println("");
		}
		printAll(sArray);
		sc.close();
	}
	public static void printAll(Student[] s) {
		System.out.println("입력된 정보입니다.");
		for (Student student : s) {
			System.out.println(student.toString());
		}
	}
}
