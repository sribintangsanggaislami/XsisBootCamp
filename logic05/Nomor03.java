package logic05;

import java.util.Scanner;

public class Nomor03 {


	static Scanner input = new Scanner(System.in);
		
		public static void main(String[] args) {

			//input
			System.out.println("Masukkan penjualan buah dan jumlahnya.");
			System.out.println("Contoh: Apel:1, Pisang:3, Jeruk:1");
			String arrayInput = input.nextLine();
			String[] stringArray = arrayInput.split(", ");
			
			//pengurutan sesuai abjad
			String temp = "";

			for (int i = 1; i < stringArray.length; i++) {
				for (int j = i; j > 0; j--) {
					if (stringArray[j].compareTo(stringArray[j - 1]) < 0) {
						temp = stringArray[j];
						stringArray[j] = stringArray[j - 1];
						stringArray[j - 1] = temp;
					}
				}
			}
			
			//dipisah antara nama buah dan jumlah
			String[][] string2dArray = new String[stringArray.length][];//dijadikan array 2 dimensi
			
			for (int i = 0; i < stringArray.length; i++) {
				string2dArray[i] = stringArray[i].split(":");
			}
			
			//output
			System.out.println();
			System.out.println("Ringkasannya sebagai berikut:");
			for (int i = 0; i < string2dArray.length; i++) {
				if (string2dArray[i] == null) {
					continue;
				}
				else {
		            int sum = Integer.parseInt(string2dArray[i][1]);
		            for (int j = i + 1; j < string2dArray.length; j++) {
		                if (string2dArray[i][0].equals(string2dArray[j][0])) {
		                    sum += Integer.parseInt(string2dArray[j][1]);
		                    string2dArray[j] = null;
		                }
		            }
		            
		            System.out.println(string2dArray[i][0] + ": " + sum);
		        }
		    }
			
		}

	}