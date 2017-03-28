package algorithms;

import java.util.Arrays;

public class Q506 {

	public static void main(String[] args) {
		int[] in={1,3,5,4,2};
		
		String[] ouString = findRelativeRanks(in);
		
		for(int i=0;i<ouString.length;i++){
			System.out.println(ouString[i]);
		}
	}
	
	public static String[] findRelativeRanks(int[] nums) {

		int[] sortArray = Arrays.copyOf(nums,nums.length);
		Arrays.sort(sortArray);
        String[] outStrings = new String[nums.length];
		
        for(int i=0;i<nums.length;i++){
        	for(int j=0;j<nums.length;j++){
        		if(nums[i]==sortArray[j]){
        			int rank=nums.length-j;
        			if(rank==1){
        				outStrings[i] = "Gold Medal";
        			}else if(rank==2){
        				outStrings[i] = "Silver Medal";
        			}else if(rank==3){
        				outStrings[i] = "Bronze Medal";
        			}else{
        				outStrings[i] = Integer.toString(rank);
        			}
        		}
        	}
        }
        
        return outStrings;
    }

}
