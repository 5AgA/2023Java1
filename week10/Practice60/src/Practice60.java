import java.util.Scanner;

public class Practice60 {
    // 여기에 필요한 코드를 추가하세요.
    public static String getInput(Scanner s) throws InvalidInputException {
		String input = s.next();
        
		if (input.equals("가위") || input.equals("바위") || input.equals("보"))
            return input;
        throw(new InvalidInputException());
    }
    
    public static String getValidInput(Scanner s) {
        String str;    
        while(true) {
        	try {
        		str = getInput(s);
        		return str;
        	} catch (InvalidInputException e) {
        		System.out.println(e.getMessage());
        		continue;
        	}
        }
    }
    
	public static int whoswin(String com, String you)
	{
        int c = -1, p = -1;
        String[] value = {"가위", "바위", "보"};
		
		for (int i = 0; i < value.length; i++) {
			if (value[i].equals(com)) {
				c = i;
			}
            if (value[i].equals(you)) {
                p = i;
            }
		}
        
		if (c > p) {
			if (c - p == 2) {
				return 1;
			}
			return -1;
		}
		else if (c < p) {
			if (p - c == 2) {
				return -1;
			}
			return 1;
		}
		return 0;
	}
    
    // 메인 메소드를 변경하지 마세요.
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String com = getValidInput(sc);
		String you = getValidInput(sc);

		switch (whoswin(com, you))  {
			case 0 : System.out.println("비겼습니다."); break;
			case 1 : System.out.println("당신이 이겼습니다."); break;
			case -1 : System.out.println("컴퓨터가 이겼습니다.");
		}

		sc.close();
    }
}

// 여기에 사용자 예외를 정의하세요. 
@SuppressWarnings("serial")

class InvalidInputException extends Exception {
    public InvalidInputException() {
        super("잘못된 입력입니다.");
    }
}