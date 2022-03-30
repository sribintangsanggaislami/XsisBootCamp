package Test;

import java.util.Scanner;

public class Nomor02 {
	//input
	static  Scanner input = new Scanner(System.in);
	public static int [] convertToIntArray() {
		
		String arrayInput = input.nextLine();
		String [] stringArray = arrayInput.split("-");
		
		int [] intArray = new int[stringArray.length];
		for(int i = 0; i<intArray.length;i++) {
			intArray[i]=Integer.parseInt(stringArray[i]);
		}
		return intArray;
	}
	
	public static void main(String[] args) {
		// pergi
		System.out.println("Jarak toko di kasih (-)");
		int [] jarakToko = convertToIntArray();
		int toko = jarakToko.length;
		
		float jumlahJarak = 0;
		
		if(jarakToko[0] == 1) {
			jumlahJarak += 0.5;
			}
		else if (jarakToko[0] == 2) {
			jumlahJarak += 2;
		}else if (jarakToko[0] == 3) {
			jumlahJarak += 3.5;
			}
		else {
			jumlahJarak += 5;
		}
		System.out.println(jumlahJarak);
		for(int i =0; i<toko-1;i++) {
			for(int j = i+1; j<toko;j++) {
				jumlahJarak= (float) (jumlahJarak + (Math.abs(jarakToko[i]-jarakToko[j])*1.5));
				break;
			}
		}System.out.println(jumlahJarak);
		if(jarakToko[toko-1]==1) {
			jumlahJarak+=0.5;
		}
		else if(jarakToko[toko-1]==2) {
			jumlahJarak+=2;
		}else if(jarakToko[toko-1]==3) {
			jumlahJarak+=3.5;
		}else {
			jumlahJarak+=5;
		}
		
		float waktuToko = 10*toko;
		float waktuJalan = (jumlahJarak/30)*60;
		System.out.println("Waktu yang dibutuhkan adalah = " +(waktuJalan+waktuToko));
	}
}
