package SACHIN;

public class String_palindrome1 {
	public static void main(String[] args) {
		String org="nitin";
		String rev="";
		for (int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
			System.out.println(rev);
		
	if (org.equals(rev)) {
		System.out.println("given string is palindrome");
	} 
	else
	{
		System.out.println("given string is not palindrome");
	}
	
	
	}
	
}

