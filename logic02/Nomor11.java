package logic02;

import java.util.Scanner;

public class Nomor11 {
	public static void Resolve() {
		
		System.out.println("====NOMOR 11====");
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan nilai : ");
		int n = input.nextInt();
		System.out.println("Jawaban= ");

		for(int i = 0; i< n; i++) {
			for(int j = n; j>= i;j--) {
				System.out.print(" ");
			}
			for(int k = 0; k<=(i*2);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}	
}
