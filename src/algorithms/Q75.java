package algorithms;


public class Q75 {

	public static void main(String[] args) {

	}
	
	public void sortColors(int[] nums) {
        if(nums.length==0)return;
        
        int aIndex = 0;
        int bIndex = 0;
        int cIndex = nums.length-1;
        
        
        
        while(aIndex<cIndex){
        	if(bIndex<=aIndex){
        		bIndex =aIndex+1;
        	}
        	
        	while(true){
            	if(nums[bIndex]!=0){
            		bIndex++;
            	}else{
            		break;
            	}
            	
            	if(bIndex>=nums.length){
            		break;
            	}
            }
        	
        	if(nums[aIndex]==2){
        		swap(nums,aIndex,cIndex);
        		cIndex--;
        	}else if(nums[aIndex]==1){
        		if(bIndex>=nums.length){
        			aIndex++;
        		}else{
        			swap(nums,aIndex,bIndex);
        			aIndex++;
        			bIndex++;
        		}
        	}else{
        		aIndex++;
        	}
        }
    }
	
	private static void swap(int[] nums,int a,int b){
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = nums[a];
	}

}
