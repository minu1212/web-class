package day03;

import java.util.Scanner;

public class StrTest {
	public static void main(String[] args) {
		String num = "10";
		
		
		//parse = �ؼ�
		//Integer.parseInt("������ �� ���ڿ�") : ��°�� ����Ÿ������ 	�ٲ��ش�. > 
		
//		Integer.parseInt(num);
		
//		System.out.println((int)num/3);
		//�ؼ��ÿ��� �����ڷ���Ÿ��(�Է½� ��������� ���ϴ� �ֵ� ex) int, double...)�� ���׳��� class(�� ����) Ÿ���� ���׳��� �ؼ��ϱ� ������ ������ �߻��Ѵ�.(11)
//		System.out.println(Integer.parseInt(num)/3);
//		System.out.println(Double.parseDouble(num)/3);
		
		//sc.next() �� �Է¹޾Ƽ� ���� ��� ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		//�Է�
		//�ΰ� ���� �Է¹ޱ�
		System.out.print("ù���� ���� : ");
		String num1 = sc.next();
		System.out.print("�ι��� ���� : ");
		String num2 = sc.next();
		
		//ó��
		//�� ���ڿ� ����Ÿ������ �ٲٱ�
		//������ �Է¹��� �ΰ��� ���� ���ϱ�
		//Integer.parseInt("������ �� ���ڿ�")
		//Integer.parseInt("10+3")(x) + ������ ����־� �����ε� ���ڿ��� �ƴϹǷ� �����߻�
		//Integer.parseInt("num1")(x) ���� ���ÿ��� ������ �״�� ���
		int result = Integer.parseInt(num1)+Integer.parseInt(num2);
		
		//���
		//������ ������ ��� ����ϱ�
		System.out.println("��� : "+result);
	}
}
