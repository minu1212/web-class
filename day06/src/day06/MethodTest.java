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
	
	//�� �̸�("���ο�")�� 10�� ����ϴ� �޼ҵ�
	void printName() {
		for (int i = 0; i < 10; i++) {
			System.out.println("���ο�");
		}
	}
	
	//"Java" ���ڿ��� ���ϴ� ���ڸ�ŭ ����ϴ� �޼ҵ�
	void printJava(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("Java");
		}
	}
	
	//���� �ð������� �����ִ� �޼ҵ�
//	�ð�Ÿ�� getTime() {
//		return �ð�����;
//	}
	
	//�ѱ� ���ڰ� �������� �Ǻ��ϴ� �޼ҵ�(3.0�� ��� 3�̶�� ����)
//	�޼ҵ� �̸��� is, has�� �� ��쿡�� �Ű������� �ְ� returnŸ���� booleanŸ���̴�.
//	if(m.isInt(10)) {}
//	boolean isInt(double num) {
//		return true/false;
//	}

}










