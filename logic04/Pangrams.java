package logic04;


import java.util.Scanner;

public class Pangrams {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Masukkan kalimat : ");
		String kalimat = input.next();
		
		kalimat = kalimat.replaceAll("", "").toLowerCase();
		
		String kata ="";
		
		for(char i = 'a'; i<= 'z';i++) {
			if(kalimat.indexOf(i)!= -1) {
				kata+=i;
			}
		}
		if(kata.length()==26) {
			System.out.println("Parangrams");
			
		}else {
			System.out.println("bukan Parangrams");
		}
	}

}
