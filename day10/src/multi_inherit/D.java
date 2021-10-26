package multi_inherit;

public class D extends C implements A,B{
//	jdk 8부터 인터페이스에 default 메소드를 선언할 수 있고, 사실상의 다중상속을 지원한다.
//	다중상속시 똑같은 이름의 메소드를 여러개 받아서 충돌이 일어날 수 있다(모호성)
//	모호성을 해결해주기 위해서 f()메소드 오버라이딩을 통해 모호성을 해결해 주어야 한다.
	@Override
	public void f() {
//		D타입 객체로 f() 쓸 땐 이 내용으로 해~
		System.out.println("D 클래스의 f()");
	}
	void doSomething() {
		System.out.println(A.data);
		System.out.println(B.data);
		A.super.f();	//A 인터페이스의 f() 사용
		B.super.f();	//B 인터페이스의 f() 사용
		super.f();		//C 클래스의 f() 사용
	}
}








