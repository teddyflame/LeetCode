package algorithms;

import java.util.HashMap;

public class Q205 {

	public static void main(String[] args) {
		
		String string="hello world";
		for(int i=0;i<string.length()-1;i++){
			char a = string.charAt(i);
			System.out.println(a);
		}

	}
	
	public static boolean isIsomorphic(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        
        for(int i=0;i<sArray.length;i++){
        	if(!mapS.containsKey(sArray[i])&&
        			!mapT.containsKey(tArray[i])){
        		mapS.put(sArray[i],i);
        		mapT.put(tArray[i],i);
        	}else if(mapS.containsKey(sArray[i]) &&
        			mapT.containsKey(tArray[i])){
        		if( mapS.get(sArray[i]) != 
        				mapT.get(tArray[i]))
        			return false;
        	}else{
        		return false;
        	}
        	
        }
        return true;
    }

}
