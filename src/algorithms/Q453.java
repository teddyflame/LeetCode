package algorithms;

import java.util.Arrays;

public class Q453 {

	public static void main(String[] args) {

		int[] nums = {1,7,7,9};
		System.out.println(minMoves(nums));
	}
	
public static int minMoves(int[] nums) {
        
        if(nums==null || nums.length==0)return 0;
        Arrays.sort(nums);
        
        int count=0;
        while(nums[0]!=nums[nums.length-1]){
            int cha = nums[nums.length-1] - nums[0];
            
            count+= cha;
            
            for(int i=0;i<nums.length-1;i++){
                nums[i]+=cha;
            }
            
            for(int i=nums.length-2;i>0;i--){
                if(nums[i]>nums[nums.length-1]){
                    int tmp = nums[i];
                    nums[i] = nums[nums.length-1];
                    nums[nums.length-1] = tmp;
                    break;
                }
            }
        }
        
        return count;
              }

}
