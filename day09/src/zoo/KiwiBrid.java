package zoo;

public class KiwiBird extends Animal{
	public KiwiBird(String name, String gender, int age) {
		super(name, gender, age);
	}

	@Override
	void makeSomeNoise() {
		System.out.println(name+"��(��) ���� ���Ű�� �ϰ� �����...");
	}
	
}
