package day03;

import java.util.Scanner;

public class StrTest {
	public static void main(String[] args) {
		String num = "10";
		
		
		//parse = 해석
		//Integer.parseInt("정수로 된 문자열") : 통째로 정수타입으로 	바꿔준다. > 
		
//		Integer.parseInt(num);
		
//		System.out.println((int)num/3);
		//해석시에는 원시자료형타입(입력시 보라색으로 변하는 애들 ex) int, double...)은 개네끼리 class(노 보라) 타입은 개네끼리 해석하기 때문에 오류가 발생한다.(11)
//		System.out.println(Integer.parseInt(num)/3);
//		System.out.println(Double.parseDouble(num)/3);
		
		//sc.next() 로 입력받아서 더한 결과 출력하기
		Scanner sc = new Scanner(System.in);
		
		//입력
		//두개 정수 입력받기
		System.out.print("첫번재 정수 : ");
		String num1 = sc.next();
		System.out.print("두번재 정수 : ");
		String num2 = sc.next();
		
		//처리
		//두 문자열 정수타입으로 바꾸기
		//위에서 입력받은 두개의 정수 더하기
		//Integer.parseInt("정수로 된 문자열")
		//Integer.parseInt("10+3")(x) + 연산을 집어넣어 정수로된 문자열이 아니므로 오류발생
		//Integer.parseInt("num1")(x) 변수 사용시에는 변수명 그대로 사용
		int result = Integer.parseInt(num1)+Integer.parseInt(num2);
		
		//출력
		//위에서 더해진 결과 출력하기
		System.out.println("결과 : "+result);
	}
}
