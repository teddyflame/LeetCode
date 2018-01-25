package algorithms;

import java.util.HashMap;

public class Q219 {

	public static void main(String[] args) {
//		int a = -1-2147483647;
//		int b = Math.abs(a);
//		System.out.println(b);
		
		int[] in={2147483647,-2147483647};


		System.out.println(containsNearbyAlmostDuplicate(in,1,2147483647));
	}
	
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(); 
        map.put(nums[0], 0);
        for(int i=1;i<nums.length;i++){
        	if(map.containsKey(nums[i])){
        		if(Math.abs(map.get(nums[i])-i)<=k){
        			return true;
        		}else{
        			map.replace(nums[i], i);
        		}
        	}else{
        		map.put(nums[i], i);
        	}
        }
        return false;
    }
	
	public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		 if(nums.length<=1) return false;
			for(int i=1;i<nums.length;i++){
				int j=i-k>0?i-k:0;
				while(j<i){
				    double res = Math.abs((double)nums[i] - (double)nums[j]);
				    
					if(res<=t){
						return true;
					}
					j++;
				}
			}
			return false;
    }

}
