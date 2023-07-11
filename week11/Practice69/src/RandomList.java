// 필요한 클래스 코드를 완성하세요.
import java.util.*;

public class RandomList<T> {
    ArrayList<T> list;
    
    public RandomList() {
        list = new ArrayList<T>();
    }
    public void add(T item) { list.add(item); }
    public T selectLast() { return list.get(list.size() - 1); }
    public void print() {
        System.out.println("리스트의 내용을 출력합니다.");
        for(T item : list) {
            System.out.print(item + "     ");
        }
        System.out.println("");
    }
}