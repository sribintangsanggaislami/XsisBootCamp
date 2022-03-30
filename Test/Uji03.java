package Test;

import java.util.Scanner;

public class Uji03 {
	//input
	static Scanner input = new Scanner(System.in);
		public static void main(String[] args) {
			System.out.println("Masukkan penjualan buah dan jumlahnya: \ncth:Apel:1, Jeruk:2, Mangga:3");
			String arrayInput = input.nextLine();
			String[] stringArray= arrayInput.split(", ");
			String temp = "";
			
			//urut abjad dari variabel kedua dibadningkan dg variabel sblumnya
			for(int i =1;i<stringArray.length-1;i++) {
				for(int j = i; j>0;j--) {
					if(stringArray[j].compareTo(stringArray[j-1])<0) {
						temp = stringArray[j];
						stringArray[j] = stringArray[j-1];
						stringArray[j-1] = temp;
					}	
				}
			}
			
			String [][] string2dArray= new String [stringArray.length][];
			
			for(int i =0;i<stringArray.length;i++) {
				string2dArray[i]= stringArray[i].split(":");
			}
			
			//menghitung jumlah buah
			System.out.println();
			System.out.println("Ringkasannya sebagai berikut:");
			
			for(int i =0; i<string2dArray.length;i++) {
				if(string2dArray[i] == null) {
					continue;
					
				}
				
				else {
					 int sum = Integer.parseInt(string2dArray[i][1]);
					 for(int j = i+1; j<string2dArray.length;j++) {
						 if(string2dArray[i][0].equals(string2dArray[j][0])) {
							 sum += Integer.parseInt(string2dArray[j][1]);
							 string2dArray[j] = null;
						 }
						
					 }System.out.println(string2dArray[i][0] + ": " + sum);
				}
			}
			
		}
	
}

