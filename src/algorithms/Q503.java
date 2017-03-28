package algorithms;

import tools.PublicTools;

public class Q503 {

	public static void main(String[] args) {
		
		int[] in = {5,4,3,2,1};
		
		PublicTools.PrintIntArray(nextGreaterElements(in));

	}
	
	public static  int[] nextGreaterElements(int[] nums) {
		
		if(nums.length==0)return null;
		
		int[] res = new int[nums.length];
		if(nums.length==1){
			res[0]=-1;
			return res;
		}else if(nums.length==0){
			return nums;
		}
		
		
	    for(int i=0;i<nums.length;i++){
	    	int tmp = nums[i];
	    	int index = i+1;
	    	if(index==nums.length){
    			index=0;
    		}
	    	
	    	while(index!=i){
	    		
	    		
	    		if(nums[index]>tmp){
	    			res[i] = nums[index];
	    			break;
	    		}
	    		
	    		index++;
	    		if(index==nums.length){
	    			index=0;
	    		}
	    	}
	    	
	    	if(index==i){
	    		res[i] = -1;
	    	}
	    }
	    
	    return res;
	}
	

}
