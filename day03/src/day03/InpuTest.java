package day03;

//jRE ���̺귯���� �ִ� Scanner Ŭ������ ���ڴٰ� ���� ���Ͽ� �߰�!
import java.util.Scanner;

public class InpuTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.println(name+"�� �������!");
		
		System.out.print("�ּ� : ");
		//������ �������� enter�� �Ծ�ġ��� ����
		sc.nextLine();
		String addr = sc.nextLine();
		System.out.println("����� ��°��� " + addr + " �Դϴ�.");
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.println("����� 5��� ���̴�"+(age+5)+"���Դϴ�");
	}
}
