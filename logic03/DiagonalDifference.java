package logic03;

import java.util.Scanner;

public class DiagonalDifference {
	public static int main (int n2,int[] input) {
		int DiagonalRight = 0;
		int DiagonalLeft = 0;
		int numberHelper=0;
		
		int [][] dataArray = new int [n2][n2];
		for(int i = 0; i<n2;i++){
			for(int j = 0; j<n2;j++){
				dataArray[i][j] = input[numberHelper];
				numberHelper++;
//				System.out.print(dataArray[i][j]);

			}
			System.out.println();
		}
		for(int i = 0;i<dataArray.length;i++){
			for(int j=0;j<dataArray.length;j++){
				if(i==j){
					DiagonalRight =DiagonalRight+dataArray[i][j];
//					System.out.print(DiagonalRight);
				}
			}
			System.out.println();
		}
		int numberHelper2 =n2-1;
		for(int i =0;i<dataArray.length;i++){
			for( int j =0;j< dataArray.length;j++){

				if(j== numberHelper2){
					DiagonalLeft= DiagonalLeft+ dataArray[i][numberHelper2];
	//				System.out.print(dataArray[i][numberHelper2]);
				}
			}
			numberHelper2-=1;
			System.out.println();
		}
		System.out.println(DiagonalLeft);
		System.out.println(DiagonalRight);
		int hasil = Math.abs(DiagonalRight-DiagonalLeft);

		return hasil;
	}
}
	
//soal 04
//		System.out.println("Enter the Array :");
//		int n = input.nextInt();
//		System.out.println(DiagonalDufference.main(n,intArray));
		