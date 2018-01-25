package algorithms;

import java.util.Arrays;

public class Q121 {

	public static void main(String[] args) {
		int[] a = {2,1,2,1,0,1,2};
		
		System.out.println(maxProfit(a));
	}
	
	public static int maxProfit(int[] prices) {
        if(prices==null || prices.length==0){
            return 0;        
        }
        int profit = 0;
        int start=-1;
        int end = -1;
        int min=0,max=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                start = i;
                min = prices[i];
                end = i+1;
                max = prices[i+1];
                break;
            }
        }
        
        if(start == -1){
            return 0;
        }
        
        for(int j=start+2;j<prices.length;j++){
            if(prices[j]>max){
                end = j;
                max = prices[j];
            }                            
        }
        
        for(int k=start+2;k<end;k++){
            if(prices[k]<min){
                min=prices[k];
            }
        }
        
        
        if(end ==-1){
        	return max-min;
        }else{
        	profit = max-min;
        	int[] remain = Arrays.copyOfRange(prices,end+1,prices.length);
            
            int remain_profit = maxProfit(remain);
            
            return Math.max(profit,remain_profit);
        }
        
        
    }

}
