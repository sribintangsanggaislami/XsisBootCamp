package logic03;

import java.util.Scanner;

public class Utility {
	public static int[] ConvertToIntArray(String input){
		String [] stringArray = input.split("");
		int [] intArray = new int [stringArray.length];
		for (int i = 0; i< intArray.length;i++) {
			intArray[i] = Integer.parseInt(stringArray[i]);
		}
		return intArray;
	}
	
	public static String TimeConvert(String time) {
		int jam = Integer.parseInt(time.substring(0,2));
		String format = time.substring(8,10);
		if (format.equals("PM") && jam<12){
			jam +=+12;
		}
		String hasil = jam+":"+time.substring(3,8);
		return hasil;
	}
	
	public static float[] plusMinus(int n) {
		Scanner input = new Scanner(System.in);
		System.out.print("masukkan angka =");
		String angka = input.nextLine();
		
		String[] stringArray = angka.split(" ");
		int [] intArray =new int[stringArray.length];
		for(int i =0;i<intArray.length;i++) {
			intArray[i] =Integer.parseInt(stringArray[i]);
		}
		float[] hasil = new float[3];
		float angkaNegatif = 0;
		float angkaPositif = 0;
		float angkaNol = 0;
		
		
		for(int j =0;j<n;j++) {
			if (intArray[j] <0) {
				angkaNegatif++;
			}else if(intArray[j]>0) {
				angkaPositif++;
			}else {
				angkaNol++;
			}
		}
		
		hasil [0] = angkaPositif;
		hasil [1] = angkaNegatif;
		hasil [2] = angkaNol;
		
		return hasil;
 	}
	
	
	

}
