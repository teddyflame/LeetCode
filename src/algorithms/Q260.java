package algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;


public class Q260 {

	public static void main(String[] args) {
		
	}
	
public static int[] singleNumber(int[] nums) {
    HashSet<Integer> set = new HashSet<>();    
	for(int i=0;i<nums.length;i++){
        	 if(set.contains(nums[i])){
        		 set.remove(nums[i]);
        	 }else{
        		 set.add(nums[i]);
        	 }
        }
	
	int[] result = new int[2];
	Iterator<Integer> iter = set.iterator();
	result[0] = iter.next();
	result[1] = iter.next();
	return result;
}

	

}
