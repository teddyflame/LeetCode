package algorithms;

import java.util.Arrays;

public class Q34 {

	public static void main(String[] args) {
		
		int a[] = {0,0,0,1,2,3};
		
		int b[] = searchRange(a, 0);
		System.out.println(" ");
	}
	
	private static int offset = 0;
	
	public static int[] searchRange(int[] nums, int target) {
        
        if(nums.length==0 || nums[0]>target || nums[nums.length-1]<target){
            return new int[]{-1,-1};
        }
        if(nums.length==1){
        	if(nums[0]==target){
        		return new int[]{0+offset,0+offset};
        	}else{
        		return new int[]{-1,-1};
        	}
        }

        int start_index = -1;
        int end_index = -1;
        int index = nums.length/2;
        
        if(nums[index]<target){
            int[] newNum = Arrays.copyOfRange(nums, index+1, nums.length);
            offset+=index+1;
            return searchRange(newNum, target);
        }else if(nums[index]>target){
        	int[] newNum = Arrays.copyOfRange(nums, 0, index);
        	//offset-=index-1;
        	return searchRange(newNum, target);
        }else{
        	start_index = index;
        	end_index = index;
        	int[] leftNums = Arrays.copyOfRange(nums, 0, index);
        	int[] rightNums = Arrays.copyOfRange(nums, index+1, nums.length);
        	int leftRes = findIndex(leftNums, target, 0);
        	int rightRes = findIndex(rightNums, target, 1);
        	start_index = leftRes==-1?index:index-leftRes;
        	end_index = rightRes==-1?index:index+rightRes+1;
        	return new int[]{start_index+offset,end_index+offset};
        }
        
    
    }
	
	private static int findIndex(int[] in,int target,int mode){
		if(mode==0){
			for(int i=0;i<in.length;i++){
				if(in[i] ==  target){
					return in.length-i;
				}
			}
			return -1;
		}else{
			for(int j=in.length-1;j>=0;j--){
				if(in[j]==target){
					return j;
				}
			}
			return -1;
		}
	}
}
