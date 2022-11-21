package a2111;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[7][8];
		
		for(int i=0; i<7; i++) {
			for(int j=0; j<8; j++) {
				arr[i][j] = i+j;
			}
		}

		for(int i=0; i<7; i++) {
			System.out.printf("\n");
			for(int j=0; j<8; j++) {
				System.out.printf(arr[i][j] +" ");
			}
		}
	}

}
