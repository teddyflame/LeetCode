package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Q840 {

	public static void main(String[] args) {
		
		
		String string = "abcdddeeeeaabbbcd";
		List<List<Integer>> res = largeGroupPositions(string);
		
		System.out.println("");
		
		
	}
	
	public static List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> res = new ArrayList<>();
        int start = 0;
        char now = S.charAt(0);
        int index = 1;
        while(index<S.length()){
            if(S.charAt(index)!=now){
                if(index-1-start>=3){
                    List<Integer> list = new ArrayList<>();
                    list.add(start);
                    list.add(index-1);
                    res.add(list);
                }
                start = index;
                now = S.charAt(index);
            } 
            index++;
        }
        return res;
    }

}
