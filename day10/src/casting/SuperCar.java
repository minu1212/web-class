package casting;

public class SuperCar extends Car{
	String pw;
	public SuperCar(String brand, String color, int price) {
		super(brand, color, price);
	}
	@Override
	void engineStart() {
		System.out.println(brand+" Áö¹®À¸·Î ½Ãµ¿ ÄÑ±â");
	}
	@Override
	void engineStop() {
		System.out.println(brand+" Áö¹®À¸·Î ½Ãµ¿ ²ô±â");
	}
	
	void roofOpen() {
		System.out.println(brand + "¶Ñ²± ¿­±â");
	}
	
	void roofClose() {
		System.out.println(brand + "¶Ñ²± ´Ý±â");
	}

}
