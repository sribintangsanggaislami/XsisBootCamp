package logic02;

import java.util.Scanner;

public class Nomor03 {
	public static void Resolve() 
	{
		// untuk input
		
		System.out.println("=====NOMOR 3=====");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		Scanner input2 = new Scanner(System.in);
		int n2 = input2.nextInt();
		System.out.println("masukkan nilai n1 dan n2:");
		
		int baris = 2;
		int [][]  twoDimensionArray  = new int [baris][n];
		int numberHelper;
		
		for( int i = 0; i <baris; i++) 
		{	
			for(int j = 0; j < n; j++) 
			{
				if(i == 0) 
				{
				twoDimensionArray[i][j] = j;
				System.out.print(twoDimensionArray[i][j]+ " ");
				}
				else if(j <= 3) 
				{	
					numberHelper =3;
					twoDimensionArray[i][j] = numberHelper;
					System.out.print(twoDimensionArray[i][j] + " ");
					numberHelper *=2;
				}
				else
				{
					numberHelper =3;
					twoDimensionArray[i][j] = numberHelper;
					System.out.print(twoDimensionArray[i][j] + " ");
					numberHelper /=2;
					
				}
				
		
			}
			System.out.println();
		}

	}
}
