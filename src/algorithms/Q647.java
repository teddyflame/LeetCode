package algorithms;

public class Q647 {

	public static void main(String[] args) {

		
		System.out.println(countSubstrings("aaa"));
	}
	
	public static int countSubstrings(String s) {
        if(s==null||s.length()==0)return 0 ;
        int res = s.length();
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(isPalindromic(s.substring(i,j+1))){
                    res++;
                }
            }
        }
        
        return res;
    }
    
    
    private static boolean isPalindromic(String in){
        int start = 0;
        int end = in.length()-1;
        while(start<end){
            if(in.charAt(start)!=in.charAt(end)){
                return false;
            }    
            start++;
            end--;
        }    
        return true;
    }

}
