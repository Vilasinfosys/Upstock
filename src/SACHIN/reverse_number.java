package SACHIN;

import java.util.Scanner;

public class reverse_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTERE THE NUMBER");
		int num=sc.nextInt();
	int no,rev=0,r,a;
	a=num;
	while(num>0){
		r=num%10;
		rev=rev*10+r;
		num=num/10;
		System.out.println("Reverse:"+rev);
	}
	
	}
}
	

