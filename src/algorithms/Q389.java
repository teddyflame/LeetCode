package algorithms;

import java.util.Arrays;

public class Q389 {

	public static void main(String[] args) {
		String s="abcd";
		String t="abcde";
		System.out.println(findTheDifference(s, t));
	}
	
public static char findTheDifference(String s, String t) {
        
		char[] source = s.toCharArray();
		char[] target = t.toCharArray();
		
		Arrays.sort(source);
		Arrays.sort(target);
		
		for(int i=0;i<s.length();i++){
			if(source[i]!=target[i]){
				return target[i];
			}
		}
		
		return target[target.length-1];
    }

}
