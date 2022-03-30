package logic02;

import java.util.Scanner;

public class Nomor10 {
	public static void Resolve() {
		System.out.println("=====NOMOR 10=====");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		Scanner input2 = new Scanner(System.in);
		int n2 = input2.nextInt();
		int i,j ;
		int baris = 3;
		int [][]  twoDimensionArray  = new int [baris][n];
		int numberHelper = 0;
		int numberHelper2 = 0;
		
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
						numberHelper+=3;
					}
					else 
					{
						twoDimensionArray[i][j] = numberHelper2;
						System.out.print(twoDimensionArray[i][j]+ " ");
						numberHelper2+=4;
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
