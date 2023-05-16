package List;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		
		
		LinkedList<String> l_dup = new LinkedList<String>();
		l_dup.addAll(l);
		System.out.println(l_dup);   //[X,Y,Z,A,B,C]
		
		l_dup.removeAll(l);
		System.out.println(l_dup);   //[]
		
		//sort  --- Collections.sort();
		System.out.println("Element in the Linked List Before Sorting: "+l);    //[X, Y, Z, A, B, C]
		Collections.sort(l);
		System.out.println("Element in the Linked List After Sorting: "+l);    //[A, B, C, X, Y, Z]
		
		
		//sorting in reverse order
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("Element in the Linked List After sorting in reverse order: "+l);   //[Z, Y, X, C, B, A]
		
		
		//Shuffling -- Collections.shuffle();
		Collections.shuffle(l);
		System.out.println("Element in the Linked List after Shuffling: "+l);   //[C, A, B, Z, X, Y]
		
		

	}

}
