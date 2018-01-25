package algorithms;

import java.util.Arrays;

public class Q561 {

	public static void main(String[] args) {

		int[] nums = {4,1,2,3};
		int out = arrayPairSum(nums);
		System.out.println(out);
	}
	
	 public static int arrayPairSum(int[] nums) {
	        Arrays.sort(nums);
	        int sum=0;
	        for(int i=0;i<nums.length;i=i+2){
	        	sum+=nums[i];
	        }
	        
	        return sum;
	    }

}
