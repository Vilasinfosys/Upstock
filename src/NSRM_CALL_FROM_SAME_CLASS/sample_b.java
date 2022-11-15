package NSRM_CALL_FROM_SAME_CLASS;

public class sample_b {
	public static void main(String[]args) {
		System.out.println("main method started");
		sample_b c=new sample_b();
		c.s1();
		c.s2();
		c.s3();
		System.out.println("main method ended");
	}
	public void s1() {
		System.out.println("hii Good morning");
	}
	
		public void s2() {
			System.out.println("how are you");
		}
		public void s3() {
			System.out.println("i am fine ");
			
			
			
		}
		}

