package day04;

import java.util.Scanner;


//ctrl + alt + ↓(↑) : 아래로(위로) 선택한 줄 복사
//alt + ↓(↑) : 아래로(위로) 선택한 줄 이동
public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("다음 중 프로그래밍 언어가 아닌 것은? "+ "\n 1. java\n 2. 파이썬\n 3. 망둥어\n 4. C언어");
		int choice = sc.nextInt();
		
		//마지막 case에는 탈출이 필요없으므로  break를 적지 않는다.
		switch(choice) {
		case 3: 	
			System.out.println("정답입니다.");
			break;
		case 1:
			System.out.println("오답입니다.");
 			break;
 		case 2:
 			System.out.println("오답입니다.");
 			break;
 		case 4:
 			System.out.println("오답입니다.");
 			break;
 		default:
 			System.out.println("잘못입력하셨습니다.");
		}
		
//		String btype = "A";
//		switch(btype) {
//		case "A":
//			System.out.println("A형");
//		default:
//		}
	}
}
