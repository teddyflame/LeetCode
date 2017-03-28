package algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q347 {

	public static void main(String[] args) {
		int[] in ={1,1,1,2,2,3};
		
		List<Integer> out = topKFrequent(in, 2);
		
		for(int i: out){
			System.out.println(out.get(i));
		}

	}
	
	public static List<Integer> topKFrequent(int[] nums, int k) {

		List<Integer>[] bucket = new List[nums.length + 1];
		Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

		for (int n : nums) {
			frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
		}

		for (int key : frequencyMap.keySet()) {
			int frequency = frequencyMap.get(key);
			if (bucket[frequency] == null) {
				bucket[frequency] = new ArrayList<>();
			}
			bucket[frequency].add(key);
		}

		List<Integer> res = new ArrayList<>();

		for (int pos = bucket.length - 1; pos >= 0 && res.size() < k; pos--) {
			if (bucket[pos] != null) {
				res.addAll(bucket[pos]);
			}
		}
		return res;
	}

}
