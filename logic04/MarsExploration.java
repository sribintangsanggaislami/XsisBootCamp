package logic04;

import java.util.Scanner;

public class MarsExploration {
	public static void main (String[] args) {
		System.out.print("kode diterima:");
		Scanner stringInput = new Scanner(System.in);
		String n = stringInput.nextLine();
		int bantu = 0;
		
		for(int i =0;i<n.length();i++) {
			if(i % 3 ==1) {
				if(n.charAt(i)  != 'O') {
					bantu++;
				}
				else {
					if(n.charAt(i)!= 'S'){
							bantu++;
						}
					}
				}
			}
		System.out.println("Kode Salah = "+ bantu);
		}
		
	}
