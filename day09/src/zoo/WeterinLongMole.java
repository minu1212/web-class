package zoo;

public class WesternLongMole extends Animal{
	
	public WesternLongMole(String name, String gender, int age) {
		super(name, gender, age);
	}

	@Override
	void makeSomeNoise() {
		System.out.println(name+"이(가) 디그다그 우는중...");
	}
}
