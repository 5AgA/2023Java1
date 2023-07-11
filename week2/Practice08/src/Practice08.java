import java.util.Random;

public class Practice08 {

	public static void main(String[] args) {
		
		int[] numbers = new int[10];
		Random rg = new Random();
	
		for (int j = 0; j < 10; j++)
		{
			System.out.println("(" + (j + 1) + "차 실행)");
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = rg.nextInt(100);
				System.out.print(numbers[i] + " ");
			}
			System.out.println(" ");
			
		}

	}

}
