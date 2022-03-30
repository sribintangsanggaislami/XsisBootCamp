package logic02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Nomor11.Resolve();
		
		
		
		
		
		
		
		//LOGIC 2
		// ARRAY 2 DIMENSI
		
			
		
//			System.out.println("=====NOMOR 1=====");
//			Scanner input = new Scanner(System.in);
//			int n = input.nextInt();
//			System.out.println("masukkan nilai n:");
//			
//			int i,j;
//		
//			int numberHelper;
//			int [][]  twoDimensionArray  = new int [n][n];
//			
//			
//			for( i = 0; i <2; i++) 
//			{	System.out.println("\n");
//				numberHelper = 1;
//				for( j = 0; j < n; j++) 
//				{
//					if(i == 0) 
//					{
//					twoDimensionArray[i][j] = numberHelper -1;
//					System.out.print(twoDimensionArray[i][j]+ " ");
//					numberHelper +=1;
//					
//					}else
//					{
//						twoDimensionArray[i][j] = numberHelper;
//						System.out.print(twoDimensionArray[i][j] + " ");
//						numberHelper *=3;
//					}
//					
//			
//				}
//			}
//			
//			System.out.println("\n");
//			System.out.println("====NOMOR 2====");
//			System.out.print("Masukkan nilai :");
//			Scanner input2 = new Scanner (System.in);
//			int n2 = input.nextInt();
//			int [][]  twoDimensionArray2  = new int [n][n];
//			int numberHelper2;
//			
//			for (i = 0; i<2; i++) 
//			{
//				System.out.println("\n");
//				numberHelper2 = 1;
//				for (j = 0; j < n; j++)
//				{
//					if(i == 0) 
//					{
//						twoDimensionArray2 [i][j] = numberHelper2 -1;
//						System.out.print(twoDimensionArray2 [i][j]+ " ");
//						numberHelper2 +=1;
//					}
//					else if (i == twoDimensionArray.length -5 || i== twoDimensionArray.length -2 )
//					{
//						twoDimensionArray2[i][j] = numberHelper2;
//						System.out.print(twoDimensionArray2 [i][j]+ " ");
//						numberHelper2 *= (-3);
//					}
//					else 
//					{
//						twoDimensionArray2[i][j] = numberHelper2;
//						System.out.print(twoDimensionArray2 [i][j]+ " ");
//						numberHelper2 *= 3;
//					}
//				}
//			}
	
		
		
		
		
//		System.out.println("=====NOMOR 2=====");
//		System.out.println("masukkan nilai n1 dan n2:");
//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
//		Scanner input2 = new Scanner(System.in);
//		int n2 = input2.nextInt();
//		
//		
//		int baris = 2;
//		int [][]  twoDimensionArray  = new int [baris][n];
//		
//		
//		for( int i = 0; i <baris; i++) 
//		{	
//			for(int j = 0; j < n; j++) 
//			{
//				if(i == 0) 
//				{
//				twoDimensionArray[i][j] = j;
//				System.out.print(twoDimensionArray[i][j]+ " ");
//				}
//				else if(j !=  2 && j != 5) 
//				{
//					twoDimensionArray[i][j] = (int) Math.pow(n2,j);
//					System.out.print(twoDimensionArray[i][j] + " ");
//				}
//				else
//				{
//					twoDimensionArray[i][j] = (int) Math.pow(n2,j);
//					System.out.print("-" +twoDimensionArray[i][j] + " ");
//					
//				}
//				
//		
//			}
//			System.out.println();
//		}
//		
		
