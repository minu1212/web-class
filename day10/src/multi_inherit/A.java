package multi_inherit;

public interface A {
	int data=10;
	default void f() {
		System.out.println("A 인터페이스의 f()");
	}
}
