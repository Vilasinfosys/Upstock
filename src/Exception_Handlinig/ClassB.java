package Exception_Handlinig;

public class ClassB {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			int c=a/b;
		}
		catch (ArithmeticException monkey) {
			System.out.println("idot enter vaild denominator");
			System.out.println("exception is handled");
		}
	}

}
