package multi_inherit;

public interface A {
	int data=10;
	default void f() {
		System.out.println("A �������̽��� f()");
	}
}
