package day04;

import java.util.Scanner;

public class OperTest {
	public static void main(String[] args) {
		//사용자에게 정수 입력받아서 양수인지 음수인지 판별
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String result = num > 0? "양수입니다.":num==0?"0입니다.":"음수입니다.";
		System.out.println(result);
		
//		System.out.println(num > 0? "양수입니다.":-144 );
		
//		System.out.println("양수입니다.");
//		System.out.println("음수입니다.");
	}
}
