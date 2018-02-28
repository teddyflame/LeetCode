package algorithms;

import java.util.Arrays;

public class Q581 {

	public static void main(String[] args) {

		 int[] in = {2,6,4,8,10,9,15};
		System.out.println(findUnsortedSubarray3(in));
	}
	
	public static int findUnsortedSubarray3(int[] A) {
	    int n = A.length, beg = -1, end = -2, min = A[n-1], max = A[0];
	    for (int i=1;i<n;i++) {
	      max = Math.max(max, A[i]);
	      min = Math.min(min, A[n-1-i]);
	      if (A[i] < max) end = i;
	      if (A[n-1-i] > min) beg = n-1-i; 
	    }
	    return end - beg + 1;
	}
	
	 public static int findUnsortedSubarray(int[] nums) {
	        if(nums==null || nums.length<2){
	            return 0;
	        }
	        
	        int[] compare = nums.clone();
	        
	        Arrays.sort(compare);
	        
	        int front = 0;
	        int back = nums.length-1;
	        boolean frontFlag = false;
	        boolean backFlag = false;
	        
	        int start = 0;
	        int end = 0;
	        
	        while((back>front) && !(frontFlag&backFlag)){
	            if(compare[front]!=nums[front] && !frontFlag){
	                start = front;
	                
	                frontFlag = true;
	            }
	            if(compare[back]!=nums[back] && !backFlag){
	                end = back;

	                backFlag =true;
	            }
	            if(!frontFlag) front++;
	            if(!backFlag)  back--;
	        }
	        
	        return end-start+1;
	    }
	
	public static int findUnsortedSubarray2(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        
        int fIndex = 0;
        int bIndex = nums.length-1;
        int start = -1;
        int end = -1;
        int count=0;
        while(fIndex<nums.length-1){
            if(nums[fIndex]>nums[fIndex+1]){
                start = fIndex-count;
                break;
            }else if(nums[fIndex] ==  nums[fIndex+1]){
                count++;
                fIndex++;
            }else{
                count=0;
                fIndex++;
            }
        }
        count=0;
        while(bIndex>0){
            if(nums[bIndex]<nums[bIndex-1]){
                end = bIndex+count;
                break;
            }else if(nums[bIndex]==nums[bIndex-1]){
                count++;
                bIndex--;
            }else{
                count=0;
                bIndex--;
            }
        }
        
        return start!=-1?end-start+1:0;
    }

}
