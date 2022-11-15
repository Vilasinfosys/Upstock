package Arrays;

public class AIOOBE1 {
	public static void main(String[]args) {
String ar[]=new String[5];
ar[0]="Vilas";
ar[1]="Sachin";
ar[2]="Nikita";
ar[3]="Ritual";
ar[4]="Viransh";
// print the data which not present
try {
	System.out.println(ar[5]);
}
	catch(ArrayIndexOutOfBoundsException monkey) {
System.out.println("No data");
}
}
}