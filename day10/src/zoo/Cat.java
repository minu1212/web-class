package zoo;

public class Cat extends Animal{
	public Cat(String name, int age) {
		super(name, age);
	}
	
	@Override
	void makeSomeNoise() {
		System.out.println("�Ŀ�");
	}
}
