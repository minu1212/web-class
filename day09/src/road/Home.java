package road;

public class Home {
	public static void main(String[] args) {
		//mycar1 = 100����(SuperCar �����ڷ� ���� �ʵ��� �ּҰ�)
		SuperCar mycar1 = new SuperCar("Ferrari","Red",65000,"abcd");
		//mycar2 = 100����(SuperCar �����ڷ� ���� �ʵ��� �ּҰ�)
		//��ĳ����
		Car mycar2 = mycar1;
		mycar2.engineStart();
		//mycar3 = 200����(SuperCar �����ڷ� ���� �ʵ��� �ּҰ�) : ��ĳ����
//		Car mycar3 = new SuperCar(null, null, 0);
//		((SuperCar)mycar2).roofOpen();
		//�ٿ� ĳ������ �������� �������� ���̱� ���ؼ� ���� �ڽ�Ÿ���� ��ü�� �������� ����.
		SuperCar downObj = (SuperCar)mycar2;
		downObj.roofOpen();
		
//		SuperCar mycar = new SuperCar("Ferrari","Red",65000,"abcd");
//		Car momcar = new Car("K7", "White", 7000);
//		SuperCar dadcar = new SuperCar("Porsche","Yellow",25000,"abcd");
//		mycar.engineStart();
//		momcar.engineStart();
//		dadcar.engineStart();
		
		Car[] garage = {
				new SuperCar("Ferrari","Red",65000,"abcd"),//��ĳ����
				new Car("K7", "White", 7000),
				new SuperCar("Porsche","Yellow",25000,"abcd")//��ĳ����
		};
		
		for (int i = 0; i < garage.length; i++) {
			garage[i].engineStart();
		}
		((SuperCar)garage[0]).roofOpen();
		((SuperCar)garage[2]).roofOpen();
	}
}









