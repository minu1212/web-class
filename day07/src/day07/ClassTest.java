package day07;

public class ClassTest {
	Car dadcar = new Car();
	public static void main(String[] args) {
		Car mycar = new Car();
//		System.out.println(mycar);
//		System.out.println(mycar.brand);
		//null : 주소값의 초기값
		System.out.println(mycar.brand);
		mycar.brand = "Ferrari";
		mycar.color = "Red";
		mycar.price = 65000;
		System.out.println(mycar.brand);
		mycar.engineStart();
		
		Car momcar = new Car();
		momcar.brand = "K7";
		momcar.color = "White";
		momcar.price = 7000;
		System.out.println(momcar.brand);
	}
}

class Car{
	String brand;
	String color;
	int price;
	
	
	
	void engineStart() {
		System.out.println("시동 켜기");
	}
	void engineStop() {
		System.out.println("시동 끄기");
	}
}









