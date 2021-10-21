package day07;

public class StorageTests {
	int data1 = 10;//전역변수(파란색)
	static int data3 = 30;//정적 변수(static이 붙은 전역변수)(기울어짐)
	public static void main(String[] args) {
		//static이 붙은 메소드 내부에서는 일반 전역변수를 사용할 수 없다.
//		System.out.println(data1); //전역변수
		//static이 붙은 전역변수와 지역변수만 사용할 수 있다.
		System.out.println(data3);//out = static 전역변수
		int data1 = 100;
		System.out.println(data1);//메소드 내 전역변수와 같은이름의 지역변수가 있다면 지역변수 우선 
	}
	
	void f1() {
		int data2 = 20;//지역변수(갈색)
		int data3 = 30;
	}
	void f2() {
		int data2 = 200;
//		System.out.println(data3);
		System.out.println(data1);
	}
}
