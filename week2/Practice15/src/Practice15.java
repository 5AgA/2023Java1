import java.util.Scanner;

public class Practice15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c, p;
		String v;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("컴퓨터의 생성: ");
			v = sc.next();
			c = searchValue(v);
			if (c == -1)
			{
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}
		} while(c == -1);
		
		do {
			System.out.print("당신의 입력: ");
			v = sc.next();
			p = searchValue(v);
			if (p == -1)
			{
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}
		} while ( p == -1);
		
		int result = whoswin(Integer.toString(c), Integer.toString(p));
		
		if ( result == 0)
		{
			System.out.println("비겼습니다.");
		}
		else if (result == -1)
		{
			System.out.println("컴퓨터가 이겼습니다.");
		}
		else if (result == 1)
		{
			System.out.println("당신이 이겼습니다.");
		}
		sc.close();
	}
	public static int searchValue(String str)
	{
		String[] value = {"가위", "바위", "보"};
		
		for (int i = 0; i < value.length; i++)
		{
			if (value[i].equals(str))
			{
				return i;
			}
		}
		return -1;
	}
	public static int whoswin(String com, String you)
	{
		int c = Integer.parseInt(com);
		int p = Integer.parseInt(you);
		if (c > p)
		{
			if (c - p == 2)
			{
				return 1;
			}
			return -1;
		}
		else if (c < p)
		{
			if (p - c == 2)
			{
				return -1;
			}
			return 1;
		}
		return 0;
	}
}
