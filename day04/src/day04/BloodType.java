package day04;

import java.util.Scanner;

public class BloodType {
	public static void main(String[] args) {
		System.out.println("����� �������� ? : ");
		Scanner sc = new Scanner(System.in);
		String btype = sc.next();
		
		//"���ڿ�1".equals("���ڿ�2") : "���ڿ�1"�� "���ڿ�2"�� ���ٸ� True / �ٸ��ٸ�  false
		if (btype.equals ("A")) {
				System.out.println("�Ĳ��ϰ� �����ϴ�.");
		}else if(btype.equals ("B")) {
			System.out.println("�������̰� Ȱ���ϴ�.");
		}else if(btype.equals ("O")) {
			System.out.println("ģȭ���� ���� �ǵ� ����.");
		}else if(btype.equals ("AB")) {
			System.out.println("����ϰ� ��â���̴�.");
		}else {
			System.out.println("����� ����� �ƴմϴ�.");
		}
	}
}
