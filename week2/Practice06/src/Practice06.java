
public class Practice06 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 6; i++)
		{
			for (int j = 2; j < 6; j++)
			{
				System.out.print(j + " * " + i + " = " + (i * j) + "     ");
				if (j == 5)
				{
					System.out.print("\n");
				}
			}
			
		}
		System.out.print("\n");
		for (int i = 1; i < 6; i++)
		{
			for (int j = 6; j < 10; j++)
			{
				System.out.print(j + " * " + i + " = " + (i * j) + "     ");
				if (j == 9)
				{
					System.out.print("\n");
				}
			}
			
		}

	}

}
