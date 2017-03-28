package algorithms;

import java.util.HashMap;

public class Q290 {

	public static void main(String[] args) {

		String pattern = "abba";
		String in ="dog dog dog dog";
		
		System.out.println(wordPattern(pattern, in));
	}
	
	public static boolean wordPattern(String pattern, String str) {
        char[] pattrenArray = pattern.toCharArray();
        
        String[] in = str.split(" ");
        
        if(pattrenArray.length!=in.length){
        	return false;
        }
        
        HashMap<Character, String> map = new HashMap<>();
        
        for(int i=0;i<in.length;i++){
        	if(!map.containsKey(pattrenArray[i])){
        		if(map.containsValue(in[i])){
        			return false;
        		}
        		map.put(pattrenArray[i], in[i]);
        	}else{
        		if(!map.get(pattrenArray[i]).equals(in[i])){
        			return false;
        		}
        	}
        } 
        return true;
    }

}
