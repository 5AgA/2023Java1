
public class MyArray<T> {
    public static <T> T pick(T[] Array, int idx) {
        if (idx < 0 || idx >= Array.length) {
            System.out.print("인덱스가 범위를 벗어났습니다 >> ");
            return null;
        }
        else {
            return Array[idx];
        }   
    }
    public static <T> T pickNew(T[] Array, int idx) throws InvalidIndexException {
        if (idx < 0 || idx >= Array.length) {
            throw(new InvalidIndexException());
        }
        return Array[idx];
    }
    public static <T> void displayArray(T[] Array) {
        for (T obj : Array) {
            System.out.print(obj + "     ");
        }
        System.out.println("\n");
    }
    public static <T> void swap(T[] Array, int i, int j) {
        T tmp;
        tmp = Array[i];
        Array[i] = Array[j];
        Array[j] = tmp;
    }
}

@SuppressWarnings("serial")

class InvalidIndexException extends Exception {
    public InvalidIndexException() {
        super("인덱스가 범위를 벗어났습니다 >> ");
    }
}