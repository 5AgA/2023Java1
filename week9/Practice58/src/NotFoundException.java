@SuppressWarnings("serial")

public class NotFoundException extends Exception {
	public NotFoundException() {
		super("배열에 존재하지 않습니다.");
	}
}
