package TEST;

import java.util.Scanner;

public class Nomor05 {
	

	
		public static void main(String [] args) {
			System.out.println("Masukan kata:");
			Scanner input =  new Scanner(System.in);
			String kata = input.nextLine().toLowerCase().replaceAll(" ", "");
			String consonant ="";
			String vokal = "";
			for(int i =0;i< kata.length();i++) {
				if(kata.charAt(i) == 'a'|| kata.charAt(i)== 'i' || kata.charAt(i)== 'u'|| kata.charAt(i)== 'e'|| kata.charAt(i)== 'o') {
					vokal += kata.charAt(i);
				}
				else {
					if(kata.charAt(i)>96 && kata.charAt(i)< 123) {
					consonant += kata.charAt(i);
					}
				}
			}
			System.out.println("Huruf Vokal = "+vokal);
			System.out.println("Huruf Consonant = "+consonant);

	}
		

}
