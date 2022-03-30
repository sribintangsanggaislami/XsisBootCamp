package logic05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nomor09 {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) throws ParseException  {

		// masuk 28-01-2020 07:30:34
		// keluar 28-01-2020 20:03:35

		//input
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		
		System.out.println("Tanggal masuk format dd-MM-yyyy HH:mm:ss");
		String masuk = input.nextLine();
		Date waktuMasuk = format.parse(masuk);
		
		System.out.println("Tanggal keluar format dd-MM-yyyy HH:mm:ss");
		String keluar = input.nextLine();
		Date waktuKeluar = format.parse(keluar);
		
		//proses
		long selisihWaktu = waktuKeluar.getTime() - waktuMasuk.getTime();
		
		//selisih masih dalam milidetik
//		long selisihDetik = selisihWaktu / 1000 % 60;
//		long selisihMenit = selisihWaktu / (60 * 1000) % 60;
		long selisihJam = selisihWaktu / (60 * 60 * 1000);
		long selisihHari = selisihWaktu / (24 * 60 * 60 * 1000);

		//tarif
		int tarif = 0;
//		if (selisihJam%24==0) {	//kurang dari 24 jam
//			tarif = (int) (15000 * selisihJam/24);
//		}
//		else if (selisihJam<24) {
//			if (selisihJam > 8) {
//				tarif = 8000;
//			}
//			else {	// lebih dari 24 jam
//				tarif = (int)selisihJam * 1000;
//			}
//		}
		
//		else { 
			if (selisihJam%24 < 8) {
				tarif = ((int) (selisihHari*15000) + (int) (selisihJam%24)* 1000);	
			}
			else {
				tarif = (int) (selisihHari*15000 +8000);
			}
			
			
//		}
			
		
		//output
		System.out.println();
		System.out.println("Anda parkir selama " + selisihJam + " jam");
		System.out.println("Anda harus bayar " + tarif);
	}

}