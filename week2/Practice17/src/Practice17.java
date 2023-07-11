import java.util.Scanner;
public class Practice17 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
	
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + "     ");
		}
		System.out.print("\n");
		
		for (int i = (arr.length - 1); i > -1; i--)
		{
			System.out.print(arr[i] + "     ");
		}
		System.out.print("\n");
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		System.out.println("총합: " + sum);
		
		double avg;
		int cnt;
		for (cnt = 0; cnt < arr.length; cnt++);
		avg = (double)sum / (double)cnt;
		System.out.println("평균: " + String.format("%.2f", avg));
		
		sc.close();
	}
}
