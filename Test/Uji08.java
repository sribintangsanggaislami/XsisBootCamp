package Test;

import java.util.Scanner;

public class Uji08 {
	static Scanner input = new Scanner(System.in);
	
	public static int[] convertToIntArray() {
		String arrayInput = input.nextLine();
		String [] stringArray = arrayInput.split(", ");
		
		int [] intArray = new int[stringArray.length];
		
		for(int i = 0; i < stringArray.length;i++) {
			intArray[i]=Integer.parseInt(stringArray[i]);
		}
		return intArray;
	}
	
	public static void main(String[] args) {
		System.out.println("Uang Andi: ");
		
		int uang= input.nextInt();
		System.out.println("Harga Kacamata = ");
		
		System.out.println("Masukan harga kacamata=(Dipisah koma dan spasi)");
		int [] hargaKacamata = convertToIntArray();
		
		System.out.println("Masukan harga baju=(dipisah koma dan spasi");
		int [] hargaBaju= convertToIntArray();
		
		int [] kombinasiHarga = new int [hargaKacamata.length*hargaBaju.length];
		
		int posisi = 0;
		for(int i = 0; i<hargaKacamata.length;i++) {
			for(int j = 0; i<hargaBaju.length;j++) {
				kombinasiHarga[posisi]=hargaKacamata[i]+hargaBaju[j];
				posisi++;
				}
			}
		boolean uangCukup = false;
		int maks =0;	
		for(int i=0;i<kombinasiHarga.length;i++) {
			if(kombinasiHarga[i] > maks&& kombinasiHarga[i]<=uang) {
				maks = kombinasiHarga[i];
				uangCukup=true;
			}
		}
		
		if(uangCukup) {
			
			System.out.println("Harga Maksimal yang di dapat ="+maks);
		}
		else {
			System.out.println("Dana Tidak Cukup");
		}
		
	}

}
