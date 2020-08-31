package com.lionbridge;
public class Calculator {
	
	int add;
	int div;
	double sub;
	double mod;
	public void result(int add,int div) {
		add=add;
		div=div;
		System.out.println(add);
	
	}
		
	public void result (double sub, double mod) {
      sub=sub;
      mod=mod;
      System.out.println(mod);
     
}
	public void result (int add,double sub) {
	 add=add;
	 sub=sub;
		System.out.println(sub);
	}
    public void  result (double sub,int add) {
    	sub=sub;
    	add=add;
    	System.out.println(sub);
    	System.out.println(add);
    }
    public static void main(String[]args) {
    	Calculator calculator = new Calculator();
    	calculator.result(130, 2.8);
    	calculator.result(6.90, 200);
    
    	
    }
    
    	
    }