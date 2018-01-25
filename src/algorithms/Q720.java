package algorithms;

import java.util.Arrays;
import java.util.HashSet;

import tools.sort;

public class Q720 {

	public static void main(String[] args) {
		
		String[] inStrings = {"m","mo","moc","moch","mocha","l","la","lat","latt","latte","c","ca","cat"};

		System.out.println(longestWord(inStrings));
	}
	
	public static String longestWord(String[] words) {
		int len = 0;
		String res="";
		
        sort(words);
		
		//Arrays.sort(words);
        
        HashSet<String> set = new HashSet<>();
        
        for(int i=0;i<words.length;i++){
        	String tmpString = words[i];
        	if(tmpString.length()==1){
        		if(tmpString.length()>len){
        			len = 1;
        			res = tmpString;
        		}
        		set.add(tmpString);
        		continue;
        	}
        	
        	String preString = tmpString.substring(0,tmpString.length()-1);
        	if(set.contains(preString)){
        		set.add(tmpString);
        		
        		if(tmpString.length()>len){
        			res = tmpString;
        			len = tmpString.length();
        		}
        	}
        }
        
        
        return res;
    }
	
	private static void sort(String[] words){
		for(int i=0;i<words.length;i++){
			for(int j=i+1;j<words.length;j++){
				if(lastIsSmall(words[i],words[j])){
					String tmpString = words[i];
					words[i] = words[j];
					words[j] = tmpString;
				}
			}
		}
	}
	
	private static boolean lastIsSmall(String a,String b){
		if(b.length()<a.length())return true;
		else if(a.length()<b.length())return false;
		else{
			if(a.compareTo(b)<=0)return false;
			return true;
		}
	}
	

}
