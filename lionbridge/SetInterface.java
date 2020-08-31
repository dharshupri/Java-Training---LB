package com.lionbridge;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
	public static void main(String [] args) {
	 Set<String> set = new HashSet<>();
	 set.add("Java");
	 set.add("Training");
	 set.add("Practice");
	 set.add("Coding");
	 set.add("Java");
	 System.out.println("Hash Set :"+set);
	 System.out.println("Search a string :"+ set.contains("Coding"));
	 
		 
	 }

}
