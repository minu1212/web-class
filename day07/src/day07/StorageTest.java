package day07;

public class StorageTest {
	int data1 = 10;
	static int data3 = 30;
	public static void main(String[] args) {
		//static이 붙은 메소드 내부에서는 일반 전역변수를 사용할 수 없다.
//		System.out.println(data1);
		//staitc이 붙은 전역변수만 사용할 수 있다.
		System.out.println(data3);
		//지역변수 우선시
		int data1 = 100;
		System.out.println(data1);
	}
	void f1() {
		int data2 = 20;
		int data3 = 30;
		System.out.println(data1);
	}
	void f2() {
		int data2 = 200;
//		System.out.println(data3);
		System.out.println(data1);
	}
}
