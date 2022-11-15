package NSRM_CALL_FROM_SAME_CLASS;

public class Sample_a {
	public static void main(String[]args) {
		System.out.println("main method started");
		Sample_a s=new Sample_a();
		s.m1();
		s.m2();
		System.out.println("main method ends");
		}
	public void m1() {//method declaration
		System.out.println("i am from m1 nonstatic method ");// method implementation
	}
public void m2() {// method declaration
	System.out.println(" i am from m2 non-static method");
}
}
