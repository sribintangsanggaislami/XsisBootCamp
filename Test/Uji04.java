package Test;

import java.util.Scanner;

public class Uji04 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Uang Andi= ");
		Scanner input = new Scanner(System.in);
		int uang = input.nextInt();
		System.out.println("jumlah barang =");
		int jumBar = input.nextInt();
		String [] namBar = new String[jumBar];
		int [] harBar= new int[jumBar];
		
		
		for(int i=0;i<jumBar;i++) {
			System.out.print("Barang " + (i+1) + " : ");
			namBar[i] = input.next();
		}for(int i = 0; i < jumBar; i++) {
			System.out.print("Harga " + (i+1) + " : ");
			harBar[i] = input.nextInt();
			}
		for(int i = 0; i < jumBar; i++) {
			if(harBar[i] <= uang) {
				System.out.print(namBar[i] + " ");
				uang = uang - harBar[i];
				}
			}
		System.out.print("\nSisa uang = "+uang);
	}
}
