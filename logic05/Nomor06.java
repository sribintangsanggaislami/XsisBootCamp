package logic05;

import java.util.Scanner;

public class Nomor06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Tanggal Pesan :");
		String pesan = sc.nextLine().trim();
		System.out.print("Tanggal Libur :");
		String[] libur = sc.nextLine().trim().split(" ");
		// int estimasiSampai =7;
		System.out.print("Estimasi sampai :");
		int estim = sc.nextInt();
		int tanggal = Integer.parseInt(pesan.substring(0, 2).trim());
		String hari = pesan.substring(2).trim();
		// System.out.println(hari + " " + tanggal);

		String namaHari[] = { "senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu" };
		int index = 1;

		for (int i = 0; i < namaHari.length; i++) {
			if (hari.equalsIgnoreCase(namaHari[i])) {
				index += i;
			}
		}

		int tanggalSampai = tanggal;

		for (int i = (tanggal + estim); i > tanggal; i--) {

			tanggalSampai = (tanggalSampai + 1);
			if (index >= 7) {
				index = index % 7;
				index = index + 1;
			} else {
				index = index + 1;
			}

			if (index == 6 || index == 7) {
				i = i + 1;
			} else {
				for (int j = 0; j < libur.length; j++) {
					if (tanggalSampai % 31 == Integer.parseInt(libur[j])) {
						i = i + 1;
					}
				}
//25 sabtu pesan ,26 x, 27 1, 28 2, 29 x, 30 3,31 4,1 x,2 x,3 5,4 6,5 7
			}
		}
		String hariSampai = namaHari[index - 1];
		// System.out.println(index);
		if (tanggalSampai > 31) {
			tanggalSampai %= 31;
			System.out.println(
					"paket sampai tanggal pada " + tanggalSampai + " hari " + hariSampai + " di bulan berikutnya");
		} else {
			System.out.println("paket sampai tanggal " + tanggalSampai + " pada hari " + hariSampai);
		}
	}
}
