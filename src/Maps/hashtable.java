package Maps;

import java.util.Hashtable;

public class hashtable {
	public static void main(String[] args) {
		Hashtable<Integer, String> t =new Hashtable<Integer,String>();
		t.put(101, "Sachin");
		t.put(102, "Vilas");
		t.put(103, "Sainath");
		t.put(104, "Nikita");
		t.put(105, "Ritul");
		System.out.println(t);// print all the data
		t.remove(102);
		System.out.println(t);// remove any one entity 
	}

}
