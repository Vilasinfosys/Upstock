package Static_nonstatic_variables;

public class Demo {
	static String s="velocity";
	String s1="Vilas";
	public static void main (String[]args) {
		System.out.println(s);
		Demo d=new Demo();
		System.out.println(d.s1);
	}

}
