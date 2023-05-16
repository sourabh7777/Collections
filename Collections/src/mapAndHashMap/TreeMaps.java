package mapAndHashMap;

import java.util.HashMap;

public class TreeMaps {

	public static void main(String[] args) {
		HashMap<Integer,String> courses = new HashMap<Integer,String>();
		
		courses.put(1,"Manual Testing");
		courses.put(2,"Java");
		courses.put(3,"Maven");
		courses.put(4,"Cucumber");
		courses.put(5,"TestNG");
		courses.put(6, "GIT");
		courses.put(7,"Jenkins");
		courses.put(null,"Testing");
		courses.put(8, null);
		courses.put(9, null);
		
		System.out.println(courses);
		
		//single value
		String course = courses.get(3);
		System.out.println("course Name is : "+course);

	}

}
