package SACHIN;

import java.util.Scanner;

public class Febo_Series {
	public static void main(String[] args) {
		int term,a=0,b=1,c;
		System.out.println("Enter the given series");
		Scanner s =new Scanner(System.in);
		term=s.nextInt();
		for(int i=1;i<=term;i++) {
       System.out.println(a+" ");

			c=a+b;
			a=b;
			b=c;
			
		}
	}

}
