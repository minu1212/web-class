package day07;

public class StorageTests {
	int data1 = 10;//��������(�Ķ���)
	static int data3 = 30;//���� ����(static�� ���� ��������)(������)
	public static void main(String[] args) {
		//static�� ���� �޼ҵ� ���ο����� �Ϲ� ���������� ����� �� ����.
//		System.out.println(data1); //��������
		//static�� ���� ���������� ���������� ����� �� �ִ�.
		System.out.println(data3);//out = static ��������
		int data1 = 100;
		System.out.println(data1);//�޼ҵ� �� ���������� �����̸��� ���������� �ִٸ� �������� �켱 
	}
	
	void f1() {
		int data2 = 20;//��������(����)
		int data3 = 30;
	}
	void f2() {
		int data2 = 200;
//		System.out.println(data3);
		System.out.println(data1);
	}
}
