package logic05;

import java.util.Scanner;

public class Nomor05 {

static Scanner input = new Scanner(System.in); 
	
	
	public static void main(String [] args) {
	
	System.out.println("Masukan jam:menit");
	System.out.println("contoh 10:10 PM atau 10:10");
	String inputTime = input.nextLine();
	
	String format ="";
	
	
	int jam = Integer.parseInt(inputTime.substring(0,2));
	if(inputTime.endsWith("PM") || inputTime.endsWith("AM")) {
		if (inputTime.endsWith("PM")) {
			if(jam <12) {
				jam+=12;
				format = jam + ":" + inputTime.substring(3,5);
			}
			else if(jam == 12) {
				format = jam +":"+ inputTime.substring(3,5);
			}else {
				format = "jam yang anda masukkan salah";
			}
		}
	
		else {
			if (jam <12) {
				
				format = jam + ":" + inputTime.substring(3,5);
			}
			else if(jam == 12) {
				format = "00"+ ":"+ inputTime.substring(3,5);
			}else {
				format = "jam yang anda masukkan salah";
			}		
		}
	}
	
	else {
			if(jam>12 && jam <24) {
				jam -= 12;
				if(jam <10) {
					format = "0" + jam+ ":" + inputTime.substring(3,5) +" PM";
				}
				else if (jam==24){
					format = "jam yang anda masukkan salah";
					}
				else {
					format = jam+ ":" + inputTime.substring(3,5) +" PM";
					}
				}
			else if(jam ==12) {
				format = jam + ":"+ inputTime.substring(3,5)+ " PM";
			}
			else if(jam <10){
				format ="0"+  jam +":"+inputTime.substring(3,5)+" AM";
			}else if(jam==24){
				format = "jam yang anda masukkan salah";
			}else {
				format =  jam +":"+inputTime.substring(3,5)+" AM";
			}
		}
		System.out.println();
		System.out.println("konversinya adalah : "+ format);
	
	}
}
