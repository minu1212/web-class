package road;

public class Car {
	String brand;
	String color;
	int price;
	static int wheel = 4;
	
	//생성자 오버로딩
	public Car() {}

	//Alt + Shift + S > O : 필드를 이용하여 생성자 만들기 
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public Car(int price) {
		this.price = price;
	}

	void engineStart() {
		System.out.println(this.brand + " 시동 켜기");
	}

	void engineStop() {
		//같은 이름의 지역변수가 없다면 this 생략 가능
		System.out.println(brand + "시동 끄기");
	}
}
