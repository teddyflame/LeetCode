package algorithms;

import java.util.Arrays;
import java.util.Comparator;


public class Q646 {

	public static void main(String[] args) {
		
		int[][] in = {{1,2},{2,3},{3,4}};
		
		System.out.println(findLongestChain(in));

	}
	
	public static int findLongestChain(int[][] pairs) {
		
		if(pairs==null || pairs.length==0)return 0;
		int count=1;
		
        Arrays.sort(pairs,new Comparator<int[]>() {

			@Override
			public int compare(int[] a, int[] b) {
				
				if(a[1]==b[1]){
					return a[0]-b[0];
				}else{
					return a[1]-b[1];
				}
			}
		});
        int now = pairs[0][1];
        int index = 1;
        
        
        while(index<pairs.length){
        	if(pairs[index][0]<=now){
        		index++;
        	}else{
        		now = pairs[index][1];
        		count++;
        		index++;
        	}
        }
        
        return count;
    }

}
