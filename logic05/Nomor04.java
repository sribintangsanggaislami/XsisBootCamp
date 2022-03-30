package logic05;

import java.util.Scanner;

public class Nomor04 {

static Scanner input = new Scanner(System.in); 
	

	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Uang Andi : ");
			int uang = input.nextInt();
			System.out.print("Jumlah barang : ");
			int jumBar = input.nextInt();
			String[] namBar = new String[jumBar];
			int[] harBar = new int[jumBar];
			
			
			for(int i = 0; i < jumBar; i++) {
				System.out.print("Barang " + (i+1) + " : ");
				namBar[i] = input.next();
			}
			for(int i = 0; i < jumBar; i++) {
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