package multi_inherit;

public class D extends C implements A,B{
//	jdk 8���� �������̽��� default �޼ҵ带 ������ �� �ְ�, ��ǻ��� ���߻���� �����Ѵ�.
//	���߻�ӽ� �Ȱ��� �̸��� �޼ҵ带 ������ �޾Ƽ� �浹�� �Ͼ �� �ִ�(��ȣ��)
//	��ȣ���� �ذ����ֱ� ���ؼ� f()�޼ҵ� �������̵��� ���� ��ȣ���� �ذ��� �־�� �Ѵ�.
	@Override
	public void f() {
//		DŸ�� ��ü�� f() �� �� �� �������� ��~
		System.out.println("D Ŭ������ f()");
	}
	void doSomething() {
		System.out.println(A.data);
		System.out.println(B.data);
		A.super.f();	//A �������̽��� f() ���
		B.super.f();	//B �������̽��� f() ���
		super.f();		//C Ŭ������ f() ���
	}
}








