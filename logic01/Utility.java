package logic01;

public class Utility {
		public static int[] convertTointArray(String input) {
			String [] stringArray = input.split(" ");
			int [] intArray =new int [stringArray.length];
			for(int i=0;i<intArray.length;i++) {
				intArray[i]=Integer.parseInt(stringArray[i]);
			}
			return intArray;
		}
}
