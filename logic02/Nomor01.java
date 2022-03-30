package logic02;

import java.util.Scanner;

public class Nomor01 {
	public static void Resolve() 
	{
		// untuk input
		
		System.out.println("=====NOMOR 1=====");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		Scanner input2 = new Scanner(System.in);
		int n2 = input2.nextInt();
		System.out.println("masukkan nilai n1 dan n2:");
		
		int baris = 2;
		int [][]  twoDimensionArray  = new int [baris][n];
		
		
		for( int i = 0; i <baris; i++) 
		{	
			for(int j = 0; j < n; j++) 
			{
				if(i == 0) 
				{
					twoDimensionArray[i][j] = j;
					System.out.print(twoDimensionArray[i][j]+ " ");
				}
				else if(i == 2 || i == (n)-2 ) 
				{
					twoDimensionArray[i][j] = (int) Math.pow(n2,j);
					System.out.print("-"+twoDimensionArray[i][j] + " ");
				}
				else
				{
					twoDimensionArray[i][j] = (int) Math.pow(n2,j);
					System.out.print("-" +twoDimensionArray[i][j] + " ");
				}
			}	
		}
		
			System.out.println();

	}
	
}
