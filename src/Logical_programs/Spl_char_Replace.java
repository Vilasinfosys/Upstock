package Logical_programs;

import java.util.Scanner;

public class Spl_char_Replace {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter string which contains spl chars");
		String name=s.next();
		String correctname=name.replace("@", "i");
		System.out.println(correctname);
	}

}
