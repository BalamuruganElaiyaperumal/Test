package First;

public class Q4_PrimeArray {

	public static void main(String[] args) {
		int[] a = {2,5,8,9,10,7,11};
		
      	for(int i=0; i<a.length; i++) {
				boolean b=true;
				for(int j=2; j<a[i]; j++) {
					if(a[i]%j==0) {
						b=false;
					}		
					
				}
			if(b==true) {
				System.out.println(a[i]);
			}
				
	}
	}

}
