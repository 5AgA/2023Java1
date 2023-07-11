
public class Practice22 {

	public static void main(String[] args) {
		int[][] intArray  = {
				{1, 2, 3, 4}, {10, 20, 30, 40}, {100, 200, 300, 400}
		};
		int[] colSum = new int[4];
		
		System.out.println("배열만 출력");
		for (int i = 0; i < intArray.length; i++)
		{
			for (int j = 0; j < intArray[i].length; j++)
			{
				System.out.print(intArray[i][j] + "	    ");
				colSum[j] += intArray[i][j];
			}
			System.out.println("");
		}
		
		System.out.println("합과 함께 출력");
		for (int i = 0; i < intArray.length; i++)
		{
			for (int j = 0; j < intArray[i].length; j++)
			{
				System.out.print(intArray[i][j] + "	    ");
			}
			System.out.println("");
		}
		for (int sum : colSum)
		{
			System.out.print(sum + "	 ");
		}
		System.out.println("");
		
	}

}
