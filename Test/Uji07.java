package Test;

import java.util.Scanner;

public class Uji07 {
	public static void main(String[] args) {
		boolean status = true;
        String Result = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Pola track: ");
        String track = input.nextLine();
        System.out.print("Pola Jalan: ");
        String walk = input.nextLine();
        
        String [] trackArray =track.split("");
        String [] walkArray = walk.split("");
        
        int trackCount = 0;
        int walkCount =0;
        int stamina = 0;
        
        for(int i = 0; i<trackArray.length;i++) {
        	if(trackArray[i].equals("-")&&walkArray[walkCount].equals("w")) 
        	{
        		stamina++;
        		walkCount++;
        	}
        	else if(trackArray[i+1].equals("-")&&walkArray[walkCount].equals("j"))
        	{
        		stamina-=2;
        		i+=1;
        		walkCount++;
        		if(stamina<0) 
        		{
        			Result ="Stamina Jime Habis";
        			status = false;
        			break;
        		}
        	else if(!trackArray[i].equals("-")&& walkArray[walkCount].equals("w")||walkArray[walkCount].equals("j")) 
        	{
        		Result ="Jime Masuk Lubang";
        		status = false;
        		break;
        	}
        	else 
        	{
        		Result = "Jime Die";
        		status = false;
        		break;
        	}
        		
        		
        	}
        	 
        }
        if (status==true){
            System.out.println(stamina);
        }else {
            System.out.println(Result);
        }
	}
}
