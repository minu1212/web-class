package casting;

public class SuperCar extends Car{
	String pw;
	public SuperCar(String brand, String color, int price) {
		super(brand, color, price);
	}
	@Override
	void engineStart() {
		System.out.println(brand+" ???????? ?õ? ?ѱ?");
	}
	@Override
	void engineStop() {
		System.out.println(brand+" ???????? ?õ? ????");
	}
	
	void roofOpen() {
		System.out.println(brand + "?Ѳ? ????");
	}
	
	void roofClose() {
		System.out.println(brand + "?Ѳ? ?ݱ?");
	}

}
