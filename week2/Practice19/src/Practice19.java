import java.util.Scanner;
public class Practice19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr1[] = new int[3];
		int arr2[] = new int[3];
		System.out.print("첫번째 배열 입력: ");
		for (int i = 0; i < arr1.length; i++)
		{
			arr1[i] = sc.nextInt();			
		}
		System.out.print("두번째 배열 입력: ");
		for (int i = 0; i < arr2.length; i++)
		{
			arr2[i] = sc.nextInt();			
		}
		
		System.out.print("첫번째 배열: ");
		printArray(arr1);
		System.out.print("두번째 배열: ");
		printArray(arr2);
		
		int n1 = 0, n2 = 0;
		
		for (int i = 0; i < arr1.length; i++)
		{
			int find = searchArray(arr2, arr1[i]);
			if (i == find)
			{
				n1++;
			}
			else if (find != -1)
			{
				n2++;
			}
		}
		System.out.println("자리와 값이 모두 같은 숫자: " + n1 + "개");
		System.out.println("자리는 다르고 값만 같은 숫자: " + n2 + "개");
		
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
