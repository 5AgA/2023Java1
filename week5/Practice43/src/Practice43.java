
public class Practice43 {

	public static void main(String[] args) {
		Shape[] sArray = new Shape[3];
		sArray[0] = new Shape();
		sArray[1] = new Rectangle();
		sArray[2] = new Triangle();
		
		System.out.println(sArray[0] instanceof Shape); // 참조 변수의 타입이 Shape이여서 true
		System.out.println(sArray[0] instanceof Rectangle); // 참조 변수의 타입이 Shape이여서 false
		System.out.println(sArray[0] instanceof Triangle); // 참조 변수의 타입이 Shape이여서 fasle
		System.out.println(sArray[1] instanceof Shape); // 참조 변수의 타입이 Shape이여서 true
		System.out.println(sArray[1] instanceof Rectangle); // 참조 변수의 타입이 Shape이지만 Rectangle 객체로 생성되어서 true
		System.out.println(sArray[1] instanceof Triangle); // 참조 변수의 타입이 Shape이지만 Rectangle 객체로 생성되어서 false
		System.out.println(sArray[2] instanceof Shape); // 참조 변수의 타입이 Shape이여서 true
		System.out.println(sArray[2] instanceof Rectangle); // 참조 변수의 타입이 Shape이지만 Triangle 객체로 생성되어서 false
		System.out.println(sArray[2] instanceof Triangle); // 참조 변수의 타입이 Shape이지만 Triangle 객체로 생성되어서 true
	}

}
