package Logical_programs;

public class prime_number {
	public static void main(String[] args) {
		int num=11;
		int count=0;
	for(int i=1;i<=num;i++) {
		if(num%i==0) {
			count++;
		
	}
	}
	if (count==2) {
		System.out.println("Number is prime");
		
	}
	else {
		System.out.println("Number is not prime");
	}
		
	}

}
