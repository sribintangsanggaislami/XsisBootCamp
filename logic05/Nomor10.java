package logic05;

import java.util.Scanner;

public class Nomor10 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// konversi dari soal
		// 1 teko = 25 cangkir = 10 gelas = 5 botol
		// referensi array
		String[] wadah = {"teko", "cangkir", "gelas", "botol"};
		int[] proporsiVolume = {1, 25, 10, 5};
		
		//input
		System.out.println("Masukkan volume dan wadahnya.");
		System.out.println("Contoh: 1 teko, 3 cangkir, 2 gelas, 1 botol");
		String arrayInput = input.nextLine();
		String[] stringArray = arrayInput.split(" ");
		
		System.out.println("Mau konversi ke teko, cangkir, gelas, atau botol?");
		String konversi = input.nextLine();
		
		//proses
		int indeksInput = -1;
		int indeksKonversi = -1;
		for (int i = 0; i < wadah.length; i++) {
			if (wadah[i].equals(stringArray[1])) {
				indeksInput = i;
			}
			else if (wadah[i].equals(konversi)) {
				indeksKonversi = i;
			}	
		}
		
		double hasilKonversi = 0;
		hasilKonversi = (double)(proporsiVolume[indeksKonversi] * Integer.parseInt(stringArray[0])) / 
				(double)proporsiVolume[indeksInput];
		
		
		System.out.println((proporsiVolume[indeksKonversi]));
		System.out.println((stringArray[0]));
		System.out.println(proporsiVolume[indeksInput]);
		//output
		System.out.println();
		System.out.println("Hasil konversinya adalah");
		System.out.println(arrayInput + " = " + hasilKonversi + " " + konversi);
		
	}

}
