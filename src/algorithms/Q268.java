package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q268 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	
	public static int missingNumber(int[] nums) {
		int sum=0;    
		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
		}
		
		return (1+nums.length)*nums.length/2-sum;
		
		
    }

}
