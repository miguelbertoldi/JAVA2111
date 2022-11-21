package a2111;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int[][] arr = new int[5][5];
		int somaL4=0, somaC2=0, somaDP=0, somaDS=0, somaT=0;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {				
				System.out.println("Digite o valor para a posição " +i +"x" +j +": ");
				arr[i][j] = ler.nextInt();
				if(i==3) {
					somaL4+=arr[i][j];
				}
				if(j==1) {
					somaC2+=arr[i][j];
				}
				if(i==j) {
					somaDP+=arr[i][j];
				}
				if(j+i==4) {
					somaDS+=arr[i][j];
				}
				somaT+=arr[i][j];
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.printf("\n");
			for(int j=0; j<5; j++) {
				System.out.printf(arr[i][j] +" ");
			}
		}
		
		System.out.println("\n\nSoma da linha 4: " +somaL4
				+ "\nSoma da coluna 2: " +somaC2
				+ "\nSoma da diagonal principal: " +somaDP
				+ "\nSoma da diagonal secundária: " +somaDS
				+ "\nSoma total dos elementos: " +somaT);

		}

	}

