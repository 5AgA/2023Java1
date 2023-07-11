
public class Practice39 {

	public static void main(String[] args) {
		Student[] studentList = new Student[3];
		studentList[0] = new Student("홍길동", 20111234, "컴퓨터학");
		studentList[1] = new Student("성춘향", 20121357, "국문학");
		studentList[2] = new Student("이몽룡", 20101357, "컴퓨터학");
		
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "번 학생의 정보\n" + studentList[i].printSafely() + "\n");
		}
		
		System.out.print("\"" + studentList[0].getName() + "\"학생은 \"" + studentList[1].getName()
				+ "\"학생과 ");
		if (studentList[0].equalsMajor(studentList[1]) == true) {
			System.out.print("전공은 같고, ");
		}
		else {
			System.out.print("전공은 다르고, ");
		}
		int isS = studentList[0].isSenior(studentList[1]);
		if (isS == -1) {
			System.out.println("학번은 빠릅니다.");
		}
		else if (isS == 0) {
			System.out.println("학번은 같습니다.");
		}
		else if (isS == 1) {
			System.out.println("학번은 느립니다.");
		}
		// ***************************************************************************************
		System.out.print("\"" + studentList[0].getName() + "\"학생은 \"" + studentList[2].getName()
				+ "\"학생과 ");
		if (studentList[0].equalsMajor(studentList[2]) == true) {
			System.out.print("전공은 같고, ");
		}
		else {
			System.out.print("전공은 다르고, ");
		}
		isS = studentList[0].isSenior(studentList[2]);
		if (isS == -1) {
			System.out.println("학번은 빠릅니다.");
		}
		else if (isS == 0) {
			System.out.println("학번은 같습니다.");
		}
		else if (isS == 1) {
			System.out.println("학번은 느립니다.");
		}
	}

}
