package day06;

public class Continue {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if(i == 4) {
				continue;
			}
			System.out.println(i);
			
		}
		
		for (int i = 1; i <= 10; i++) {
			if(i == 4) {}
			else {
				System.out.println(i);
			}
		}
	}
}
