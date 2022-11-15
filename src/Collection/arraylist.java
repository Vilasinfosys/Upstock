package Collection;

import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Sachin");
		al.add(100);
		al.add("A");
		al.add(100);
		al.add(null);
		al.add(null);
		System.out.println(al);// print all data in class
		System.out.println(al.size());//get the size
		System.out.println(al.isEmpty());//check whether is empty 
		al.add(3500);// insertion operation
		System.out.println(al);//
		al.remove(3);
		System.out.println(al);
	}
	

}
