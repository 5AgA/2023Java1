@SuppressWarnings("serial")

class InvalidInputException extends Exception {
    public InvalidInputException() {
        super("잘못된 입력입니다.");
    }
}