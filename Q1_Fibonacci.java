package First;

public class Q1_Fibonacci {

	public static void main(String[] args) {

		int a=-1;
		int b=1;
		int c=0;
		
		for(int i=0; i<=5; i++) {
			c=a+b;//01
			a=b;//1
			b=c;//0
			System.out.println(c);
		}
		
	        
	}

}
