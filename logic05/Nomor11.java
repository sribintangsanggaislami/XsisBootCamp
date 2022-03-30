package logic05;

import java.util.Scanner;

public class Nomor11 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		//input	
		System.out.print("Isi Ulang Pulsa = ");
		int pulsa = input.nextInt();

		int poin = 0;
		//proses
		if (pulsa > 30000) {
			poin = (pulsa - 30000) / 1000 * 2;
			poin = poin + 20;
		}
		else if (pulsa > 10000) {
			poin = (pulsa - 10000) / 1000;
		}
		else {
			poin = 0;
		}

		System.out.println("Dapet " + poin + " poin dari beli pulsa tadi.");
	}

}

