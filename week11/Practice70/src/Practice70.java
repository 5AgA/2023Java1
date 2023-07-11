import java.util.Scanner;
import java.util.*;

public class Practice70 {
    public static Double findMax(ArrayList<Double> scores) {
        Double max = scores.get(0);
        for (Double s : scores) {
            if (max < s) 
                 max = s;
        }
        scores.remove(new Double(max));
        return max;
    }
    
    public static Double findMin(ArrayList<Double> scores) {
        Double min = scores.get(0);
        for (Double s : scores) {
            if (min > s)
                min = s;
        }
        scores.remove(new Double(min));
        return min;
    }
    
    public static Double getAve(ArrayList<Double> scores) {
        Double ave = 0.00;
        for(Double s : scores) {
            ave += s / scores.size();
        }
        return ave;
    }
    
    public static void main(String[] args) {
		// 여기에 필요한 코드를 작성하세요.
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Double> scores = new ArrayList<Double>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            scores.add(sc.nextDouble());
        }
        
        System.out.println("입력된 점수:");
        for(int i = 0; i < scores.size(); i++) {
            System.out.print(String.format("%.4f", scores.get(i)) + "     ");
            if (i % 2 != 0) System.out.println(" ");
        }
        
        System.out.println("\n\n평균값: " + String.format("%.4f", getAve(scores)));
        System.out.println("가장 높은 점수: " + String.format("%.4f", findMax(scores)));
        System.out.println("가장 낮은 점수: " + String.format("%.4f", findMin(scores)) + "\n");
        System.out.println("최고점과 최저점을 제외한 결과: ");
        for(int i = 0; i < scores.size(); i++) {
            System.out.print(String.format("%.4f", scores.get(i)) + "     ");
            if (i % 2 != 0) System.out.println(" ");
        }
        
        System.out.println("\n\n최종 점수: " + String.format("%.4f", getAve(scores)));
        
        sc.close();
    }
}