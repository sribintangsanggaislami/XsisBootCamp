package logic04;

import java.util.Scanner;

public class CamelCase {
	public static void main (String[] args) {
		System.out.print("Masukkan kata:");
		Scanner stringInput = new Scanner(System.in);
		String n = stringInput.nextLine();
		
		
		String[] stringArray = n.split("(?=[A-Z])");
		int kata = 0;
		
		for(int i=0; i<stringArray.length;i++) {
				kata+=1;
		}System.out.println("total= "+kata);
	}
}
	 
	


