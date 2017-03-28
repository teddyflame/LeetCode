package algorithms;

public class Q462 {

	public static void main(String[] args) {
		int[] in ={1,0,0,8,6};
		System.out.println(minMoves2(in));

	}
	
	public static int minMoves2(int[] nums) {
        
		int sum=0;
		int step=0;
		for(int i=0;i<nums.length;i++){
        	sum+=nums[i];
        }
        
        int ave = sum/nums.length;
        for(int i=0;i<nums.length;i++){
        	step+=Math.abs(nums[i]-ave);
        }
        
        return step;
        
    }

}
