package com.lionbridge;

public class StringArray{

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		String str1 = "The quick brown fox :jumps over the lazy dog";
		String str2 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		String[] arr = str1.split(":");
		for(String string : arr)
			System.out.println(string);
		System.out.println("String Matching : "+str.equalsIgnoreCase(str));
		System.out.println("Printing the String in lower case: "+str.toLowerCase());
	    System.out.println("Printing the string in Upper case: "+str.toUpperCase());
	    // Index Positions
	  
	    System.out.println("Index position of a: "+str.indexOf('a') );
	    System.out.println("Last Index of e: "+str.lastIndexOf('e'));
	    
	    //Comparing 2 Strings
		System.out.println("Comparing str and str1: "+str.equals(str1));
		System.out.println("Comparing str and str2: "+str.equals(str2));
		System.out.println("length of the string: "+str.length());
		System.out.println("Replace The with A : "+(str.replaceFirst("The", "A")));
		
		
		char ch = str.charAt(12);
		System.out.println("Character at 12th index is: "+ch);
		
		boolean bool= str.endsWith("dog");
	      System.out.println("String endsWith dog: " +bool);
		  
		  System.out.println(str.contains("is"));
		    
		 str = str.concat("and killed it");
		 System.out.println( str);
		     
		
		
	}

}
