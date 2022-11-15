package Prime_Number;

public class ClassB {
public static void main(String[] args) {
	int num=4;
	int count=0;
	for (int i=1;i<=num;i++) {
		if (num%1==0) {
			count ++;
			
		}
	}
	if (count==2) {
		System.out.println(" Given number is prime ");
	
}
	else 
	{
		System.out.println("Given number is  not prime");
	}
}
}