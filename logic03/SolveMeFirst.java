package logic03;

public class SolveMeFirst {
	public static int [] ConvertToIntArray(String input)
	{	
		String[] stringArray = input.split(" ");
		int [] intArray = new int[stringArray.length];
		
		for(int i =0; i< intArray.length;i++) {
			intArray[i] = Integer.parseInt(stringArray[i]);
			
		}
		int hasil = 0;
		
		for(int i = 0 ; i< intArray.length;i++) {
			hasil+= intArray[i];
		}
		System.out.print("Answer = ");
		System.out.print(hasil);
		
		return intArray;
	}
			
}
