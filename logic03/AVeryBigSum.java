package logic03;

public class AVeryBigSum {
	public static int [] ConvertToIntArray(String input) {
		String[] stringArray = input.split(" ");
		int [] intArray = new int[stringArray.length];
		long hasil =0;
		
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = Integer.parseInt(stringArray[i]);
			hasil = hasil + intArray[i];
		}
		System.out.println(hasil);
		return intArray;
	}
}
