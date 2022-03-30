package TEST;

import java.util.Scanner;

public class Nomor01 {
	public static void main(String [] args) {
	System.out.println("Masukan nilai:");
	Scanner input =  new Scanner(System.in);
	int n = input.nextInt();
	int i;

	String hasil1 ="",hasil2="",total="";
	int [] deret1 = new int[n];
	int [] deret2 = new int [n];
	for(i =0; i< n;i++) {
			deret1[i] = (i*3)-1;
			deret2[i] = (i*4)/2;
			
			hasil1 += deret1[i]+" ";
			hasil2 += deret2[i]+" ";
			total += deret1[i]+ deret2[i]+",";
		}
	System.out.println("deret ganjil = " +hasil1);
	System.out.println("deret genap = " +hasil2);
	System.out.println("menampilkan hasil penjumlahana 2 deret = " +total);
		}
	}


