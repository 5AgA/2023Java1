
public class Practice23 {
	
	public static void main(String[] args) {
		
		int[][] intArray = new int[3][4];
		int[] rowSum = new int[3];
		int[] colSum = new int[4];
		int total = 0;
		
		for (int k = 0; k < intArray.length; k++)
		{
			if (k == 0)
			{
				for (int j = 0; j < intArray[k].length; j++)
				{
					intArray[k][j] = j + 1; 
					rowSum[k] += intArray[k][j];
					colSum[j] += intArray[k][j];
				}			
			}
			else
			{
				for (int j = 0; j < intArray[k].length; j++)
				{
					intArray[k][j] = intArray[k - 1][j] * 10;
					rowSum[k] += intArray[k][j];
					colSum[j] += intArray[k][j];
				}
			}
			total += rowSum[k];
		}
		
		for (int i = 0; i < intArray.length; i++)
		{
			for (int j = 0; j < intArray[i].length; j++)
			{
				System.out.print(intArray[i][j] + "     ");
				if (j == (intArray[i].length - 1))
				{
					System.out.println(rowSum[i]);
				}
			}
		}
		for (int col : colSum)
		{	
			System.out.print(col + "	");
		}
		System.out.println(total);
	
	}
}
