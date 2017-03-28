package algorithms;

public class Q238 {

	public static void main(String[] args) {
		
		int[] in = {1,2,3,4};
		
		for(int i=0;i<in.length;i++){
			System.out.println(productExceptSelf(in)[i]);
		}

	}
	
	public static int[] productExceptSelf(int[] nums) {
	    int leng = nums.length;
	    int[] ret = new int[leng];
	    if(leng == 0)
	        return ret;
	    int runningprefix = 1;
	    for(int i = 0; i < leng; i++){
	        ret[i] = runningprefix;
	        runningprefix*= nums[i];
	    }
	    int runningsufix = 1;
	    for(int i = leng -1; i >= 0; i--){
	        ret[i] *= runningsufix;
	        runningsufix *= nums[i];
	    }
	    return ret;
	    
	}

}
