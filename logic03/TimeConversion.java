package logic03;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String [] args) {
		try(Scanner input = new Scanner(System.in)){
			System.out.println("\nSoal N0.2");
			System.out.print("Masukkan jam : \n ex:10:10:10AM \n ");
			String jamInput = input.nextLine();
			
			String hasilConvert = Utility.TimeConvert(jamInput);
			System.out.println(hasilConvert);
		}
	}
	
	
	
	
	
	
	
	
	
	
//	public static int [] ConvertToIntArray(String input) {
//		String[] stringArray = input.split(" ");
//		int [] intArray = new int[stringArray.length];
//		
//		for(int i=0; i< intArray.length; i++) {
//			intArray[i] = Integer.parseInt(stringArray[i]);
//		}
//		int hasil;
//		for (int j = 1; j < intArray.length; j++) {
//			if(j == 1) {
//				hasil = intArray[0] +=12;
//				System.out.print(hasil+":");
//			}if(j==2) {
//				hasil = intArray[1];
//				System.out.print(hasil+" ");
//			}else {
//				hasil = intArray[2];
//				System.out.print(hasil+":");
//			}
//		
//		}
//		
//		return intArray;
//	}
}
