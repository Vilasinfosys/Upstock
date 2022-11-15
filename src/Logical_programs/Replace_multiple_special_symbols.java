package Logical_programs;

import java.util.Scanner;

public class Replace_multiple_special_symbols {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println(" ley user print the string with special symbols");
		String name =scan.next();
		String Correctname=name.replaceAll("[^a-zA-Z]", "");
		System.out.println(Correctname);
	
	}

}
