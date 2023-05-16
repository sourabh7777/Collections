package List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList<Comparable> l = new LinkedList<Comparable>();
		l.add(100);
		l.add("welcome");
		l.add("18.5");
		l.add('A');
		l.add("true");
		System.out.println(l);     //[100,welcome,A,18.5,true]
		System.out.println("The number of element in Linked list : "+ l.size());  //5
		l.remove(1);
		System.out.println("After removing element from Linked List  :"+ l);   //[100,18.5,A,true]
		l.add(2,"Python");
		
		System.out.println("After insertion "+l);    //[100,18.5,python,A,true]
		l.set(2,"c#");
		System.out.println("After replacing element : "+l);   //[100,18.5,C#,A,true]
 		
		System.out.println(l.contains("C#"));    //true
		System.out.println(l.contains("c++"));   //false
		System.out.println(l.isEmpty());         //false
		
		Iterator<Comparable> it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());     //Printing the element
		}
	}

}
