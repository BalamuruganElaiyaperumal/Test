package First;

public class Q5_String_Dublicate_AND_nonDublicate_i_0 {

	public static void main(String[] args) {

		String a="balajaji";
		String b="";
		for(int i=0; i<a.length(); i++) {
			int count=0;
			for(int j=0; j<a.length(); j++) {
				if(a.charAt(i)==a.charAt(j))
				count++;
			}
			
			if(count==1) {// non dublicate count==1;
				b=b+a.charAt(i);
			}
			else {
				
				System.out.println(a.charAt(i));
			}
		}
		System.out.println(b);

	}

}
