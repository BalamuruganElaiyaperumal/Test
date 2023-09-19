package First;

public class Q3_palindrome {

	public static void main(String[] args) {
      String a ="mom";
      String b="";
      
      for(int i=a.length()-1; i>=0; i--) {
    	  
    	  b=b+a.charAt(i);
    	  
      }
      if(b.equals(a)) {
    	  System.out.println("this is palindrom");
      }
      else {
    	  
    	  System.out.println("not palindrome");
      }
	}

}
