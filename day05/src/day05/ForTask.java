package day05;

import java.util.Iterator;
import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		//�����ϸ� �ʱ���� int i=0����, �������� i++ �� ����
		
		//�ǹ�
		//10���� 1���� ����ϱ�
//		for (int i = 10; i > 0 ; i--) {
//			System.out.println(i);
//		}
		for (int i = 0; i < 10 ; i++) {
			//i		����Ұ�		i+����Ұ� = 10	--> ����Ұ� = 10-i
			//0		10
			//1		9
			//2		8
			//3		7
			System.out.println(10-i);
		}
		//3 6 9 12 15 18 21 24 27 30 33 36 ����ϱ�
		for (int i = 0; i < 12; i++) {
			System.out.println(i*3+3);
		}
		//100���� 2�� �����ϸ� 20�� ����ϱ�
		for (int i = 0; i < 20; i++) {
			System.out.println(i*-2+100);
		}
		//���
		//1���� 10������ �� ����ϱ�
//		int sum = 0+1+2;
		int sum = 0;
//		sum += 1;
//		sum += 2;
//		sum += 3;
//		...
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//���� �ϳ� �Է¹޾Ƽ� 1���� �� ������ ����ϱ�
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		//�÷�
		//���� �ΰ� n,m �Է¹޾Ƽ� n���� m���� ����ϱ�(n�� m���� �۴ٰ� ����)
		//1���� 100���� �� ¦���� ����ϱ�
		//1���� 100���� �� 3�� 5�� ����� ����ϱ�
		//���̾�
		//A���� F���� ����ϱ�(A : 65 / F : 70)
		//012345....25
		//AbCdEf..xYz ����ϱ�
		//A(65+0)		a(97)
		//C(65+2)		b(97+1)
		//E(65+4)		d(97+3)
		
		//for�� �ϳ��� ����ؼ� ������ ��ü ����ϱ�
		//10���� ���� �ϳ� �Է¹޾Ƽ� 2������ ����ϱ�
		//ABCDefghIJKLmnopQRSTuvwxYZ ����ϱ�
		//AbCDefGHIjklMNOPqrstUVWXYz ����ϱ�
	}
}