//		System.out.println("=====NOMOR 3=====");
//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
//		Scanner input2 = new Scanner(System.in);
//		int n2 = input2.nextInt();
//		System.out.println("masukkan nilai n1 dan n2:");
//		
//		int baris = 2;
//		int [][]  twoDimensionArray  = new int [baris][n];
//		
//		int numberHelper = 3;
//		
//		for( int i = 0; i <baris; i++) 
//		{	
//			for(int j = 0; j < n; j++) 
//			{
//				if(i == 0) 
//				{
//				twoDimensionArray[i][j] = j;
//				System.out.print(twoDimensionArray[i][j]+ " ");
//				
//				}
//				else if(j <= 2)
//				{
//					
//					twoDimensionArray[i][j] = numberHelper;
//					System.out.print(twoDimensionArray[i][j] + " ");
//					numberHelper *=2;
//				
//				}
//				else
//				{	
//					
//					twoDimensionArray[i][j] = numberHelper;
//					System.out.print(twoDimensionArray[i][j] + " ");
//					numberHelper /=2;
//					
//				}
//				
//			}
//			System.out.println();
//		}

		
//		System.out.println("=====NOMOR 4=====");
//		System.out.println("masukkan nilai n1 dan n2:");
//		Scanner input1 = new Scanner(System.in);
//		int n1 = input1.nextInt();
//		Scanner input2 = new Scanner(System.in);
//		int n2 = input2.nextInt();
//		
//		
//		int baris = 2;
//		int [][]  twoDimensionArray  = new int [baris][n1];
//		int numberHelper =n2;
//		int numberHelper2=1;
//		
//		for( int i = 0; i < twoDimensionArray.length; i++) 
//		{
//			if(i>0) 
//			{
//				for(int j = 0; j <twoDimensionArray[i].length; j++) 
//				{
//					if( j % 2 == 1)
//					{
//						twoDimensionArray[i][j] = numberHelper;
//						System.out.print(twoDimensionArray [i][j] + " ");
//						numberHelper+=5;
//					}
//					else 
//					{
//						twoDimensionArray[i][j] = numberHelper2;
//						System.out.print(twoDimensionArray [i][j] + " ");
//						numberHelper2+=1;
//						
//					}
//				}				
//			}
//			else 
//			{
//				for(int j = 0; j < twoDimensionArray[i].length; j++)
//				{
//					twoDimensionArray[i][j] = j;
//					System.out.print(twoDimensionArray[i][j]+ " ");
//				}
//			}
//			System.out.println();
//		}

		


//		
//		System.out.println("=====NOMOR 5=====");
//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
//		
//		int i,j ;
//		int baris = 3;
//		int [][]  twoDimensionArray  = new int [baris][n];
//		int numberHelper = 0;
//		
//		for( i = 0; i <baris; i++) 
//		{
//			for( j = 0; j < n; j++) 
//			{
//			twoDimensionArray[i][j] = numberHelper;
//			System.out.print(twoDimensionArray[i][j]+ " ");
//			numberHelper+=1;
//			}	
//			System.out.println();
//		}
//		
//	}
//		System.out.println("=====NOMOR 6=====");
//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
//		
//		int i,j ;
//		int baris = 3;
//		int [][]  twoDimensionArray  = new int [baris][n];
//		int numberHelper = 1;
//		int numberHelper2 =1;
//		
//		for( i = 0; i <baris; i++) 
//		{
//			if (i > 0) 
//			{
//				for(j =0 ; j< n;j++) 
//				{
//					if(i == 1)
//					{
//						twoDimensionArray[i][j] = numberHelper;
//						System.out.print(twoDimensionArray[i][j]+ " ");
//						numberHelper*=7;
//					}
//					else 
//					{
//						twoDimensionArray[i][j] = numberHelper2+j;
//						System.out.print(twoDimensionArray[i][j]+ " ");
//						numberHelper2*=7;
//					}
//				}
//			}
//			else 
//			{
//				for(j = 0; j < n; j++)
//					{
//						twoDimensionArray[i][j] = j;
//						System.out.print(twoDimensionArray[i][j]+ " ");
//					}
//			}
//			System.out.println();
//		}
				
		
		
		
		
		
	
//		System.out.println("=====NOMOR 7=====");
//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
//		
//		int i,j ;
//		int baris = 3;
//		int [][]  twoDimensionArray  = new int [baris][n];
//		int numberHelper = 0;
//		
//		for( i = 0; i <baris; i++) 
//		{
//			for( j = 0; j < n; j++) 
//			{
//			twoDimensionArray[i][j] = numberHelper;
//			System.out.print(twoDimensionArray[i][j]+ " ");
//			numberHelper+=1;
//			}	
//			System.out.println();
//		}
//		
//	}

		
		
