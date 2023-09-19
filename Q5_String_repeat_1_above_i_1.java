package First;

public class Q5_String_repeat_1_above_i_1 {

	public static void main(String[] args) {

		String a ="hellowworldl";
		char[] b =a.toCharArray();	
		for(int i=0; i<b.length; i++) {
			int count=1;
			for(int j=i+1; j<b.length; j++) {		
				if(b[i]==b[j]) {
					count++;
					b[j]='0';
				}
			}
			if(count>1 && b[i]!='0') {
				System.out.println(b[i]+"-"+count);
			}
			
		}

	}

}
