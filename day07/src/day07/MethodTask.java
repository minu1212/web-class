package day07;

public class MethodTask {
	public static void main(String[] args) {
		//1~10 ����ϴ� �޼ҵ�
		void print1To10() {
			for (int i = 0; i <= 10; i++) {
				System.out.println(i);
			}
		}
		//1~10 ���� �����ִ� �޼ҵ�
		int sum1To10 () {
			int sum = 0;
			for (int i = 0; i <= 10; i++) {
				sum += i;
			}
			return sum;
		}
		//1~n ���� �����ִ� �޼ҵ�
		int sum1ToN(int n) {
			int sum = 0;
			for (int i = 0; i <= n; i++) {
				sum += i;
			}
			return sum;
		}
		//�������ǳ����� ����� �����ִ� �޼ҵ�
		  double div(int num1, int num2) {
		      return num1/(double)num2;
		   }

		//� ���ڿ��� n�� ��ū ����ϴ� �䵵��
		void printMsg(String msg, int n) {
			for (int i = 0; i < n; i++) {
				System.out.println(msg);
			}
		}
		//n���� n������ ���� �����ִ� �޼ҵ�
		int sumNtoM(int n, int m) {
			int sum = 0;
			for (int i = n; i < m; i++) {
				sum += i;
			}
			return sum;
		}
//		���ڿ��� ���� �빮�ڷ� �ٲ��ִ� �޼ҵ�(Hello -> HELLO)
		String changToUpperCase(String msg) {
			int len = msg.length();
			String result = "";//����+���� = ����
			for (int i = 0; i < len; i++) {
				//for������ length�� �������� �ʴ�.
				char ch = msg.charAt(i);
				//a : 97 / A : 65
				if(ch>='a' && ch<='z') {
					result += (char)(ch-32);
				}else {
					//else���� ���ٸ� �ҹ��ڸ� �ԷµǾ� �빮�ڴ� �Էµ��� �ʴ´�.
					result += ch;//���� �� ����
				}
			}
			return result;
		}
//		���ڿ��� �Ųٷ� �ٲ��ִ� �޼ҵ�(HELLO -> OLLEH)
		String reverse(String msg) {
			String result = "";
			int len = msg.length();
			for (int i = 0; i < len; i++) {
				result = msg.charAt(i) + result;
			}
			return result;
		}
		
//		���ڿ��� ���ڷ� �̷���� �ִ��� �˻��ϴ� �޼ҵ�   "324"
		boolean isDigit(String msg) {//3
			int len = msg.length();
			for (int i = 0; i < len; i++) { //012
				char ch =  msg.charAt(i);//'3' '2' '4'
				if(ch<'0' || ch>'9') {//���� ���ڷ� �Ǿ��ִٸ� �������� �ʴ´�.
					return false;
				}
			}
			return true;
		}
//		���ڿ��� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�(Hell!O123 -> hELL!o123)
		String changeCase(String msg) {
			int len = msg.length();
			String result = "";
			for (int i = 0; i < len; i++) {
				//for������ length�� �������� �ʴ�.
				char ch = msg.charAt(i);
				//a : 97 / A : 65
				if(ch>='a' && ch<='z') {
					result += (char)(ch-32);
				}else if(ch>='A' && ch<='Z'){
					result += (char)(ch+32);
				}
				else {
					//else���� ���ٸ� �ҹ��ڸ� �ԷµǾ� �빮�ڴ� �Էµ��� �ʴ´�.
					result += ch;
				}
			}
			return result;
		}
//		������ �ѱ۷� �ٲ��ִ� �޼ҵ�(1234567 -> "���̻�����ĥ")
		String changeToHangle(int num) {//202110
			//               0 1 2 3 4 5 6 7 8 9
			String hangle = "�����̻�����ĥ�ȱ�";
			String data = num+"";//"202110"
			String result = "";
			for (int i = 0; i < data.length(); i++) {
				char ch = data.charAt(i);//'2' '0' '1' '1' '0'
				//'2' -> 2		50-48 = 2
//				(int)'2' --> 50
				int idx = ch-48;
				result += hangle.charAt(idx);
			}
			return result;
		}

}
