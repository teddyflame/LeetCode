package algorithms;

public class Q53 {

	public static void main(String[] args) {
		
		int[] in = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(maxSubArray(in));

	}
	 public static int maxSubArray(int[] nums) {
	        if(nums==null || nums.length==0){
	            return 0;
	        }else if(nums.length==1){
	        	return nums[0];
	        }
	       
	        
	        int max = nums[0];
	        int sum = nums[0];
	        
	        for(int i=1;i<nums.length;i++){
	            if(nums[i]>0){
	                if(sum<=0){
	                    sum = nums[i];
	                }else{
	                    sum+= nums[i];
	                }
	            }else{
	                max = Math.max(Math.max(max,sum),nums[i]);
	                if(sum<=0){
	                    sum+=nums[i];
	                }else{
	                    sum += nums[i];
	                }
	            }
	               
	        }
	        
	        return Math.max(max,sum);
	    }
}
