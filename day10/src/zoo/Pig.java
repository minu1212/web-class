package zoo;

public class Pig extends Animal{
	public Pig(String name, int age) {
		super(name, age);
	}

	@Override
	void makeSomeNoise() {
		System.out.println("²Ü²Ü");
	}

	
}
