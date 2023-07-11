
//여기에 사용자 예외를 정의하세요. 
@SuppressWarnings("serial")

public class NegativeBalanceException extends Exception {
 public NegativeBalanceException() {
     super("입력된 금액이 잘못되었습니다. 다시 입력하세요.");
 }
}