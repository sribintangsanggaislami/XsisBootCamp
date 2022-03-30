package logic03;

import java.util.Scanner;

public class Staircase {
	public static void main(String[] args) {
		 System.out.println("=======STAIRCASE=====");
		 
		 System.out.print("Masukan angka: ");
		 Scanner input = new Scanner(System.in);
		 int n = input.nextInt();

		 for(int i = 0;i <n; i++){
		 	for(int j =n-1;j>i; j--){
		 		System.out.print(" ");
		 		}
			
		 for(int k = 0; k<=i; k++){
			 System.out.print("#");
		 	}System.out.println();
		 }
	}

}
