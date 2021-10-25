package road;

public class SuperCar extends Car{
	String pw;
	
	public SuperCar() {
		//super : �θ� Ŭ������ �̸�( Car )
		//Car();
		super();
	}
	//Alt + Shift + S > C : �θ� Ŭ������ �ִ� ������ �޾ƿͼ� ������ �����
	public SuperCar(String brand, String color, int price) {
		super(brand, color, price);
	}
	//Alt + Shift + S > O
	public SuperCar(String brand, String color, int price, String pw) {
		super(brand, color, price);
		this.pw = pw;
	}
	
	void engineStart() {
		System.out.println(brand+" �������� �õ� �ѱ�");
	}
	
	//@ : ������̼�
	@Override
	void engineStop() {
//		super.engineStop();
		System.out.println(brand+" �������� �õ� ����");
	}
	
	void roofOpen() {
		System.out.println(brand+" �Ѳ� ����");
	}
	void roofClose() {
		System.out.println(brand+" �Ѳ� �ݱ�");
	}
	
}








