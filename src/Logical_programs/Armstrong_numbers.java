package Logical_programs;

public class Armstrong_numbers {
	public static void main(String[] args) {
		int num=370;
		int actnum=num;
		int r=0;
		int armnum=0;
		while (num>0) {
			r=num%10;
			armnum=r*r*r+armnum;
			num=num/10;
			}
		if (armnum==actnum) {
			System.out.println(" given number is armstrong");
			}
		else
		{
			System.out.println("given no is not armstrong");
		}
	}

}
