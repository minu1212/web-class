package access1;

public class AccessMain1 {
	public static void main(String[] args) {
		AccessTest obj = new AccessTest();
//		System.out.println(obj.data3);
		System.out.println(obj.getData3());
		
//		obj.data3 = 3000;
		obj.setData3(3000);
	}
}
