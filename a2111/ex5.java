package a2111;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int[][] arr = new int[3][4];
		int[][] arr2 = new int[3][4];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.println("Digite o valor para a posição " +i +"x" +j +": ");
				arr[i][j] = ler.nextInt();
			} 
		}
		
		for(int i=0; i<3; i++) {
			System.out.printf("\n");
			for(int j=0; j<4; j++) {
				System.out.printf(arr[i][j] +" ");
			} 
		}
		
		System.out.println("\n\n");
		for(int i=0; i<3; i++) {
			System.out.printf("\n");
			for(int j=0; j<4; j++) {
				if(i==0 | i==2) {
					if(j==0) {
						System.out.printf(arr[i][j] +" ");						
					}else {
						System.out.printf("-  ");	
				}
			} else{
				System.out.printf("-  ");											
			}
		}
		
	}
}
}
