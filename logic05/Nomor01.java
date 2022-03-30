package logic05;

import java.util.Scanner;

public class Nomor01 {
	public static void main(String [] args) {
	System.out.println("Masukan nilai:");
	Scanner input =  new Scanner(System.in);
	int n = input.nextInt();
	

	String hasil ="";
	int [] deret1 = new int[n];
	int [] deret2 = new int [n];
	for(int i =0; i< n;i++) {
			deret1[i] = (i*3)-1;
			deret2[i] = i*(-2);
			
			hasil += deret1[i]+ deret2[i]+",";
		}
	System.out.println("menampilkan hasil penjumlahana 2 deret = " +hasil);
		}
	}

