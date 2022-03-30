package logic03;

public class KaosKaki {
	public static int [] ConvertToIntArray(String input) {
		String[] stringArray = input.split(" ");
		int [] intArray = new int[stringArray.length];
		int angka = 0;
		int output = 0;
		int n2 = intArray.length;
		for(int i =0; i< n2 ;i++) {
			intArray[i] = Integer.parseInt(stringArray[i]);
		}
		for(int i=0; i<n2; i++) {
			if(intArray[i]==0) {
				continue;
			}else {
			
		for(int j =i+1;(j < n2); j++) {
				if(intArray[i]==intArray[j]) {
					angka +=1;
					intArray[j] = 0;
						break;
					
				}
			}
		}
			
		}System.out.print("Jumlah Kaos Kaki yang Sepasang adalah "+angka);
		
		
		
		return intArray;
	}

}
