package Logical_programs;

import java.util.Scanner;

public class even_odd_1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=s.nextInt();
		if (num%2==0) {
			System.out.println("number is  even ");
			
		}
		
		else
		{
			System.out.println("number is odd");
		}
}

}
