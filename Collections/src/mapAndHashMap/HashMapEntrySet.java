package mapAndHashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEntrySet {

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
		
		for(Map.Entry<Integer,String> data : courses.entrySet()) {
			System.out.println("key is "+data.getKey()+ " and the value is "+data.getValue());
		}
	}

}
