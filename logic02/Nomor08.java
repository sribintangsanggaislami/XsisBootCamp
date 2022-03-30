package logic02;

import java.util.Scanner;

public class Nomor08 {
	public static void Resolve() {
		System.out.println("=====NOMOR 8=====");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int i,j ;
		int baris = 3;
		int [][]  twoDimensionArray  = new int [baris][n];
		int numberHelper = 0;
		int numberHelper2 =0;
		for( i = 0; i <baris; i++) 
		{
		if (i > 0) 
		{
			for(j =0 ; j< n;j++) 
			{
				if(i == 1)
				{
					twoDimensionArray[i][j] = numberHelper;
					System.out.print(twoDimensionArray[i][j]+ " ");
					numberHelper+=2;
				}
				else 
				{
					twoDimensionArray[i][j] = numberHelper2+j;
					System.out.print(twoDimensionArray[i][j]+ " ");
					numberHelper2+=2;
				}
			}
		}
		else 
		{
			for(j = 0; j < n; j++)
				{
					twoDimensionArray[i][j] = j;
					System.out.print(twoDimensionArray[i][j]+ " ");
				}
		}
		System.out.println();
	}

	}
}
