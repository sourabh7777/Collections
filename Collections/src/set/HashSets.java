package set;

import java.util.HashSet;

public class HashSets {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>();
		
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
