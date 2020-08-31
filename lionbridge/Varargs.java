package com.lionbridge;

public class Varargs {
	 static void test(int ...a) 
	    { 
	        System.out.println("Number of arguments: " + a.length); 
	  
	        for (int i: a) 
	            System.out.print(i + " "); 
	        System.out.println(); 
	    }
	    public static void main(String args[]) 
	    { 
	       
	        test(10);     
	        test(1, 2, 3, 4);
	        test(2,9);
	        test();            
	    } 

}
/* Output 
Number of arguments: 1
10 
Number of arguments: 4
1 2 3 4 
Number of arguments: 2
2 9 
Number of arguments: 0
*/

