package algorithms;

public class Q125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="0p";
		
		System.out.println(isPalindrome(a));
	}

	
	 public static boolean isPalindrome(String s) {
	        if(s==null || s.length()<=1)return true;
	        
	        s=s.toLowerCase();
	        
	        int front = 0;
	        int back = s.length()-1;
	        
	        while(back>front){
	            if(s.charAt(front)>122 || s.charAt(front)<'a'){
	                front++;
	                continue;
	            }
	            
	            if(s.charAt(back)>'z'||s.charAt(back)<'a'){
	                back--;
	                continue;
	            }
	            
	            if(s.charAt(front)!=s.charAt(back))return false;
	            
	            front++;
	            back--;
	        }
	        
	        return true;
	    }
}
