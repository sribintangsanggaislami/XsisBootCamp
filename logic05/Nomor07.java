package logic05;

import java.util.Scanner;

public class Nomor07 {
	public static void main(String[] args) {
        boolean status = true;
        String Result = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Pola track: ");
        String track = input.nextLine();
        System.out.print("Pola Jalan: ");
        String walk = input.nextLine();

        String[] trackArray = track.split("");
        String[] walkArray = walk.split("");

        int trackCount = 0;
        int stamina = 0;
        int walkCount = 0;

        for (int i = 0; i < trackArray.length; i++) {
            if (trackArray[i].equals("-")&&walkArray[walkCount].equals("w")){
                stamina++;
                walkCount++;
            }else if (walkArray[walkCount].equals("j")&&trackArray[i+1].equals("-")){
                stamina -=2;
                i+=1;
                walkCount++;
                if (stamina<0){
                    status = false;
                    Result = "Stamina Habis";
                    break;
                }
            }else if (!trackArray[i].equals("-")&&(walkArray[walkCount].equals("w") || walkArray[walkCount].equals("j"))){

                status = false;
                Result = "Masuk Lubang";
                break;
            }else {
//                System.out.println("jimi Die");
                status = false;
                Result = " jim meninggal";
                break;
            }


        }

//        status ? stamina : Result;

        if (status==true){
            System.out.println(stamina);
        }else {
            System.out.println(Result);
        }
    }
}

