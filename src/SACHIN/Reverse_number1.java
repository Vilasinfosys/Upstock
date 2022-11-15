package SACHIN;

import java.util.Scanner;

public class Reverse_number1 {
public static void main(String[] args) {
int n,r;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
n=s.nextInt();
while (n>0) {
	r=n%10;

	System.out.println(r);
	n=n/10;
	
}
}
}
