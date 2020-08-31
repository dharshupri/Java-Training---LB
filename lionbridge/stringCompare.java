package com.lionbridge;

public class stringCompare {
	public static void main(String[] args) {
		String string1,string2;
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		System.out.println("Enter the first String");
		string1 = in.nextLine();
		
		System.out.println("Enter the second String");
		string2 = in.nextLine();
		
		if (string1.compareTo(string2)>0)
		System.out.println("The first string is greater than the second string");
		else if(string1.compareTo(string2)<0)
		System.out.println(" The first string is lesser than the second string");
		else 
			System.out.println("Both string is equal");
		
		
	}

}
