package org.lessons.collections;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
	
	public static void main (String[]args) {
		Set <String> stringhe = new HashSet<>();
		
		stringhe.add("Primo");
		stringhe.add("Secondo");
		stringhe.add("Terzo");	
		
		System.out.println(stringhe);
		
		stringhe.remove("Secondo");
		
		System.out.print(stringhe);
	}

}
