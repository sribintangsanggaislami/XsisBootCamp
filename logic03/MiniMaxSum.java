package logic03;

public class MiniMaxSum {
	public static int [] ConvertToIntArray(String input) {
		String[] stringArray = input.split(" ");
		int [] intArray = new int[stringArray.length];
		int hasil =0;
		int j;
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = Integer.parseInt(stringArray[i]);
			hasil = hasil + intArray[i];
//			System.out.println(hasil);
		
		}
		for( j =1;j<=intArray.length; j++){
			hasil = hasil - j;
			System.out.println("Hasil penjumlahan ke "+j+"= "+ hasil);
			hasil+=j;
		}
			
		return intArray;
	}
}

