package algorithms;

public class Q456 {

	public static void main(String[] args) {
		
		int[] nums = {6,8,7,8,9};
		System.out.println(find132pattern(nums));
		// TODO 自动生成的方法存根

	}
	
	
	public static boolean find132pattern(int[] nums) {
	    int n = nums.length, top = n, third = Integer.MIN_VALUE;

	    for (int i = n - 1; i >= 0; i--) {
	        if (nums[i] < third) return true;
	        while (top < n && nums[i] > nums[top]) third = nums[top++];
	        nums[--top] = nums[i];
	    }
	    
	    return false;
	}

}
