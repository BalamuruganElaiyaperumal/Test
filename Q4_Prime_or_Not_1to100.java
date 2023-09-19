package First;

public class Q4_Prime_or_Not_1to100 {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			boolean a =true;	
		for(int j=2; j<i; j++) {
			if(i%j==0) {	
				a=false;
			}
		}	
		if(a==false) { //a==true prime number
			
			System.out.print(i+"-");
		}
		
		}
		
	}

}
