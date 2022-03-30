package logic02;

import java.util.Scanner;

public class Nomor06 {
	public static void Resolve() {
	
		System.out.println("=====NOMOR 6=====");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int i,j ;
		int baris = 3;
		int [][]  twoDimensionArray  = new int [baris][n];
		int numberHelper = 1;
		int numberHelper2 =1;
		
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
						numberHelper*=7;
					}
					else 
					{
						twoDimensionArray[i][j] = numberHelper2+j;
						System.out.print(twoDimensionArray[i][j]+ " ");
						numberHelper2*=7;
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
