package SACHIN;

public class string {
	public static void main(String[] args) {
		String org="Mom";
		String rev="";
		for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
			System.out.println(rev);
		
	if (org.equals(rev)) {
		System.out.println("Given string is pailndrome");
	}
	else 
	{
	System.out.println("Given string is not  pailndrome");
}
	}
}