package algorithms;

import java.util.HashMap;
import java.util.HashSet;

public class Q819 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String paraString = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] bannedStrings = {"hit"};
		
		System.out.println(mostCommonWord(paraString, bannedStrings));
	}
	
	public static String mostCommonWord(String paragraph, String[] banned) {
        
        String res = "";
        int max=0;
        HashSet<String> set = new HashSet<String>();
        
        for(String banString: banned){
            set.add(banString);
        }
        
        HashMap<String,Integer> map = new HashMap<>();
        String[] words = paragraph.split(" ");
        
        for(String word:words){
            while(lastCharIsSymbol(word)){
                word = word.substring(0,word.length()-1);
            }
            word = word.toLowerCase();
            if(set.contains(word))continue;
            int count = 0;
            if(!map.containsKey(word)){
                count=1;
                map.put(word,count);
            }else{
                count = map.get(word)+1;
                map.put(word,count);
            }
            if(count>max){
                res = word;
                max = count;
            }
        }
        return res;
    }
    
    private static boolean lastCharIsSymbol(String word){
        char tmp = word.charAt(word.length()-1);
        if(tmp=='!' || tmp=='?' || tmp=='\''  || tmp==',' 
           || tmp==';' || tmp=='.'){
            return true;
        }
        
        return false;
    }

}
