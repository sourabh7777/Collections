package List;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		
		ArrayList<String> obj = new ArrayList<String>();
		
		obj.add("Selenium");
		obj.add("QTP");
		obj.add("PostMan");
		obj.add("JMeter");
		
		
		//To get Specific Element
		String output = obj.get(2);
		System.out.println("The output is :"+ output);
		
		//to get all element
		System.out.println(obj);
		
		// to iterate one by one
		for(String course : obj) {
			System.out.println(course);
		}

	}

}
