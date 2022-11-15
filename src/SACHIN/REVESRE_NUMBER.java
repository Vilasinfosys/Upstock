package SACHIN;

import java.util.Scanner;

public class REVESRE_NUMBER {
	public static void main(String[] args) {
		int n,r;
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while (n>0) {
		r=n%10;
		System.out.println(r);
			n=n/10;	
	}
	}

}