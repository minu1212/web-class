package road;

public class Car {
	String brand;
	String color;
	int price;
	static int wheel = 4;
	
	//������ �����ε�
	public Car() {}

	//Alt + Shift + S > O : �ʵ带 �̿��Ͽ� ������ ����� 
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public Car(int price) {
		this.price = price;
	}

	void engineStart() {
		System.out.println(this.brand + " �õ� �ѱ�");
	}

	void engineStop() {
		//���� �̸��� ���������� ���ٸ� this ���� ����
		System.out.println(brand + "�õ� ����");
	}
}
