package road;

public class Road {
	public static void main(String[] args) {
		Car mycar = new Car("Ferrari","Red",65000);
//		mycar.brand = "Ferrari";
		
		Car momcar = new Car("K7","White",7000);
		
		Car dadcar = new Car(28000);
		
//		mycar.engineStart();
//		momcar.engineStart();
//		dadcar.engineStart();
		
		Car[] garage = {
				new Car("Ferrari","Red",65000),
				new Car("K7","White",7000),
				new Car(28000)
		};
		for (int i = 0; i < garage.length; i++) {
			garage[i].engineStart();
		}
		
//		Car[] garage2 = new Car[100];
//		for (int i = 0; i < garage2.length; i++) {
//			garage2[i] = new Car();
//			garage2[i].brand = "Ferrari"+i;
//			garage2[i].engineStart();
//		}
		
		mycar.wheel--;
		System.out.println(momcar.wheel);
		System.out.println(Car.wheel);
		
//		Integer.parseInt("1566");
		
	}
}










