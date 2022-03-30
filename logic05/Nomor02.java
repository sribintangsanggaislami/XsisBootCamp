package logic05;

import java.util.Scanner;

public class Nomor02 {
	static Scanner input = new Scanner(System.in); 
	
	public static int [] convertToIntArray() {
		
		String arrayInput = input.nextLine();
		String[] stringArray = arrayInput.split("-");
		
		int [] intArray = new int [stringArray.length];
		for (int i=0; i <intArray.length;i++) {
			intArray[i]= Integer.parseInt(stringArray[i]);
		}
		return intArray;
	}
	
	public static void main(String [] args) {
		//input
				System.out.println("Masukkan jarak antar toko (dipisah - ");
				int[] jarakToko = convertToIntArray();
				int toko = jarakToko.length;
				
				//proses
				float jumlahJarak = 0;
				//berangkat
				if (jarakToko[0] == 1) {
					jumlahJarak += 0.5;
				}
				else if (jarakToko[0] == 2) {
					jumlahJarak += 2;
				}
				else if (jarakToko[0] == 3) {
					jumlahJarak += 3.5;
				}
				else {
					jumlahJarak += 5;
				}
				
			
				//antar toko dihitung
				for (int i = 0; i < toko - 1; i++) {
					for (int j = i + 1; j < toko; j++) {
						jumlahJarak = (float) (jumlahJarak + (Math.abs(jarakToko[i] - jarakToko[j]) * 1.5));
						break;
					}
				}
				
				//pulang
				if (jarakToko[toko - 1] == 1) {
					jumlahJarak += 0.5;
				}
				else if (jarakToko[toko - 1] == 2) {
					jumlahJarak += 2;
				}
				else if (jarakToko[toko - 1] == 3) {
					jumlahJarak += 3.5;
				}
				else {
					jumlahJarak += 5;
				}
				
				float waktuKunjung = 10 * jarakToko.length;
				float waktuTempuh = (float) ((jumlahJarak / 30) * 60);
				
				//output
				System.out.println();
				System.out.println("Jadi waktu yang dibutuhkan adalah " + (waktuKunjung + waktuTempuh) + " menit");
	}
}
