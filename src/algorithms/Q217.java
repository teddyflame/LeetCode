package algorithms;

import java.util.HashSet;

public class Q217 {

	public static void main(String[] args) {

		
		
	}
	
	public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
        	if(set.contains(nums[i])){
        		return false;
        	}else{
        		set.add(nums[i]);
        	}
        }
        
        return true;
    }

}
