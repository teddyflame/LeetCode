package algorithms;

import java.util.Arrays;
import java.util.HashMap;

public class Q451 {

	public static void main(String[] args) {

	}
	
	public static String frequencySort(String s) {
        char[] array = s.toCharArray();
        HashMap<Character, Integer>  map = new HashMap<>();
        for(int i=0;i<array.length-1;i++){
        	char tmp = array[i];
        	
        	if(map.containsKey(tmp)){
        		int count = map.get(tmp) + 1;
        		map.replace(tmp, count);
        	}else{
        		map.put(tmp, 1);
        	}
        }
        
       // Arrays.sort
        return "";
    }

}
