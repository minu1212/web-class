package road;

public class SuperCar extends Car{
	String pw;
	
	public SuperCar() {
		//super : 부모 클래스의 이름( Car )
		//Car();
		super();
	}
	//Alt + Shift + S > C : 부모 클래스에 있는 생성자 받아와서 생성자 만들기
	public SuperCar(String brand, String color, int price) {
		super(brand, color, price);
	}
	//Alt + Shift + S > O
	public SuperCar(String brand, String color, int price, String pw) {
		super(brand, color, price);
		this.pw = pw;
	}
	
	void engineStart() {
		System.out.println(brand+" 지문으로 시동 켜기");
	}
	
	//@ : 어노테이션
	@Override
	void engineStop() {
//		super.engineStop();
		System.out.println(brand+" 지문으로 시동 끄기");
	}
	
	void roofOpen() {
		System.out.println(brand+" 뚜껑 열기");
	}
	void roofClose() {
		System.out.println(brand+" 뚜껑 닫기");
	}
	
}








