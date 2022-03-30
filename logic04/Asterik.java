package logic04;

import java.util.Scanner;

public class Asterik {
	public static void main (String[] args) {
		System.out.print("Masukkan kata:");
		Scanner stringInput = new Scanner(System.in);
		String n = stringInput.nextLine();
		
		
		String[] stringArray = n.split(" ");
		String result ="";
		
		for(int i=0; i<stringArray.length;i++) {
			char [] charArray = stringArray[i].toCharArray();
			
			for(int j = 0; j< charArray.length;j++) {
				if(j==0 || j == charArray.length -1) {
					
					result += charArray[j];
				}
				else {
					charArray[j] ='*';
					result += charArray[j];
				}
			}result += " ";
			
		}System.out.println(result);
	}
	 
	
	
}
