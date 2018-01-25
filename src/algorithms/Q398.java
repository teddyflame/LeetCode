package algorithms;

import java.util.Arrays;
import java.util.Random;


public class Q398 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,2,3,3,3};
		Solution solution = new Solution(nums);
		
		System.out.println(solution.pick(3));
		System.out.println(solution.pick(3));
		System.out.println(solution.pick(3));
		System.out.println(solution.pick(3));
		System.out.println(solution.pick(3));
		System.out.println(solution.pick(3));
		System.out.println(solution.pick(3));
	}
	
	public static class Solution {

	    int[] in;
	    Random rnd;
	    public Solution(int[] nums) {
	        this.in = nums;
	        this.rnd = new Random();
	    }
	    
	    public int pick(int target) {
	        int result = -1;
	        int count = 0;
	        for (int i = 0; i < in.length; i++) {
	            if (in[i] != target)
	                continue;
	            if (rnd.nextInt(++count) == 0)
	                result = i;
	        }
	        
	        return result;
	    }
	}

}
