package logic04;

import java.util.Scanner;

public class Palindrome {
		public static void main (String[] args) {
			System.out.print("Masukkan kata:");
			Scanner stringInput = new Scanner(System.in);
			String n = stringInput.nextLine();
			
			String hasil ="";
			String[] kataKedua;
			
			//String[] str
			for(int i = n.length()-1;i>=0;i--) {
				char huruf = n.charAt(i);
				hasil +=String.valueOf(huruf);
			}
			if(n.equals(hasil)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
}
