package Static_nonstatic_variables;
public class Sample {// class body open
	static int i=10;// static global variable
	int j=30;// non-static global variable
	
	public static void main(String[]args){//main method body open
		System.out.println(i);//
		Sample s=new Sample ();
		System.out.println(s.j);//30
		
	}// main method body closed
	
}// class body close
