package Logical_programs;

public class Reverse_string1 {
	public static void main(String[] args) {
		String org="Sachin";
		String rev="";
		for (int i=org.length ()-1;i>=0;i--) {
			rev=org+org.charAt(i);
		}
System.out.println(rev);

	}

}
