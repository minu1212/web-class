package day04;

import java.util.Scanner;

public class BloodType {
	public static void main(String[] args) {
		System.out.println("당신의 혈액형은 ? : ");
		Scanner sc = new Scanner(System.in);
		String btype = sc.next();
		
		//"문자열1".equals("문자열2") : "문자열1"과 "문자열2"가 같다면 True / 다르다면  false
		if (btype.equals ("A")) {
				System.out.println("꼼꼼하고 세심하다.");
		}else if(btype.equals ("B")) {
			System.out.println("적극적이고 활발하다.");
		}else if(btype.equals ("O")) {
			System.out.println("친화력이 좋고 피도 좋다.");
		}else if(btype.equals ("AB")) {
			System.out.println("기발하고 독창적이다.");
		}else {
			System.out.println("당신은 사람이 아닙니다.");
		}
	}
}
