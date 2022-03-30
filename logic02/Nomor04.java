package logic02;

import java.util.Scanner;

public class Nomor04 {
	public static void Resolve() {
	
		System.out.println("=====NOMOR 4=====");
		System.out.println("masukkan nilai n1 dan n2:");
		Scanner input1 = new Scanner(System.in);
		int n1 = input1.nextInt();
		Scanner input2 = new Scanner(System.in);
		int n2 = input2.nextInt();
		
		
		int baris = 2;
		int [][]  twoDimensionArray  = new int [baris][n1];
		int numberHelper =n2;
		int numberHelper2=1;
		
		for( int i = 0; i < twoDimensionArray.length; i++) 
		{
			if(i>0) 
			{
				for(int j = 0; j <twoDimensionArray[i].length; j++) 
				{
					if( j % 2 == 1)
					{
						twoDimensionArray[i][j] = numberHelper;
						System.out.print(twoDimensionArray [i][j] + " ");
						numberHelper+=5;
					}
					else 
					{
						twoDimensionArray[i][j] = numberHelper2;
						System.out.print(twoDimensionArray [i][j] + " ");
						numberHelper2+=1;
						
					}
				}				
			}
			else 
			{
				for(int j = 0; j < twoDimensionArray[i].length; j++)
				{
					twoDimensionArray[i][j] = j;
					System.out.print(twoDimensionArray[i][j]+ " ");
				}
			}
			System.out.println();
		}
	}	
}

