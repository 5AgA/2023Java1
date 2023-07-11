import java.util.Scanner;
public class Practice18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("배열의 길이: ");
		n = sc.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("배열에 저장된 숫자: ");
		printArray(arr);
		
		System.out.print("찾고 싶은 숫자를 입력하세요: ");
		int key;
		key = sc.nextInt();
		int idx = searchArray(arr, key);
		
		if (idx == -1)
		{
			System.out.println("입력한 숫자 " + key + "는 배열에 없습니다.");
		}
		else
		{
			System.out.println("입력한 숫자 " + key + "는 배열의 " +
					idx + "번 자리에 있습니다.");
		}
		
		sc.close();
	}
	
	public static int searchArray(int[] array, int key)
	{
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == key)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void printArray(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + "     ");
		}
		System.out.print("\n");
	}
}
