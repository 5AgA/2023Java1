import java.util.Scanner;

public class Practice59 {
    // 여기에 필요한 코드를 추가하세요.
    public static String getInput(Scanner s) throws InvalidInputException {
		String input = s.next();
        
		if (input.equals("가위") || input.equals("바위") || input.equals("보"))
            return input;
        throw(new InvalidInputException());
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
    
    public static void main(String[] args) {
    // 여기에 필요한 코드를 작성하세요.  
		String c, p;
        int rslt;
		Scanner sc = new Scanner(System.in);
		
        try {
            c = getInput(sc);
            p = getInput(sc);
            rslt = whoswin(c, p);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
            return;
        }
        
		if ( rslt == 0) {
			System.out.println("비겼습니다.");
		}
		else if (rslt == -1) {
			System.out.println("컴퓨터가 이겼습니다.");
		}
		else if (rslt == 1) {
			System.out.println("당신이 이겼습니다.");
		}
		sc.close();
    }
}