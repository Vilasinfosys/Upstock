package SACHIN;

import java.util.Scanner;

public class SPECIAL_STRING {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string which contain spl string");
		String name=s.next();
		String correctname=name.replace("@","A");
		System.out.println("correctname");
	}

}
