package algorithms;

import java.util.Arrays;

public class Q594 {

	public static void main(String[] args) {
		
		int[] nums = {1,3,2,2,5,2,3,7};
		
		System.out.println(findLHS(nums));

	}

	
	public static int findLHS(int[] nums) {
		if(nums==null|| nums.length==0){
			return 0;
		}else if(nums.length==1){
			return 1;
		}
        
        int maxLength = 0;
        Arrays.sort(nums);
        
        int startIndex = 0,changeIndex = -1;
        int start = nums[0];
        int now=nums[0];
        int nowIndex = 1;
        int count=1; 
        boolean endFlag = false;
        while(startIndex<nums.length){
            if(nums.length - startIndex<=maxLength || endFlag == true){
                break;
            }
            nowIndex = startIndex+1;
            boolean successFlag  =false;
            //起始位固定后向后找
            while(true){
            	if(nowIndex>=nums.length){
            		endFlag = true;
            		if(successFlag){
            			maxLength = Math.max(maxLength, count);
            		}
            		break;
            	}
            	
                if(nums[nowIndex]==start){
                    count++;
                    nowIndex++;
                }else if(nums[nowIndex]-start==1){
                	if(changeIndex==-1){
                		changeIndex = nowIndex;
                	}
                	successFlag = true;
                    now = nums[nowIndex];
                    count++;
                    nowIndex++;
                }else{
                	if(successFlag==true){
                		maxLength = Math.max(count,maxLength);
                	}
                    if(now!=start){
                    	startIndex = changeIndex; 	
                    }else{
                    	startIndex = nowIndex;
                    }
                    start = nums[startIndex];
                    now = start;
                    count=1;
                    changeIndex = -1;
                    break;
                }
            }
        }
        
        
        return maxLength;
        
    }
}
