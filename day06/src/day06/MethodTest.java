package day06;

import java.util.Scanner;

public class MethodTest {
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		sc.next();
		MethodTest m = new MethodTest();
		int result = m.f(10);
		m.f(87);
		System.out.println(m.f(7));
		m.printName();
		m.printJava(5);
	}
	//f(x) = 2x+1
	int f(int x) {
		//x = 10;
		return 2*x+1;
	}
	
	//내 이름("조민우")을 10번 출력하는 메소드
	void printName() {
		for (int i = 0; i < 10; i++) {
			System.out.println("조민우");
		}
	}
	
	//"Java" 문자열을 원하는 숫자만큼 출력하는 메소드
	void printJava(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("Java");
		}
	}
	
	//현재 시간정보를 돌려주는 메소드
//	시간타입 getTime() {
//		return 시간정보;
//	}
	
	//넘긴 숫자가 정수인지 판별하는 메소드(3.0은 사실 3이라는 정수)
//	메소드 이름에 is, has가 들어간 경우에는 매개변수가 있고 return타입은 boolean타입이다.
//	if(m.isInt(10)) {}
//	boolean isInt(double num) {
//		return true/false;
//	}

}










