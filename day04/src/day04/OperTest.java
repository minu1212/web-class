package day04;

import java.util.Scanner;

public class OperTest {
	public static void main(String[] args) {
		//����ڿ��� ���� �Է¹޾Ƽ� ������� �������� �Ǻ�
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String result = num > 0? "����Դϴ�.":num==0?"0�Դϴ�.":"�����Դϴ�.";
		System.out.println(result);
		
//		System.out.println(num > 0? "����Դϴ�.":-144 );
		
//		System.out.println("����Դϴ�.");
//		System.out.println("�����Դϴ�.");
	}
}
