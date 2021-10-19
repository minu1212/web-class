package day04;

import java.util.Scanner;
//ctrl + shift + f:자동 정렬
public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("다음 중 프로그래밍 언어가 아닌 것은? \n 1. java\n 2. 파이썬\n 3. 망둥어\n 4. C언어");
		int choice = sc.nextInt();

		// 분기처리
//		if (choice==3) {
//			System.out.println("정답입니다.");
//		}
//		else if (choice==1||choice==2||choice==4) {
//			System.out.println("오답입니다.");
//		}
//		else {
//			System.out.println("잘못입력하셨습니다.");
//		}

		// 일괄처리
//		String result = "";
		String result = "잘못입력하셨습니다.";
		if (choice == 3) {
			result = "정답입니다";
		} else if (choice == 1 || choice == 2 || choice == 4) {
			result = "오답입니다.";
		}
//		else {
//			result = "잘못입력하셨습니다";
//		}

		System.out.println(result);

	}
}
