package SACHIN;

import java.util.Scanner;

public class Replace_character {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string which contain spl char");
		String name =s.next();
		 String correctname=name.replace("@","&");
		System.out.println("Correctname");
		
	}

}
