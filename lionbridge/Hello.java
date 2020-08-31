package com.lionbridge;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello");
System.out.println( 3 * 2 + 3 - 2 * (4 + 2) + "One" + 2 + (3 * 2) + 4);

    int one = 100;
    int two = 0;
    
    if(one == 110) {
        System.out.println("one is 110");
    }else {
        System.out.println("one is not 110");
    }
    
    int result = (one == 110) ? one : 110; 
    System.out.println(result);


    switch(one) {
    
        case 10:{
            System.out.println("10");
            break;
        }
        case 100:{
            System.out.println("100");
            break;
        }
        case 110:{
            System.out.println("110");
            break;
        }
        default:{
            System.out.println("default");
        }
    }
    long l = 12;
    switch("str") {
    
    }
    
    int i = 0;
    while(i < 10) {
        System.out.println("while i = "+i++);
    }
    
    i=0;
    do {
        System.out.println("Do while i = "+i++);
    }while(i < 10); 
        
    for(int j=0;j<10;j++) {
        if(j == 8) {
            break;
        }
        if(j == 3 || j == 5) {
            continue;
        }
        System.out.println("For loop "+j);
        
    }
    
    
    // labelled break and continue
  oneloop:    for(i = 0;i < 5;i++) {
    twoloop:    for(int j = 0;j < 5;j++) {
                    if(j == 3) {
                        break twoloop;
                    }
                    if(i == 2) {
                        continue oneloop;
                    }
                    System.out.println("i == "+i+" j == "+j);
                }
    }
    
    
    
    
    
    
    
    
    

}






	

}
