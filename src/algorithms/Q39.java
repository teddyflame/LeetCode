package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q39 {
	static List<List<Integer>> res = new ArrayList<List<Integer>>();
	static List<Integer> list = new ArrayList<>();

	
	public static void main(String[] args) {

		
		int[] in={1,2,3};
		List<List<Integer>> outList = combinationSum(in, 4);
		
		
		//System.out.println((outList.contains({1,2,5})));
		System.out.println(" ");
		
	}
	
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        
        findTarget(candidates, target,0);
        
        
        return res;
    }
	
	private static void findTarget(int[] candidates, int target,int index){
		if(target==0){
			ArrayList<Integer> tmpList = new ArrayList<>();
			tmpList.addAll(list);
			res.add(tmpList);
			return;
		}
		
		for(int i=index;i<candidates.length;i++){
			int newIndex = i;
			if(candidates[i]<=target){
				list.add(candidates[i]);
				findTarget(candidates, target-candidates[i],newIndex);
				list.remove(list.size()-1);
			}
		}
	}

}
