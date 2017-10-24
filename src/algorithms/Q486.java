package algorithms;

import java.util.Arrays;

public class Q486 {

	public static void main(String[] args) {

		System.out.println(PredictTheWinner(new int[] {2,4,55,6,8}));
	}
	
	public static boolean PredictTheWinner(int[] nums) {
        int[] score = new int[2];
        return choose(score,nums,0);
    }
    
    private static boolean choose(int[] scoreIn,int[] nums,int side){
        int[] score = scoreIn.clone();
        int[] in = nums.clone();
        if(nums.length==1){
            score[side]+=in[0];
            if(score[0]>=score[1])return true;
            return false;
        }else if(nums.length==2){
            if(in[0]>=in[1]){
                score[side]+=in[0];
                score[Math.abs(side-1)]+=in[1];
            }else{
                score[side]+=in[1];
                score[Math.abs(side-1)]+=in[0];
            }
            if(score[0]>=score[1])return true;
            return false;
        }else{
            score[side]+=in[0];
            boolean res1 = choose(score,Arrays.copyOfRange(in,1,in.length),Math.abs(side-1));
            score[side]+=(in[in.length-1]-in[0]);
            boolean res2 = choose(score,Arrays.copyOfRange(in,0,in.length-1),Math.abs(side-1));
            return res1|res2;
        }
        
    }

}
