package First;

public class Q4_Prime {

	public static void main(String[] args) {

		int a =10;
	boolean b=true;
		
		for(int i=2; i<a; i++) {
			if(a%i==0) {
				b=false;
			}
		}
		
		
		if(b==true) {
		     System.out.println("this is prime");
		}
		else {
			System.out.println("is not a prime");
		}
		
	}

}
