//컴퓨터학과 20220783 오은아
import java.util.Scanner;

public class Practice20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int num : arr) {
			System.out.print(num + "     ");
		}
		System.out.println("");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[(arr.length - i - 1)] + "     ");
		}
		System.out.println("");
		
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		System.out.println("총합: " + sum);
		
		double avg = 0;
		for (int num : arr) {
			avg += (double)num / (double)arr.length;
		}
		System.out.println("평균: " + String.format("%.2f", avg));
		
		sc.close();
	}

}
