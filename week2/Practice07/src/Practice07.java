
public class Practice07 {

	public static void main(String[] args) {
		
		int i = 0;
		String num = "0";
		while (i < 10)
		{
			System.out.println(num);
			i++;
			num += Integer.toString(i);
		}

	}

}
