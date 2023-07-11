import java.util.HashSet;

public class Practice72 {
	public static void main(String[] args) {
		HashSet<String> food = new HashSet<String>();
		food.add("Bread");
		food.add("Milk");
		food.add("Butter");
		food.add("Ham");
		food.add("Cheese");
		
		System.out.println(food.toString());
		int cnt = 0;
		System.out.print("[");
		for (String f : food) {
			cnt++;
			System.out.print(f);
			if (cnt != food.size())
				System.out.print(", ");
		}
		System.out.println("]");
		
		System.out.println("연산 결과는 " + add(10, 20) + "입니다");
	}
	
	public static int add(int x, int y) {
		System.out.print(x + " + " + y + " = ");
		return x + y;
	}
}
