package day06;

import java.util.Iterator;

public class ArrTest {
	public static void main(String[] args) {
		int[][] arrData = {
			{10,20,30},
			{40,50,60}
		};
		
		int[][] arrData2 = new int[2][3];
		arrData2[0][1] = 20;
		
		int[][] arrData3 = new int[2][];
		arrData3[0] = new int[3];
		arrData3[1] = new int[1];
		
//		System.out.println(arrData[0][0]);
//		System.out.println(arrData[0][1]);
//		System.out.println(arrData[0][2]);
		
//		System.out.println(arrData[1][0]);
//		System.out.println(arrData[1][1]);
//		System.out.println(arrData[1][2]);
//		for(int i=0;i<6;i++) {
////			i : 0 1 2 3 4 5
//			System.out.println(arrData[i/3][i%3]);
//		}
//		for (int j = 0; j < 3; j++) {
//			System.out.println(arrData[0][j]);
//		}
//		for (int j = 0; j < 3; j++) {
//			System.out.println(arrData[1][j]);
//		}
		
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.println(arrData[i][j]);
//			}
//		}
		
		for (int i = 0; i < arrData.length; i++) {
			for (int j = 0; j < arrData[i].length; j++) {
				System.out.println(arrData[i][j]);
			}
		}
		
	}
}






