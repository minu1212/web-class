package zoo;

public class Animal {
	String name;
	String gender;
	int age;
	
	public Animal(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
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
