package set;


import java.util.TreeSet;

public class TreeSets {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>();
		
		names.add("Tom");
		names.add("Jack");
		names.add("Harry");
		names.add("Carlos");
		names.add("Nicholos");
		
		System.out.println("Elements are : "+names);
		//Advanced for loop
		for(String name : names) {
			System.out.println(name);
		}

	}

	}


