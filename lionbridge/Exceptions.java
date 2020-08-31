package com.lionbridge;

import java.net.MalformedURLException;
import java.net.URL;

public class Exceptions {
	public static void main(String [] args) {
		// Run time Exception
		int i[]=new int[3];
		int j = i[3];
		//Compile Time Exception
		try {
			URL url = new URL ("htt://www.google.com");
			test(120);
			
			System.out.println("Before Catch");
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("inside exception catch");
		}finally {
		}
		
		System.out.println("After catch");
			
		}
	
	public static void test(int i ) throws ArgumentNotFound {
		if (i>100) {
			throw new ArgumentNotFound("argument is less than 100");
		}
	}
		public static void test1(int i) throws Exception{
			if(i>120) {
				throw new Exception("Argument is less than 120");
		}
	/*public static int finallyMet(int i) {
		try {
			int j = i+4;
			return j;
		}finally {
			System.out.println("Finally executed");
		}
			
		}*/
		
		}
		
		
		
	}
	


