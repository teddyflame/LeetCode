package algorithms;

import java.util.Arrays;

public class Q769 {

	public static void main(String[] args) {

		int[] arr= {2,0,4,6,3,1,7,5,8};
		System.out.println(maxChunksToSorted(arr));
	}
	
	public static int maxChunksToSorted(int[] arr) {
        if(arr.length==0)return 0;
		if(arr.length==1)return 1;
        int min = Integer.MAX_VALUE;
        int minPos = -1;
        boolean flag = true;
        while(flag){        
        	for(int i=0;i<arr.length;i++) {
        		if(arr[i]<min) {
        			minPos = i;
        			min = arr[i];
        		}
        	}
        	flag = false;
        
        	int max = -1;
        	for(int i=0;i<minPos;i++) {
        		if(arr[i]>max)max = arr[i];
        	}
        
        	for(int i=arr.length-1;i>minPos;i--) {
        		if(arr[i]<max) {
        			minPos = i;
        			flag = true;
        			break;
        		}
        	}
        }
        return 1+maxChunksToSorted(Arrays.copyOfRange(arr,
        		minPos+1, arr.length));
    }

}
