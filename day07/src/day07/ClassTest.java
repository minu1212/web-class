package day07;

public class ClassTest {
	public static void main(String[] args) {
		Car mycar = new Car() ;//mycar에 값이 없다면 오류가 발생하기 때문에 생성자(new Car())를 만들어준다.(찍어내는과정)
//		System.out.println(mycar);
		System.out.println(mycar.brand);
		//null : 주소값으 초기값(값으로 볼수없다)
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