package com.lionbridge;

public class ArrayBestScore {
	public static void main(String args[]) { 
        
        
        int array[]={0,0,0,0,0,0,0,0,0,0}; 
                                     
        int bonus[];
        bonus=new int[15];  
 
           for(int i=0;i<15;i++){ 
               bonus[i]+=1;
               System.out.println(bonus[i]);
           }
             
     
        int bestScores[]={89,34,90,37,22}; 
                                        
        for (int j=0;j<5;j++){
            System.out.printf("%d\t", bestScores[j]); 
                                           
        }
    }
}



