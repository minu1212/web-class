package multi_inherit;

public interface B {
	int data=20;
	default void f() {
		System.out.println("B 인터페이스의 f()");
	}
}
