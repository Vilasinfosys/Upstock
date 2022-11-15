 package Collection;

import java.util.Vector;

public class vector {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("Ganesh");
		v.add(100);
		v.add("A");
		v.add(100);
		v.add(null);
		v.add(null);
		System.out.println(v);// print all data
		System.out.println(v.size());//check size
		System.out.println(v.isEmpty());//insertion operation
		v.add(3,500);
		System.out.println(v);//right shift
		v.remove(3);
		System.out.println(v);// left shift
	}

}
