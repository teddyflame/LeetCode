package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Q784 {

	public static void main(String[] args) {
		List<String> res = letterCasePermutation("ab");
        
        for(String ss :res){
            System.out.println(ss);
        }
	}
	
	 static  List<String> res = new ArrayList<>();
	    
	 public static List<String> letterCasePermutation(String S) {
	        
	        if(S==null || S.length()==0){
	            res.add("");
	            return res;
	        }    
	        
	        search(S.toLowerCase(),0,true);
	        
	        return res;
	    }
	    
	    private static void search(String s,int index,boolean isNew){
	        if(isNew){
	            res.add(s);
	        }
	        
	        if(index>=s.length())return;

	        search(s,index+1,false);
	        char tmp = s.charAt(index);
	        if(tmp>=97 && tmp<=122){
	        	char[] sChar = s.toCharArray();
                
                sChar[index] -=32;
                search(new String(sChar),index+1,true);         
	        }
	        
	   }

}
