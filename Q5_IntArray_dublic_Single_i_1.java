package First;

public class Q5_IntArray_dublic_Single_i_1 {

	public static void main(String[] args) {

		int[] a= {30,40,50,70,30,60,80,90,50,50,70};
		for(int i=0; i<a.length; i++) {
			int c=1;
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					c++;
					a[j]='0';
				}
				
			}
			if(c>1 && a[i]!='0') {
				
               System.out.println(a[i]+"="+c);	
}
		}
	}

}
	


