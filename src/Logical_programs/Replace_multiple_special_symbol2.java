package Logical_programs;

import java.util.Scanner;

public class Replace_multiple_special_symbol2 {
	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println(" hey user print the string with special symbol");
		String Name=Scan.next();
		String Correctname=Name.replaceAll("[^a-zA-Z]","");
		System.out.println(Correctname);
	}

}
