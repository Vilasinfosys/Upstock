package Maps;

import java.util.Hashtable;

public class hashtable_1 {
	public static void main(String[] args) {
		Hashtable<Integer,String>t=new Hashtable<Integer,String>();
		t.put(1,"Sainath");
		t.put(2, "SaiVirbhadra");
		t.put(3, "Raje");
		t.put(4, "Maharaj");
		System.out.println(t);// print all the data
		t.remove(3);
		System.out.println(t);
	}

}
