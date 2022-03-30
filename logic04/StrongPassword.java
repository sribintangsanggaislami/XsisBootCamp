package logic04;

import java.util.Scanner;

public class StrongPassword {
	public static void main (String[] args) {
		System.out.print("Masukkan kata:");
		Scanner input = new Scanner(System.in);
		String password = input.nextLine();
		
		int hurufKapital = 0;
		int hurufKecil = 0;
		int angka = 0;
		int simbol =0;
		
		for(int i = 0; i< password.length();i++) {
			if(Character.isUpperCase(password.charAt(i))) {
				hurufKapital +=1;
			}else if(Character.isLowerCase(password.charAt(i))) {
				hurufKecil +=1;
			}else if(Character.isDigit(password.charAt(i))) {
				angka +=1;
			}else {
				simbol +=1;
			}
		}
		System.out.println();
		if(password.length()< 6) {
			System.out.println("Minimal 6 karakter");
		}else if(hurufKapital==0) {
			System.out.println("kurang huruf Kapital");
		}else if(hurufKecil == 0) {
			System.out.println("kurang huruf kecil");
		}else if(simbol == 0){
			System.out.println("kurang simbol");
		}else {
			System.out.println("Password dapat digunakan");
		}
	}
}
