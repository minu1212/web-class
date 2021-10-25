package day05;

import java.util.Iterator;
import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		//웬만하면 초기식은 int i=0으로, 증감식은 i++ 로 고정
		
		//실버
		//10부터 1까지 출력하기
//		for (int i = 10; i > 0 ; i--) {
//			System.out.println(i);
//		}
		for (int i = 0; i < 10 ; i++) {
			//i		출력할값		i+출력할값 = 10	--> 출력할값 = 10-i
			//0		10
			//1		9
			//2		8
			//3		7
			System.out.println(10-i);
		}
		//3 6 9 12 15 18 21 24 27 30 33 36 출력하기
		for (int i = 0; i < 12; i++) {
			System.out.println(i*3+3);
		}
		//100부터 2씩 감소하며 20번 출력하기
		for (int i = 0; i < 20; i++) {
			System.out.println(i*-2+100);
		}
		//골드
		//1부터 10까지의 합 출력하기
//		int sum = 0+1+2;
		int sum = 0;
//		sum += 1;
//		sum += 2;
//		sum += 3;
//		...
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//정수 하나 입력받아서 1부터 그 수까지 출력하기
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		//플레
		//정수 두개 n,m 입력받아서 n부터 m까지 출력하기(n은 m보다 작다고 가정)
		//1부터 100까지 중 짝수만 출력하기
		//1부터 100까지 중 3과 5의 공배수 출력하기
		//다이아
		//A부터 F까지 출력하기(A : 65 / F : 70)
		//012345....25
		//AbCdEf..xYz 출력하기
		//A(65+0)		a(97)
		//C(65+2)		b(97+1)
		//E(65+4)		d(97+3)
		
		//for문 하나만 사용해서 구구단 전체 출력하기
		//10진수 숫자 하나 입력받아서 2진수로 출력하기
		//ABCDefghIJKLmnopQRSTuvwxYZ 출력하기
		//AbCDefGHIjklMNOPqrstUVWXYz 출력하기
	}
}





