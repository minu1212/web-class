package day07;

public class ClassTest {
	Car dadcar = new Car();
	public static void main(String[] args) {
		Car mycar = new Car();
//		System.out.println(mycar);
//		System.out.println(mycar.brand);
		//null : �ּҰ��� �ʱⰪ
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
		System.out.println("�õ� �ѱ�");
	}
	void engineStop() {
		System.out.println("�õ� ����");
	}
}









