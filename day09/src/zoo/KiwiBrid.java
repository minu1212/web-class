package zoo;

public class KiwiBird extends Animal{
	public KiwiBird(String name, String gender, int age) {
		super(name, gender, age);
	}

	@Override
	void makeSomeNoise() {
		System.out.println(name+"이(가) 나는 골드키위 하고 우는중...");
	}
	
}
