package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q524 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	System.out.println("b".compareTo("a"));
		String s =  "abpcplea";
		List<String> d = new ArrayList<>
				(Arrays.asList("ale","apple","monkey","plea"));
		System.out.println(findLongestWord(s, d));


			
	}
	
	public static String findLongestWord(String s, List<String> d) {
        int max = 0;
        int target = -1;
		
		for(int i=0;i<d.size();i++){
			String tmp = d.get(i);
			
			if(isMatch(s,tmp)){
				if((tmp.length()<max) || 
					(tmp.length() == max && target!=-1 
					&& tmp.compareTo(d.get(target))>0)){
					continue;
				}
				max = tmp.length();
				target = i;
			}
			
		}
		
		return target==-1?"":d.get(target);
    }
	
	private static boolean isMatch(String s,String sub){
		int index = 0;
		int indexSub = 0;
		while(index<s.length() && indexSub<sub.length()){
			if(s.charAt(index) == sub.charAt(indexSub)){
				index++;
				indexSub++;
			}else{
				index++;
			}
		}
		
		if(indexSub==sub.length())return true;
		return false;
	}
	

}
