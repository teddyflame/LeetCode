package algorithms;

import java.util.Arrays;

public class Q122 {

	public static void main(String[] args) {
		
		int[] in = {1,2};
		
		System.out.println(maxProfit(in));

	}
	
	public static int maxProfit(int[] prices) {
        if(prices==null || prices.length<2){
            return 0;
        }
        int startIndex = -1;
        int maxIndex = -1;
        int profit = 0;
        int min=0;
        int max=0;
        int finalProfit = 0;
        //找第一个低点
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                startIndex = i;
                min = prices[i];
                break;
            }
        }
        
        if(startIndex == -1){
            return 0;
        }
        
        for(int j=startIndex+1;j<prices.length-1;j++){
        	if(prices[j]>prices[j+1]){	//第一个高点
        		maxIndex = j;
        		max = prices[j];
        		break;
        	}
        }
        
        profit = max-min;
        if(maxIndex!=-1){
        	int[] remains = Arrays.copyOfRange(prices, maxIndex+1, prices.length);
            int remainProfit = maxProfit(remains);
            profit+=remainProfit;
        }
        
        //max = Math.max(max, profit);
        
        if(prices[prices.length-1]>min){
            finalProfit = prices[prices.length-1] - min;
//            max = Math.max(max,finalProfit);
        }
            
        return Math.max(profit, finalProfit);
    }

}
