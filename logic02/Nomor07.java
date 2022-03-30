package logic02;

import java.util.Scanner;

public class Nomor07 {
	public static void Resolve() {

		System.out.println("=====NOMOR 7=====");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int i,j ;
		int baris = 3;
		int [][]  twoDimensionArray  = new int [baris][n];
		int numberHelper = 0;
		
		for( i = 0; i <baris; i++) 
		{
			for( j = 0; j < n; j++) 
			{
			twoDimensionArray[i][j] = numberHelper;
			System.out.print(twoDimensionArray[i][j]+ " ");
			numberHelper+=1;
			}	
			System.out.println();
		}
		
	}
	
}
