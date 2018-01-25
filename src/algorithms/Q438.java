package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Q438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "cbaebabacd";
		String p = "abc";
		
		List<Integer> list = findAnagrams(s,p);
		
		System.out.println("");
	}
	
	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> list = new ArrayList<>();
        if(s==null || p==null || s.length()==0 ){
            return list;
        }
      
        int[] hash = new int[256];
        for(char c: p.toCharArray()){
            hash[c]++;
        }
        
        int left = 0;
        int right=0;
        int count = p.length();
        while(right<s.length()){
            if(hash[s.charAt(right++)]-->=1){
                count--;
            }
            
            if(count==0){
                list.add(left);
            }
            
            if(right-left==p.length() && hash[s.charAt(left++)]++ >=0){
                count++;
            }
        }
		
		return list;
	}
	
	private static boolean match(String a,List<Character> b){
		
		
		for(int i=0;i<a.length();i++){
			if(!b.contains(a.charAt(i))){
				return false;
			}else{
				b.remove(b.indexOf(a.charAt(i)));
			}
		}
		
		if(b.size()==0){
			return true;
		}else{
			return false;
		}
	}
	
	
	
	public static List<Integer> findAnagrams2(String s, String p) {
        char[] in = p.toCharArray();
        List<Integer> res = new ArrayList<Integer>();
        int start_index = 0;
        int index = 0;
        int count = 0;
        List<Character> source = new ArrayList<>();
        List<Character> useList = new ArrayList<>();
        for(int i=0;i<in.length;i++){
            source.add(in[i]);
        }
        
        
        while(start_index+p.length()<=s.length() 
        		&& index<s.length()){
        	//在子串中压根不存在
        	if(index-start_index<p.length() &&
        			!source.contains(s.charAt(index))){
        		start_index=index+1;
            	index = start_index;
            	useList.removeAll(useList);
            	useList.addAll(source);
            	count=0;
            	continue;
        	}
            
        	
        	if(count==0){	//一轮匹配的开始，准备数组
        		useList = new ArrayList<>();
        		useList.addAll(source);
        		
        		useList.remove(useList.indexOf(s.charAt(index)));
        		
        		count++;
        		index++;
        	}else if(count==p.length()){ //找齐
        		res.add(start_index);
        		
        		//useList.remove(useList.indexOf(s.charAt(start_index)));
        		useList.addAll(source);
        		useList.remove(useList.indexOf(s.charAt(start_index)));
        		start_index++;
        		//index;
        		count--;
        	}else{  //匹配中
        		if(useList.contains(s.charAt(index))){
        			useList.remove(useList.indexOf(s.charAt(index)));
        			
        			index++;
        			count++;
        		}else{
        			if(index-p.length()<0){
        				count=0;
        				start_index++;
        				index=start_index;
        			}else{
        				useList.add(s.charAt(index-p.length()));
        				count--;
        			}
        		}
        	}
        }
        
        return res;
    }

}
