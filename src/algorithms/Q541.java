package algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q541 {

	public static void main(String[] args) {

		String string ="a";
//		char[] a = {'e'};
//		System.out.println(a.toString());
		System.out.println(reverseStr(string, 2));
	}
	public static String reverseStr(String s, int k) {
//		
//		if(s.length()<=1){
//			return s;
//		}
        StringBuilder sb = new StringBuilder();
        char[] tmp = s.toCharArray();
        for(int i=0;i<s.length();i=i+k*2){
        	int end = i+k*2;
        	if(end>s.length()){
        		end = s.length();
        	}
        	sb.append(deal(Arrays.copyOfRange(tmp, i, end),k));
        }
        return sb.toString();
    }
	
	private static String deal(char[] in,int k){
		StringBuilder sb = new StringBuilder();
		if(in.length<k){
			for(int i=in.length-1;i>=0;i--){
				sb.append(in[i]);
			}
		}else{
			for(int i=k-1;i>=0;i--){
				sb.append(in[i]);
			}
			if(in.length>k){
				for(int j=k;j<in.length;j++){
					sb.append(in[j]);
				}
			}
		}
		return sb.toString();
	}

}
