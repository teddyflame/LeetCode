package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Q139 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		String string="goalspecial";
		
		List<String> dict = new ArrayList<String>();
		
		dict.add("leet");
		dict.add("code");
		dict.add("go");
		dict.add("goal");
		dict.add("goals");
		dict.add("special");

		System.out.println(wordBreak(string, dict));
	}
	
	public static boolean wordBreak(String s, List<String> wordDict) {
        if(s==null || s.length()==0)return false;
        if(s.length()>=1){
            if(wordDict.contains(s))return  true;
            if(s.length()==1)return false;
        }
        
        List<Boolean> flagList = new ArrayList<>();
        int startIndex = 0;
        int endIndex = 1;
        while(endIndex<s.length()){
            if(wordDict.contains(s.substring(startIndex,endIndex))){
            	flagList.add(wordBreak(s.substring(endIndex,s.length()),wordDict));
            }
            endIndex++;
        }
        
        boolean res = false;
        for(int i=0;i<flagList.size();i++){
        	res |= flagList.get(i);
        }
        
        return res;
    }

}
