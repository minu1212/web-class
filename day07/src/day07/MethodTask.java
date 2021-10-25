package day07;

public class MethodTask {
	public static void main(String[] args) {
	}
//	1~10 출력하는 메소드
	void print1To10() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
//	1~10 합을 구해주는 메소드
	int sum1To10() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}
//	1~n 합을 구해주는 메소드
	int sum1ToN(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;		
	}
//	두 정수의 나눗셈 결과를 구해주는 메소드
	double div(int num1, int num2) {
		return num1/(double)num2;
	}

//	어떤 문자열을 n번만큼 출력하는 메소드
	void printMsg(String msg, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(msg);
		}
	}
	
//	n부터 m까지의 합 구해주는 메소드
	int sumNtoM(int n,int m) {
		int sum = 0;
		for (int i = n; i <= m; i++) {
			sum += i;
		}
		return sum;
	}
	// "문자열".charAt(index)	: index번째의 글자 빼오기(char 타입)
	// "문자열".length()		: 문자열의 길이(int 타입)
//	문자열을 전부 대문자로 바꿔주는 메소드(Hello -> HELLO)
	String changeToUpperCase(String msg) {//HelLo
		int len = msg.length();	//5
		String result = "";
		for (int i = 0; i < len; i++) {//0 1 2 3 4
			char ch = msg.charAt(i);//'H' 'e' 'l' 'L' 'o'
			//a : 97 / A : 65
			if(ch>='a' && ch<='z') {
				result += (char)(ch-32);// "HE" "HEL" "HELLO"
			}else {
				result += ch;//"H" "HELL"
			}
		}
		return result;
	}
	
//	문자열을 거꾸로 바꿔주는 메소드(HELLO -> OLLEH)
//	"Hello".charAt(1) : 'e'
	String reverse(String msg) {
		String result = "";
		int len = msg.length();
		for (int i = 0; i < len; i++) {//0 1 2 3 4
			result = msg.charAt(i) + result; //'H' 'E' 'L' 'L' 'O'
		}
		return result;
	}
//	문자열이 숫자로 이루어져 있는지 검사하는 메소드	"324"
	boolean isDigit(String msg) {//"324"
		int len = msg.length();//3
		for (int i = 0; i < len; i++) {//0 1 2
			char ch = msg.charAt(i);// '3' '2' '4'
			if(ch<'0' || ch>'9') {
				return false;
			}
		}
		return true;
	}
//	문자열의 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드(Hell!O123 -> hELL!o123)
	String changeCase(String msg) {
		int len = msg.length();
		String result = "";
		for (int i = 0; i < len; i++) {
			char ch = msg.charAt(i);
			//a : 97 / A : 65
			if(ch>='a' && ch<='z') {
				result += (char)(ch-32);
			}else if(ch>='A' && ch<='Z') {
				result += (char)(ch+32);
			}else {
				result += ch;
			}
		}
		return result;
	}
//	정수를 한글로 바꿔주는 메소드(1234567 -> "일이삼사오육칠")
	String changeToHangle(int num) {//202110
		//				 0 12 34 56 78 9
		String hangle = "공일이삼사오육칠팔구";
		String data = num+"";//"202110"
		String result = "";
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);//'2' '0' '2' '1' '1' '0'
			//'2' -> 2		50-48 = 2
			//(int)'2' --> 50
			int idx = ch-48;		//2 0 2 1 1 0
			result += hangle.charAt(idx);//'이' '공' '이' '일' '일' '공'
		}
		return result;
	}
}













