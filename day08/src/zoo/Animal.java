package zoo;

public class Animal {
	String name;
	String gender;
	int age;
	String type;
	
	public Animal() {}
	
	public Animal(String name, String gender, int age, String type) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.type = type;
	}
	
	void eat() {
		System.out.println(name+"ÀÌ(°¡) ³È³È ¸Ô´ÂÁß...");
	}
	
	void sleep() {
		System.out.println(name+"ÀÌ(°¡) ÄğÄğ ÀÚ´ÂÁß...");
	}
	
	void move() {
		System.out.println(name+"ÀÌ(°¡) ÄôÄçÄôÄç ¿òÁ÷ÀÌ´ÂÁß...");
	}
	
	void makeSomeNoise() {
		System.out.println(name+"ÀÌ(°¡) ²Ù¤Æ¤©²¾¤Ì„o²¾ ¿ì´ÂÁß...");
	}
}






