package logic05;

import java.util.Scanner;

public class Nomor08 {
	

static Scanner input = new Scanner(System.in);
	
	public static int[] convertToIntArray1() {
		//Knapsack
		String arrayInput = input.nextLine();
		String[] stringArray = arrayInput.split(", ");
		
		int[] intArray = new int[stringArray.length];
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(stringArray[i]);
		}
		
		return intArray;
	}
	
	public static void main(String[] args) {
		
		//input
		System.out.print("Masukkan jumlah uang yang dimiliki: ");
		int uang = input.nextInt();
		input.nextLine();
		
		System.out.println("Masukkan daftar harga kacamata (dipisah koma spasi)");
		int[] hargaKacamata = convertToIntArray1();
		
		System.out.println("Masukkan daftar harga baju (dipisah koma spasi)");
		int[] hargaBaju = convertToIntArray1();

		//proses kombinasi
		int[] kombinasiHarga = new int[hargaKacamata.length * hargaBaju.length];
		
		int posisi = 0;
		for (int i = 0; i < hargaKacamata.length; i++) {
			for (int j = 0; j < hargaBaju.length; j++) {
				kombinasiHarga[posisi] = hargaKacamata[i] + hargaBaju[j];
				posisi++;
			}
		}
		
		//mencari nilai maksimum dari kombinasi harga yang kurang dari uang
		int maks = 0;
		boolean cukup = false;
		
		for (int i = 0; i < kombinasiHarga.length; i++) {
			if ((kombinasiHarga[i] > maks) && (kombinasiHarga[i] <= uang)) {
				maks = kombinasiHarga[i];
				cukup = true;
			}
		}
		
		if (cukup) {
			System.out.println();
			System.out.println("Bisa beli maksimal harganya " + maks);
		}
		else {
			System.out.println();
			System.out.println("Dana tidak cukup, nabung");
		}
		
	}

}



