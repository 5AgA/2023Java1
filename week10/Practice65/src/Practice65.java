import java.util.Scanner;

public class Practice65 {
    public static void main(String[] args) {
		// 여기에 필요한 코드를 작성하세요.
        Scanner sc = new Scanner(System.in);
        HealthData<Integer, Integer> p1 = new HealthData<Integer, Integer>("김동덕", 150, 50);
        HealthData<Integer, Double> p2 = new HealthData<Integer, Double>("홍길동", 180, 100.35);
        HealthData<Double, Integer> p3 = new HealthData<Double, Integer>("성춘향", 156.7, 65);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        Double sum = p1.getWeight() + p2.getWeight() + p3.getWeight();
        System.out.println("3사람 체중의 합: " + sum);
        
        sc.close();
    }
}