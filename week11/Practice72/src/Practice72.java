import java.util.*;

public class Practice72 {
    public static void main(String[] args) {
		// 여기에 필요한 코드를 작성하세요.
        Set<String> food = new HashSet<String>();
        int cnt = 0;
        
        food.add("Milk");
        food.add("Bread");
        food.add("Butter");
        food.add("Ham");
        food.add("Cheese");
        
        System.out.println(food);
        System.out.print("[");
        for (String obj : food)
            System.out.print(obj + ", ");
        System.out.println("]");
        System.out.print("[");
        for (String obj : food) {
            cnt++;
            System.out.print(obj);
            if (cnt != food.size())
                System.out.print(", ");
        }
        System.out.println("]");
    }
}