package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q46 {
	static List<List<Integer>> res = new ArrayList<List<Integer>>();
	static List<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		int[] nums ={1,2,3};
		permute(nums);
		
		System.out.println("");

	}
	
	public static List<List<Integer>> permute(int[] nums) {
        arrange(nums);
        return res;
    }
	
	private static void arrange(int[] nums){
		if(nums.length==0){
			List<Integer> tmpList = new ArrayList<>();
			tmpList.addAll(list);
			res.add(tmpList);
		}
		
		for(int i=0;i<nums.length;i++){
			list.add(nums[i]);
			int[] nextNum = new int[nums.length-1];
			int index = 0;
			for(int j=0;j<nums.length;j++){
				if(j!=i){
					nextNum[index++] = nums[j];
				}		
			}	
			arrange(nextNum);
			list.remove(list.size()-1);
		}
	}

}
