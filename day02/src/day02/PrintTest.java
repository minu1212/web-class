package day02;

//Alt + Shift + N > ↓ > Enter : 자바 프로젝트 생성
//Ctrl + N : New 창(패키지, 클래스 등 생성하기)
//Ctrl + Spacebar : 자동완성
public class PrintTest {
	
	//main 글자 치고 자동완성 : main메소드 생성
	public static void main(String[] args) {
		System.out.print(10);
		System.out.print("\n정다솔\n");
		//자바에서는 값(정수, 실수, 문자, 문자열,....)과 문자열을 + 시키면
		//문자열로 연결이 된다. 8+"\n" ---> "8\n"
		System.out.print(3+5+"\n");
		
		System.out.println("자바");
		System.out.println("처음 배워요");
		
		//syso 글자 치고 자동완성 : println()메소드 사용
		
		//"코리아"
		System.out.println("\"코리아\"");
		
		//엔터 : \n
		System.out.println("엔터 : \\n");
		
		//10월 13일
		System.out.println(10+"월 "+13+"일");
	}
	
}













