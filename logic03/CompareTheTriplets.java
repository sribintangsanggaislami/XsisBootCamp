package logic03;

import java.util.Scanner;

public class CompareTheTriplets {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int barisKolom = 3;
		int bantuAlice =0;
		int bantuBob = 0;
		
		int [][] matriks = new int [2][barisKolom];
		int [][] alice = new int [1][barisKolom];
		int [][] bob = new int [1][barisKolom];
		
		for(int i = 0; i <2; i++) {
			for(int j = 0;j< barisKolom;j++) {
				System.out.print("["+i+"]["+j+"]:");
				matriks[i][j] = input.nextInt();
			}
			System.out.println();
		}
		for(int i = 0; i<1;i++) {
			for(int j =0; j<barisKolom;j++) {
			alice[0][j] = matriks[0][j];
			bob [0][j] = matriks [1][j];
			if(alice[0][j]>bob[0][j]) {
				bantuAlice +=1;
			}else if(alice [0][j]< bob [0][j]) {
				bantuBob +=1;
			}else if (alice [0][j] == bob[0][j]) {
				bantuAlice+=0;
				bantuBob+=0;
				}
			}
		}
		System.out.println("Alice :"+ bantuAlice+",Bob"+ bantuBob);
	} 

}
