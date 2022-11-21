package a2111;

import java.util.Random;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		int[][] arr = new int[5][5];
		int[][] arr2 = new int[5][5];
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				arr[i][j] = rn.nextInt(10);
				arr2[i][j] = arr[i][j]*arr[i][j]*arr[i][j];
			}
		}
		System.out.println("Primeira matriz: ");
		for(int i=0; i<5; i++) {
			System.out.printf("\n");
			for(int j=0; j<5; j++) {
				System.out.printf(arr[i][j] +" ");
			}
		}
		
		System.out.println("\n\nSegunda matriz: ");
		for(int i=0; i<5; i++) {
			System.out.printf("\n");
			for(int j=0; j<5; j++) {
				System.out.printf(arr2[i][j] +" ");
			}
		}
	}

}
