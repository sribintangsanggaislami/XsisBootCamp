package logic03;

import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai n: ");
		int n = input.nextInt();
		
		//Utility ut = new utility();
		float hasil [] = Utility.plusMinus(n);
		System.out.printf("%1.6f \n",hasil[0] / n);
		System.out.printf("%1.6f \n",hasil[1] / n);
		System.out.printf("%1.6f \n",hasil[2] / n);
	}

}
