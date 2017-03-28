package algorithms;

public class Q283 {

	public static void main(String[] args) {

		int[] a = {1};
		moveZeroes(a);
		
		for(int j=0;j<a.length;j++){
			System.out.println(a[j]);
		}
	}
	
	public static void moveZeroes(int[] nums) {
        int index_zero=0;
        for(int i=0;i<nums.length;i++){
        	while(index_zero<nums.length
        			&& nums[index_zero]!=0){
        		index_zero++;
        	}
        	
        	if(nums[i]!=0 && i>index_zero){
        		int tmp=nums[i];
        		nums[i] = 0;
        		nums[index_zero] = tmp;
        	}
        }
    }

}
