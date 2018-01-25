package algorithms;

import java.util.ArrayList;
import java.util.Iterator;

public class Q697 {

	public static void main(String[] args) {
		int[] nums = {2,1,1,2,1,3,3,3,1,3,1,3,2};
		
		System.out.println(findShortestSubArray(nums));
		

	}
	
	public static int findShortestSubArray(int[] nums) {
        int[] counts = new int[50000];
        int max = 0;
        ArrayList<Integer> maxNums = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int tmp = nums[i];
            counts[tmp]++;
            if(counts[tmp]>max){
                max = counts[tmp];
                maxNums.clear();
                maxNums.add(tmp);
            }else if(counts[tmp]==max){
            	maxNums.add(tmp);
            }
        }
        
        int res = nums.length;
        
        Iterator<Integer> iter = maxNums.iterator();
        while(iter.hasNext()){
        	int maxNum = iter.next();
        	int first = 0,last =0;
            boolean firstFlag = false;
            
            for(int i=0;i<nums.length;i++){
                if(nums[i]==maxNum){
                    if(!firstFlag){
                        first = i;
                        firstFlag = true;
                    }else{
                        last = i;
                    }
                }
            }
            
            res = Math.min(res, last-first+1);
        }
        
        
        return res;
    }

}
