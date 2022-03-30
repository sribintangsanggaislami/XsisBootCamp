package logic05;

import java.util.Scanner;

public class Nomor14 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("panjang tali: ");
		int z=input.nextInt();
		//float z=input.nextFloat();
		System.out.print("mau dijadikan: ");
		int x=input.nextInt();
		//float x=input.nextFloat();
		int potong=0;
		int hasil =0;
		
		while (z>x) {
			if (z%2==0 && (z/2)>x) {
				z=z/2;
				potong++;
			}else {
				z-=x;
				potong++;
			}
		}
		
		System.out.println("jumlah potong: "+potong);
		input.close();
	}
}