package zoo;

public class BigDoyo extends Animal{

	public BigDoyo(String name, String gender, int age) {
		super(name, gender, age);
	}
	
	@Override
	void makeSomeNoise() {
		System.out.println(name+"捞(啊) 何府何府 快绰吝...");
	}
		
}
