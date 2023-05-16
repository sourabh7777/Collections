package set;

import java.util.LinkedHashSet;

public class LinkedHashSets {

	public static void main(String[] args) {
		LinkedHashSet<String> names = new LinkedHashSet<String>();
		
		names.add("Tom");
		names.add("Jack");
		names.add("Harry");
		names.add("Carlos");
		names.add("Nicholos");
		
		System.out.println("Elements are : "+names);
		//Advanced foor loop
		for(String name : names) {
			System.out.println(name);
		}

	}

}
