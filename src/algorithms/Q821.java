package algorithms;

import java.util.ArrayList;
import java.util.List;


public class Q821 {

	public static void main(String[] args) {
		String S = "aaba";
		char C = 'b';
		
		int[] out = shortestToChar(S,C);
		System.out.println("");
	}
	
	public static int[] shortestToChar(String S, char C) {
		int[] out = new int[S.length()];
        List<Integer> postions = new ArrayList<>();
        
        for(int i=0;i<S.length();i++) {
        	if(S.charAt(i)==C) {
        		postions.add(i);
        	}
        }
        int index = 1;
        int frontIndex = postions.get(0);
        int backIndex = postions.size()==1?frontIndex:postions.get(1);
        int j = 0;
        while(j<out.length) {
        	
        	if(j<frontIndex) {
        		out[j] = frontIndex-j;
        		j++;
        	}else if(j==frontIndex){
        		out[j] = 0;
        		j++;
        	}else if(j>frontIndex && j<backIndex) {
        		out[j] = Math.min(j-frontIndex, backIndex-j);
        		j++;
        	}else if(j==backIndex) {
        		out[j] = 0;
        		j++;
    //    		if(j>=out.length)break;
        		if(index<postions.size()-1) {
        			frontIndex = backIndex;
        			backIndex = postions.get(++index);
        		}
        	}else {
        		//if(j>=out.length)break;
        		out[j] = j-backIndex;
        		j++;
        	}
        }
        
        return out;
        
    }

}
