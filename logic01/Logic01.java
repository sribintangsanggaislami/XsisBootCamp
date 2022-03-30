package logic01;

import java.util.Scanner;

public class Logic01 {

	public static void main(String[] args) {

		
		// untuk input
		Scanner input = new Scanner(System.in);
		System.out.println("please enter the value :");
		int n = input.nextInt();
		
		int [] numberArray = new  int[n];
		int numberHelper = 1;
	
		System.out.println("====Tugas no 1====");
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = numberHelper;
			System.out.print(numberArray[i]+" ");
			numberHelper += 2;		
		}
		System.out.print("\n");
		
		numberHelper = 2;
		System.out.println("====Tugas no 2====");
		for (int i = 0; i < numberArray.length; i++)
		{
			numberArray[i] = numberHelper;
			System.out.print(numberArray[i]+" ");
			numberHelper += 2;	
		}
		
		System.out.print("\n");
		numberHelper = 1;
		System.out.println("====Tugas no 3====");
		for (int i = 0; i < numberArray.length; i++)
		{
			numberArray[i] = numberHelper;
			System.out.print(numberArray[i]+" ");
			numberHelper += 3;	
		}
		
		System.out.print("\n");
		numberHelper = 1;
		System.out.println("====Tugas no 4====");
		for (int i = 0; i < numberArray.length; i++)
		{
			numberArray[i] = numberHelper;
			System.out.print(numberArray[i]+" ");
			numberHelper += 4;	
		}
		
		System.out.print("\n");
		numberHelper = 1;
		System.out.println("====Tugas no 5====");
		for (int i = 0; i < numberArray.length; i++)
		{	
			if(i == numberArray.length -5 || i == numberArray.length -2) 
			{
			System.out.print("* ");
			}
			else 
			{
			numberArray[i] = numberHelper;
			System.out.print(numberArray[i]+" ");
			numberHelper += 4;
			}
		}
		
		
		System.out.print("\n");
		numberHelper = 1;
		System.out.println("====Tugas no 6====");
		for (int i = 0; i < numberArray.length; i++)
		{	
			if(i == 2 || i == 5) 
			{
			System.out.print("* ");
			}
			else 
			{
			numberArray[i] = numberHelper;
			System.out.print(numberArray[i]+" ");
			numberHelper += 4;
			}
		}
		
		
		System.out.print("\n");
		numberHelper = 2;
		System.out.println("====Tugas no 7====");
		for (int i = 0; i < numberArray.length; i++)
		{	
			
			
			numberArray[i] = numberHelper;
			System.out.print(numberArray[i]+" ");
			numberHelper *= 2;
			
		}
		
		System.out.print("\n");
		numberHelper = 3;
		System.out.println("====Tugas no 8====");
		for (int i = 0; i < numberArray.length; i++)
		{	
			numberArray[i] = numberHelper;
			System.out.print(numberArray[i]+" ");
			numberHelper *= 3;
		}
		
		System.out.print("\n");
		numberHelper = 4;
		System.out.println("====Tugas no 9====");
		for (int i = 0; i < numberArray.length; i++)
		{	
			if(i == 2 || i == 5) 
			{
			System.out.print("* ");
			}
			else 
			{
			numberArray[i] = numberHelper;
			System.out.print(numberArray[i]+" ");
			numberHelper *= 4;
			}
		}
		
		System.out.print("\n");
		numberHelper = 3;
		System.out.println("====Tugas no 10====");
		for (int i = 0; i < numberArray.length; i++)
		{	
			if (i != 3 ) 
			{ 	
				numberArray[i] = numberHelper;
				System.out.print(numberArray[i]+" ");
				numberHelper *= 3;
			}
			else 
			{
				System.out.print("XXX ");
				numberHelper *= 3;

			}
		}
		
		System.out.print("\n");
		numberHelper = 1; int zeroHelperNumber = 1;
		System.out.println("====Tugas no 11====");
		for (int i = 0; i < numberArray.length; i++)
		{	
			numberArray[i] = numberHelper;
			System.out.print(numberArray[i]+" ");
			int fibonacci = numberHelper + zeroHelperNumber;
			numberHelper= zeroHelperNumber;
			zeroHelperNumber=fibonacci;
						
		}
	
		System.out.print("\n");
		
		System.out.println("====Tugas no 12====");
		for(int i=1;i<=17;i++) {
			numberHelper = 0; 
			for(int j=1;j<=i;j++) {
				if(i%j == 0){
				numberHelper += 1; 
				}
			}
			if(numberHelper == 2){
			System.out.print(i+" ");
			}				
		}
		
	}
}