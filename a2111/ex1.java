package a2111;

import java.util.Random;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		int[][] arr = new int[5][5];
		double total=0, contador=0, media;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				arr[i][j] = rn.nextInt(10);
				if(arr[i][j]%2==0) {
					total+=arr[i][j];
					contador++;
				}
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.printf("\n");
			for(int j=0; j<5; j++) {
				System.out.printf(arr[i][j] +" ");
			}
		}
		
		media = total/contador;
		System.out.println("\n\nMédia dos números pares: " +media);
	}

}
