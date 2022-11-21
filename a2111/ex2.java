package a2111;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int[][] arr = new int[7][4];
		int[] pos = new int[1];
		int menorValor=9999999;
		
		for(int i=0; i<7; i++) {
			for(int j=0; j<4; j++) {
				System.out.println("Digite o valor para a posição " +i +"x" +j);
				arr[i][j] = ler.nextInt();
				if(arr[i][j]<menorValor) {
					menorValor = arr[i][j];
				}
			}
		}
		
		for(int i=0; i<7; i++) {
			System.out.printf("\n");
			for(int j=0; j<4; j++) {
				System.out.printf(arr[i][j] +" ");
			}
		}
		System.out.println("\n\nMenor valor contido na matriz: " +menorValor);

	}

}
