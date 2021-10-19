package day03;

//jRE 라이브러리에 있는 Scanner 클래스를 쓰겠다고 현재 파일에 추가!
import java.util.Scanner;

public class InpuTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.println(name+"님 어서오세요!");
		
		System.out.print("주소 : ");
		//위에서 내려오는 enter를 먹어치우는 역할
		sc.nextLine();
		String addr = sc.nextLine();
		System.out.println("당신이 사는곳은 " + addr + " 입니다.");
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.println("당신의 5년뒤 나이는"+(age+5)+"살입니다");
	}
}
