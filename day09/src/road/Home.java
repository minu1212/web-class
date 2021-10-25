package road;

public class Home {
	public static void main(String[] args) {
		//mycar1 = 100번지(SuperCar 생성자로 만든 필드의 주소값)
		SuperCar mycar1 = new SuperCar("Ferrari","Red",65000,"abcd");
		//mycar2 = 100번지(SuperCar 생성자로 만든 필드의 주소값)
		//업캐스팅
		Car mycar2 = mycar1;
		mycar2.engineStart();
		//mycar3 = 200번지(SuperCar 생성자로 만든 필드의 주소값) : 업캐스팅
//		Car mycar3 = new SuperCar(null, null, 0);
//		((SuperCar)mycar2).roofOpen();
		//다운 캐스팅은 가독성과 불편함을 줄이기 위해서 보통 자식타입의 객체로 만들어놓고 쓴다.
		SuperCar downObj = (SuperCar)mycar2;
		downObj.roofOpen();
		
//		SuperCar mycar = new SuperCar("Ferrari","Red",65000,"abcd");
//		Car momcar = new Car("K7", "White", 7000);
//		SuperCar dadcar = new SuperCar("Porsche","Yellow",25000,"abcd");
//		mycar.engineStart();
//		momcar.engineStart();
//		dadcar.engineStart();
		
		Car[] garage = {
				new SuperCar("Ferrari","Red",65000,"abcd"),//업캐스팅
				new Car("K7", "White", 7000),
				new SuperCar("Porsche","Yellow",25000,"abcd")//업캐스팅
		};
		
		for (int i = 0; i < garage.length; i++) {
			garage[i].engineStart();
		}
		((SuperCar)garage[0]).roofOpen();
		((SuperCar)garage[2]).roofOpen();
	}
}









