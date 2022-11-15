package Collection;

import java.util.LinkedList;

public class Link_list {
public static void main(String[] args) {
	LinkedList ll=new LinkedList();
	ll.add("Ganpati");
	ll.add(100);
	ll.add("A");
	ll.add(null);
	ll.add(null);
	ll.add(100);
	System.out.println(ll);// print all data
	System.out.println(ll.size());// size of data
	System.out.println(ll.isEmpty());
	ll.add(1,"Bappa");
	System.out.println(ll);
	ll.remove(1);
	
	System.out.println(ll);
}
}
