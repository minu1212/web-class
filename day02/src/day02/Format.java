package day02;

public class Format {
	public static void main(String[] args) {
		//1 + 1 = 2
		System.out.println(1 + "+" + 1 + "=" + (1+1));
		System.out.printf("%d+%d=%d\n",1,1,1+1);
	
		System.out.println(10.24);
		//%.4f : 소수점 아래로 네자리까지
		System.out.printf("%.4f\n",10.24);
	
		//%3$d : 세번째로 넘겨주는 정수값을 이 자리에 붙여라
		System.out.printf("%3$d %1$d %2$d\n",10,20,30);
		
		//10 20 30 출력이 아닌 "10 20 30" 문자열 값이 필요한 경우
		String result = String.format("%d %d %d", 10,20,30);
	}
}