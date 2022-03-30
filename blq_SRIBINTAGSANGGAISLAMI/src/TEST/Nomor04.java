package TEST;

import java.util.Scanner;

public class Nomor04 {
	public static void main(String[] args) {
		System.out.println("Masukkan nilai: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int f1=0,f2=1;
		int i;
		System.out.println("Jumlah bilangan genap kurang dari nilai =");
		for(i =0; i<n;i++) 
		{
			
				int f3 = f2+f1;
				f1=f2;
				f2=f3;
		if(f1%2==0 && f1<=n) 
		{
			System.out.print(f1+" ");
		}
		}	
		
	}
}
