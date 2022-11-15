package Collection;

import java.util.HashSet;

public class hashset {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add("Sachin");
	hs.add("A");
	hs.add(100);
	hs.add(null);
	hs.add(null);
	System.out.println(hs);// print all data
	System.out.println(hs.size());// size of data
	hs.clear();
	System.out.println(hs);//clear entire data
}
}
