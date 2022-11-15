package SACHIN;

import java.util.Scanner;

public class oddd_even {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		if (num%2==0) {
			System.out.println("Given number is even");
		}
		else
		{
			System.out.println("Given number is odd");
	}

}
}