package algorithms;

public class Q796 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		String aString = "abcde";
		String bString = "bcdea";
		System.out.println(rotateString(aString,bString));
	}
	
	  public static boolean rotateString(String A, String B) {
	        if(A.equals(B))return true;
	        for(int i=1;i<A.length();i++){
	            if(B.charAt(i)==A.charAt(0)){
	            	int index = A.length()-i; 
	                StringBuffer sb = new StringBuffer();
	                sb.append(A.substring(index,A.length()));
	                sb.append(A.substring(0,index));
	                
	                if(sb.toString().equals(B))return true;
	            }
	        }
	        
	        return false;
	    }

}
