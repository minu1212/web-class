package day04;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("���� : ");
		int num = sc.nextInt();
		
		if (num>0) {
			System.out.println("����Դϴ�.");
		}
		else if(num<0) {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("0�Դϴ�.");
		}
		
	}
}
