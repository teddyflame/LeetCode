package algorithms;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.TreeSet;

public class Q15 {

	public static void main(String[] args) {
		
		int[] in = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
		List<List<Integer>> res =threeSum(in);
		
		
		System.out.println("");

	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
		if(nums==null || nums.length<=2) return null;
		
		List<List<Integer>> res = new ArrayList<List<Integer>>();
	
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
        		set.add(nums[i]);
        }

        Arrays.sort(nums);
        List<Integer> list_old = new ArrayList<>();
        
        for(int j=0;j<nums.length-2;j++){
        	for(int k=j+1;k<nums.length-1;k++){
        		for(int l=k+1;l<nums.length;l++){
        			if(nums[j]+nums[k]+nums[l]==0){
        				if(list_old.size() ==3
        						&& nums[j] == list_old.get(0)
        						&& nums[k] == list_old.get(1)
        						&& nums[l] == list_old.get(2)){
        					continue;
        				}else{
        					List<Integer> list = new ArrayList<>();
        					list.add(nums[j]);
        					list.add(nums[k]);
        					list.add(nums[l]);
        					
        					list_old.clear();
        					list_old.add(nums[j]);
        					list_old.add(nums[k]);
        					list_old.add(nums[l]);
        					res.add(list);
        				}
        			}
        		}
        		
        	}
        }
        
     
        return res;
    }

}
