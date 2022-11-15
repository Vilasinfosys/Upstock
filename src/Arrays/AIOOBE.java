package Arrays;

public class AIOOBE {
	public static void main(String[] args) {
		String ar[]=new String [5];
		ar[0]="Nikita";
		ar[1]="sachin";
		ar[2]="Vilas";
		ar[3]="Ritul";
		ar[4]="Viransh";
		try {
		System.out.println(ar[5]);
		
	}
	catch (ArrayIndexOutOfBoundsException donky) {
System.out.println("idiot there is no data still u r trying to fetch it means u r waste fellow");
}
}
}