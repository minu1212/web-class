package day04;

import java.util.Scanner;


//ctrl + alt + ��(��) : �Ʒ���(����) ������ �� ����
//alt + ��(��) : �Ʒ���(����) ������ �� �̵�
public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �� ���α׷��� �� �ƴ� ����? "+ "\n 1. java\n 2. ���̽�\n 3. ���վ�\n 4. C���");
		int choice = sc.nextInt();
		
		//������ case���� Ż���� �ʿ�����Ƿ�  break�� ���� �ʴ´�.
		switch(choice) {
		case 3: 	
			System.out.println("�����Դϴ�.");
			break;
		case 1:
			System.out.println("�����Դϴ�.");
 			break;
 		case 2:
 			System.out.println("�����Դϴ�.");
 			break;
 		case 4:
 			System.out.println("�����Դϴ�.");
 			break;
 		default:
 			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		
//		String btype = "A";
//		switch(btype) {
//		case "A":
//			System.out.println("A��");
//		default:
//		}
	}
}
