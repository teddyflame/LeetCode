package algorithms;

import java.util.Arrays;


public class Q189 {

	public static void main(String[] args) {

		int[] in = {1,2,3,4,5,6};
		
		rotate(in,4);
		
		System.out.println(Arrays.toString(in));
	}
	
	
public static void rotate(int[] nums, int k) {
        
        if(nums.length<=1||nums==null)return;
        int pos = nums.length-(k%nums.length);
        int count=0;

        //int targetPos ;
        for(int i=0;i<k;i++){
            pos+=i;
            //targetPos = i;
            count+=move(nums,pos,i,k);
            if(count==k){
                break;
            }
        }
    }
    
    private static int move(int[] nums, int pos,int targetPos,int k){
     
        int start = pos;
        int count = 0;
        int moveNum = nums[pos];
        while(targetPos!=start){
            int tmp = nums[targetPos];
            nums[targetPos] = moveNum;
            moveNum = tmp;
            
            pos = targetPos;
            targetPos = (targetPos +k)%nums.length;
            count++;
        }
        return count;
    }
	public static void rotate3(int[] nums, int k) {
		for(int i=0;i<k;i++){
			int num = nums[0];
			for(int j=0;j<nums.length;j++){
				if(j!=nums.length-1){
					int tmp = nums[j+1];
					nums[j+1] = num;
					num = tmp;
				}else{
					nums[0] = num;
				}
			}
		}
	}
	
	public static void rotate2(int[] nums, int k) {
		String in = Arrays.toString(nums);
		in=in.replace("[", "");
		in=in.replace(",", "");
		in=in.replace(" ", "");
		in=in.replace("]", "");
		
		
		String last = in.substring(nums.length-k);
		String front = in.substring(0,nums.length-k);
		
		String out=last+front;
		for(int i=0;i<nums.length;i++){
			nums[i] = out.charAt(i)-48;
		}
	}

}
