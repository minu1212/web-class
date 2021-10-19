package day04;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		if (num>0) {
			System.out.println("양수입니다.");
		}
		else if(num<0) {
			System.out.println("음수입니다.");
		}
		else {
			System.out.println("0입니다.");
		}
		
	}
}
