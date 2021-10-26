package inner;

import inner.Out.In;

public class InnerTest {
	public static void main(String[] args) {
//		B b = new B();
		Out out = new Out();
//		In in = out.new In();
		In in = out.getInObject();
		
		in.f();
	}
}
class A{
	int data=10;
}
class B extends A{
	void f() {
		System.out.println(data);
	}
}

//A
class Out{
	int data = 10;
	
	In getInObject() {
		return new In();
	}
	//B
	class In{
		void f() {
			System.out.println(data);
		}
	}
}









