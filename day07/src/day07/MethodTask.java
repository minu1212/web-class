package day07;

public class MethodTask {
	public static void main(String[] args) {
	}
//	1~10 ����ϴ� �޼ҵ�
	void print1To10() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
//	1~10 ���� �����ִ� �޼ҵ�
	int sum1To10() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}
//	1~n ���� �����ִ� �޼ҵ�
	int sum1ToN(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;		
	}
//	�� ������ ������ ����� �����ִ� �޼ҵ�
	double div(int num1, int num2) {
		return num1/(double)num2;
	}

//	� ���ڿ��� n����ŭ ����ϴ� �޼ҵ�
	void printMsg(String msg, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(msg);
		}
	}
	
//	n���� m������ �� �����ִ� �޼ҵ�
	int sumNtoM(int n,int m) {
		int sum = 0;
		for (int i = n; i <= m; i++) {
			sum += i;
		}
		return sum;
	}
	// "���ڿ�".charAt(index)	: index��°�� ���� ������(char Ÿ��)
	// "���ڿ�".length()		: ���ڿ��� ����(int Ÿ��)
//	���ڿ��� ���� �빮�ڷ� �ٲ��ִ� �޼ҵ�(Hello -> HELLO)
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
	
//	���ڿ��� �Ųٷ� �ٲ��ִ� �޼ҵ�(HELLO -> OLLEH)
//	"Hello".charAt(1) : 'e'
	String reverse(String msg) {
		String result = "";
		int len = msg.length();
		for (int i = 0; i < len; i++) {//0 1 2 3 4
			result = msg.charAt(i) + result; //'H' 'E' 'L' 'L' 'O'
		}
		return result;
	}
//	���ڿ��� ���ڷ� �̷���� �ִ��� �˻��ϴ� �޼ҵ�	"324"
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
//	���ڿ��� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�(Hell!O123 -> hELL!o123)
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
//	������ �ѱ۷� �ٲ��ִ� �޼ҵ�(1234567 -> "���̻�����ĥ")
	String changeToHangle(int num) {//202110
		//				 0 12 34 56 78 9
		String hangle = "�����̻�����ĥ�ȱ�";
		String data = num+"";//"202110"
		String result = "";
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);//'2' '0' '2' '1' '1' '0'
			//'2' -> 2		50-48 = 2
			//(int)'2' --> 50
			int idx = ch-48;		//2 0 2 1 1 0
			result += hangle.charAt(idx);//'��' '��' '��' '��' '��' '��'
		}
		return result;
	}
}













