package logic02;

import java.util.Scanner;

public class Nomor12 {
	public static void Resolve() {
//versi awal
//		System.out.println("====NOMOR 12====");
//		Scanner input = new Scanner(System.in);
//		System.out.println("Masukkan nilai : ");
//		int n = input.nextInt();
//		int [][] numberArray = new int [n][n];
//		System.out.println("Jawaban= ");
//		int numberHelper =1;
//		int numberHelper2=(n*2-1);
//		int numberHelper3=(n*3-4);
//		
//		for(int i = 0;i <n ; i++) {
//			for(int j = 0; j<n;j++) {
//				if(j==i) {
//					System.out.print(numberHelper+" ");
//					numberHelper+=1;
//				}else if(i==(n-1)) {
//					System.out.print(numberHelper2+" ");
//					numberHelper2-=1;
//				}else if((i>1)&&(j==0)) {
//					System.out.print(numberHelper3+" ");
//					numberHelper3+=1;
//					
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}

		
		
		
 		System.out.print("Masukan nilai n:");
		 Scanner input = new Scanner(System.in);
		 int n =  input.nextInt();
		 int [][] numberArray = new int [n][n];
		
		 for (int i = 0; i < n; i++){
		 	for(int j = 0;j <n;j++){
		 		if( i==j){
		 			numberArray[i][j]=i+1;
		 		}
		 	}
				
		 }
		 for(int i = n-1;i>=0;i--){
		 	for(int j = n-1;j>=0;j--){
		 		if(i== n-1 && j!=n-1){
		 			numberArray[i][j]=numberArray[i][j+1]+1;
		 		}
		 	}
		 }
		 for(int i=n-2;i>=0;i--){
		 	for(int j = 0; j<n;j++){
		 		if( i>1 && j==0){
		 			numberArray[i][j] =numberArray[i+1][j]+1;
					
		 		}
		 	}
		 }
		 for(int i =0; i< n;i++){
		 	for(int j =0; j<n;j++){
		 		if (numberArray[i][j] !=0){
		 			System.out.print(numberArray[i][j]+"\t");
		 		}else{
		 			System.out.print("\t");
		 		}
		 	}
		 	System.out.println();
		 }

	}
}
