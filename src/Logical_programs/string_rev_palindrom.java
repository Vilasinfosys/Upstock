package Logical_programs;

public class string_rev_palindrom {
	public static void main(String[] args) {
		String org= "VILAIV";
		String rev="";
		for(int i=org.length()-1;i>=0;i--) {
			rev= rev+org.charAt(i);
			//System.out.println(rev);
			
		}
		System.out.println(rev);
		if(org.equals(rev)) {
			System.out.println(" String is palindrom");
			
		}
		else {
			System.out.println("String is not palindrom");
		}
	}
	

}
