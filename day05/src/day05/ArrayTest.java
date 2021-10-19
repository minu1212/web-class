package day05;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arData = {10,15,11,19,200};
//		System.out.println(arData);
		for (int i = 0; i < 5; i++) {
			System.out.println(arData[i]);
		}
		
//		int[] arData2 = new int[5];
////		arData2[0] = 1;
////		arData2[1] = 2;
////		arData2[2] = 3;
////		arData2[3] = 4;
////		arData2[4] = 5;
//		for (int i = 0; i < 5; i++) {
//			arData2[i] = i+1;
//		}
		
//		int data1 = 10;
//		int data2 = data1;
//		data2 += 5;
//		System.out.println(data1);
		
		int[] arData2 = {1,2,3,4,5};
		int[] arData3 = arData2;
		arData3[2] = 300;
		System.out.println(arData2[2]);
	}
}










