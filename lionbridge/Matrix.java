package com.lionbridge;

public class Matrix {
	
	
	public static void main(String args[]){  
	    //Creating Two matrix
		int x[][]={{1,4},{2,3}};    
		int y[][]={{5,1},{3,4}};    
		    
		//Storing in a array
		int c[][]=new int[2][2];   
		for(int i=0;i<2;i++){ 
			for(int j=0;j<2;j++){    
		       c[i][j]=x[i][j]+y[i][j];     
		System.out.print(c[i][j]+" ");   
		}    
		System.out.println();   
		}    
		}
	}  


