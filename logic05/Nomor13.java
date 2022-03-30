package logic05;

import java.util.Scanner;

public class Nomor13 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("masukan kata/kalimat : ");
		String kata=input.nextLine().toLowerCase();
		System.out.print("masukan array [1,2,3,...]: ");
		String array=input.nextLine();
		
		
		kata=kata.replaceAll(" ", "");
		array=array.replaceAll(" ", "");
		array=array.substring(1, array.length()-1);
		System.out.println(array);
		
		
		String[] array2=array.split(",");
		String cetak="";
		//97 122
		
		
		for (int i = 0; i < kata.length(); i++) {//ASCII dikurang 96 dan dibandingkan dg nilai array
			if(kata.charAt(i)-96==Integer.parseInt(array2[i])) {
				cetak=cetak+"true ";
			}else {
				cetak=cetak+"false ";
			}
			
		}
	
		
		System.out.println("Output : "+cetak);

	}
	
}



