package day05;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
//		while(choice != 3) {
//			System.out.println("���� �� ���α׷��� �� �ƴѰ���?\n"
//					+"1. Java\n2. ���̽�\n3. ���վ�\n4. C���");
//			choice = sc.nextInt();
//			if(choice == 3) {
//				System.out.println("�����Դϴ�.");
//			}else if(choice == 1 || choice == 2 || choice == 4) {
//				System.out.println("�����Դϴ�.");
//			}else {
//				System.out.println("����!");
//			}
//		}
		
		do {
			System.out.println("���� �� ���α׷��� �� �ƴѰ���?\n"
					+"1. Java\n2. ���̽�\n3. ���վ�\n4. C���\n0. ������");
			choice = sc.nextInt();
			if(choice == 3) {
				System.out.println("�����Դϴ�.");
			}else if(choice == 1 || choice == 2 || choice == 4) {
				System.out.println("�����Դϴ�.");
			}else if(choice == 0) {
				System.out.println("�ȳ���������.");
			}else {
				System.out.println("����!");
			}
		}while(choice != 0);
		
		while(true) {
			System.out.println("���� �� ���α׷��� �� �ƴѰ���?\n"
					+"1. Java\n2. ���̽�\n3. ���վ�\n4. C���\n0. ������");
			choice = sc.nextInt();
			if(choice == 3) {
				System.out.println("�����Դϴ�.");
			}else if(choice == 1 || choice == 2 || choice == 4) {
				System.out.println("�����Դϴ�.");
			}else if(choice == 0) {
				System.out.println("�ȳ���������.");
				break;
			}else {
				System.out.println("����!");
			}
		}
	}
}






