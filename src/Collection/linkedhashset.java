package Collection;

import java.util.LinkedHashSet;

public class linkedhashset {
	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Sainath");
		lhs.add(100);
		lhs.add("A");
		lhs.add(100);
		lhs.add(null);
		lhs.add(null);
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		
		
	}

}
