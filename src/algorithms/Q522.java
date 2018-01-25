package algorithms;

import java.awt.image.RescaleOp;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Q522 {

	public static void main(String[] args) {

		String[] strs  ={"aabbcc", "aabbcc","cb","abc"};
		
		System.out.println(findLUSlength(strs));
	}

	public static int findLUSlength(String[] strs) {
        int res = -1;
		HashMap<String, Integer> map_use = new HashMap<String, Integer>();
		HashSet<String> set_del = new HashSet<String>();
        for(int i=0;i<strs.length;i++){
        	if(isSubString(set_del, strs[i])){
        		continue;
        	}
            if(map_use.containsKey(strs[i])){
                map_use.remove(strs[i]);
                set_del.add(strs[i]);
            }else{
            	map_use.put(strs[i], strs[i].length());
            }
        }
        Iterator iterator = map_use.entrySet().iterator();
        while(iterator.hasNext()){
        	Map.Entry entry = (Map.Entry)iterator.next();
        	
        	if(res<(int)entry.getValue()){
        		res = (int)entry.getValue();
        	}
        }
        return res;
    }
	
	private static boolean isSubString(HashSet<String> set,String in){
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			String tmpString = (String)iter.next();
			if(judgeSubsequence(tmpString,in)){
				return true;
			}
		}
		return false;
	}
	
	private static boolean judgeSubsequence(String source,String in){
		int index = 0;
		for(int i=0;i<in.length();i++){
			boolean flag = false;
			while(index<source.length()){
				if(in.charAt(i) == source.charAt(index)){
					index++;
					flag = true;
					break;
				}else{
					index++;
				}
			}
			if(flag==false){
				return false;
			}
		}
		return true;
	}
}
