package zoo;

public class WesternLongMole extends Animal{
	
	public WesternLongMole(String name, String gender, int age) {
		super(name, gender, age);
	}

	@Override
	void makeSomeNoise() {
		System.out.println(name+"��(��) ��״ٱ� �����...");
	}
}
