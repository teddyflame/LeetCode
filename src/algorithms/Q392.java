package algorithms;

public class Q392 {

	public static void main(String[] args) {

		
		String s = "abc";
		String t = "addceeb";
		System.out.println(isSubsequence(s, t));
	}
	
public static boolean isSubsequence(String s, String t) {
        char[] sArray = s.toCharArray();

        for(int i=0;i<sArray.length;i++){
        	int index = t.indexOf(sArray[i]);
        	
        	if(index==-1){
        		return false;
        	}else{
        		t = t.substring(index+1, t.length());
        	}
        	
        }
        
        return true;
    }

}