//		System.out.println("=====NOMOR 8=====");
//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
//		
//		int i,j ;
//		int baris = 3;
//		int [][]  twoDimensionArray  = new int [baris][n];
//		int numberHelper = 0;
//		int numberHelper2 =0;
//		for( i = 0; i <baris; i++) 
//		{
//		if (i > 0) 
//		{
//			for(j =0 ; j< n;j++) 
//			{
//				if(i == 1)
//				{
//					twoDimensionArray[i][j] = numberHelper;
//					System.out.print(twoDimensionArray[i][j]+ " ");
//					numberHelper+=2;
//				}
//				else 
//				{
//					twoDimensionArray[i][j] = numberHelper2+j;
//					System.out.print(twoDimensionArray[i][j]+ " ");
//					numberHelper2+=2;
//				}
//			}
//		}
//		else 
//		{
//			for(j = 0; j < n; j++)
//				{
//					twoDimensionArray[i][j] = j;
//					System.out.print(twoDimensionArray[i][j]+ " ");
//				}
//		}
//		System.out.println();
//	}

		
//		System.out.println("=====NOMOR 9=====");
//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
//		Scanner input2 = new Scanner(System.in);
//		int n2 = input2.nextInt();
//		int i,j ;
//		int baris = 3;
//		int [][]  twoDimensionArray  = new int [baris][n];
//		int numberHelper = 0;
//		
//		for( i = 0; i <baris; i++) 
//			{
//			if (i > 0) 
//			{
//				for(j =0 ; j< n;j++) 
//				{
//					if(i == 1)
//					{
//						twoDimensionArray[i][j] = numberHelper;
//						System.out.print(twoDimensionArray[i][j]+ " ");
//						numberHelper+=3;
//					}
//					else 
//					{
//						twoDimensionArray[i][j] = numberHelper-n2;
//						System.out.print(twoDimensionArray[i][j]+ " ");
//						numberHelper-=n2;
//					}
//				}
//			}
//			else 
//			{
//				for(j = 0; j < n; j++)
//					{
//						twoDimensionArray[i][j] = j;
//						System.out.print(twoDimensionArray[i][j]+ " ");
//					}
//			}
//			System.out.println();
//		}
		
		
//		System.out.println("=====NOMOR 10=====");
//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
//		Scanner input2 = new Scanner(System.in);
//		int n2 = input2.nextInt();
//		int i,j ;
//		int baris = 3;
//		int [][]  twoDimensionArray  = new int [baris][n];
//		int numberHelper = 0;
//		int numberHelper2 = 0;
//		
//		for( i = 0; i <baris; i++) 
//			{
//			if (i > 0) 
//			{
//				for(j =0 ; j< n;j++) 
//				{
//					if(i == 1)
//					{
//						twoDimensionArray[i][j] = numberHelper;
//						System.out.print(twoDimensionArray[i][j]+ " ");
//						numberHelper+=3;
//					}
//					else 
//					{
//						twoDimensionArray[i][j] = numberHelper2;
//						System.out.print(twoDimensionArray[i][j]+ " ");
//						numberHelper2+=4;
//					}
//				}
//			}
//			else 
//			{
//				for(j = 0; j < n; j++)
//					{
//						twoDimensionArray[i][j] = j;
//						System.out.print(twoDimensionArray[i][j]+ " ");
//					}
//			}
//			System.out.println();
//		}
//	
//		
//		
//		System.out.println("=====NOMOR 11=====");
//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
//		Scanner input2 = new Scanner(System.in);
//		int n2 = input2.nextInt();
//		int i,j ;
//		int baris = 5;
//		int [][]  twoDimensionArray  = new int [baris][n];
//		
//		for (int i =0; i < n;i++) 
//		{
//			for(int j = 0; j< n;j++) 
//			{
//				twoDimensionArray[i][j] = j;
//				System.out.print(twoDimensionArray[i][j]+ " ");
//			}
//		}
//		for (int k =0; k < n; k++) 
//		{
//			
//		}
		
//	
		
		
		
		
	}	
}

