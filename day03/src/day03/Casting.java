package day03;

public class Casting {
	public static void main(String[] args) {
//		System.out.println((10+0.0)/3);
		//아스키 코드 : 각 문자마다 대응되는 숫자값들을 가지고 있다.
		//'A' : 65 / 'a' : 97 / '0' : 48
		System.out.println('A'+5);
		
		int num = 10;
		System.out.println((double)num/3);
		//정수+정수=정수
		//10/3= 3.3333...
		//p 10/3=3
		//p double 10/3=3.33333335 (컴퓨터는 모든 값을 2진수로 알아들음. 2진수에서는 반올림이 진행된 결과이다.)
		//변수 옆에 =이 없으면 무조건 값이다. 현재 num = 10 10이라는 값을 double로 자료형을 변경하였으나 10라는 값만
		//형변환을 하였기 때문에 다음 num 변수 에서는 형변환이 적용되지 않는다.
		//변수 옆에 = 이 있으면 데이터
		System.out.println(num/3);
	}
}
