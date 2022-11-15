package Exception_Handlinig;

public class Exception_Haandling_mechanism {
	public static void main(String[] args) 
			throws InterruptedException {
		int a=10;
		int b=0;
		try {	
		int c=a/b;	
		}
		catch(RuntimeException e) {
			System.out.println("Idiot enter valid denominater ");
			Thread.sleep(3000);
		}

	}
	}