package Static_nonstatic_variables;

public class Dimple {
	int k=50;// non static global variable
	public static void main(String[]args) {
		Dimple d=new Dimple();
		System.out.print(d.k);
	}

}
