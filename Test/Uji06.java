package Test;

import java.util.Scanner;

public class Uji06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukan tanggal dan hari pemesanan:");
		String tanggalPemesanan = input.nextLine();
		System.out.println("Hari libur Nasional :");
		String libur = input.nextLine();
		
		String [] tanggalArray = tanggalPemesanan.split(" ");
		int tanggalSampai = Integer.parseInt(tanggalArray[0]);
		int tanggalBulan = Integer.parseInt(tanggalArray[0]);
		String [] hariLibur = libur.split(" ");
		int cek=0;
		
		if(tanggalSampai >=1 && tanggalSampai <=31) 
		{
			if(!hariLibur[0].equals("kosong")) 
			{
				for(int i = (tanggalSampai+1);i<(tanggalSampai+7);i++) 
				{
					for(int j = 0; j<hariLibur.length;j++) 
					{
						if(i==Integer.parseInt(hariLibur[j])) 
						{
							cek = Integer.parseInt(hariLibur[j]);
						}
					}
				}
				tanggalSampai = cek;
				for(int i = 0; i < 7; i++) 
				{
					tanggalSampai += 1;
					if(tanggalSampai > 31) 
					{
					 tanggalSampai = 1;
					}
				}
				if(tanggalSampai < tanggalBulan) 
				{ 
					System.out.print("Tanggal " + tanggalSampai + " di bulan selanjutnya");
				}else 
				{
					System.out.print("Tanggal " + tanggalSampai + " di bulan ini");
				}
		
			}
			else if(hariLibur[0].equals("kosong")) 
			{
				for(int i = 0; i < 7; i++)
				{
					tanggalSampai += 1;
					if(tanggalSampai > 31) 
					{
						tanggalSampai = 1;
					}
				}
				if(tanggalSampai < tanggalBulan) {
					System.out.print("Tanggal " + tanggalSampai+ " di bulan selanjutnya");
				}else {
					System.out.print("Tanggal " + tanggalSampai + " di bulan ini");
				}		
			}
			
		}
		input.close();
	}
}
