package algorithms;

import java.util.Arrays;

public class Q309 {

	public static void main(String[] args) {
		int[] in = {2,4,1,7};
		
		System.out.println(maxProfit(in));
	}
	
	
    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length<2){
            return 0;
        }
        int maximum = 0;
        int lowIndex = -1,highIndex=-1;
        int low = 0,high=0;
        int profit = 0;
        //找第一个低点
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                low = prices[i];
                lowIndex = i;
                break;
            }
        }
        //如果没有低点，返回0
        if(lowIndex==-1){
        	return 0;
        }
        
        //判断每个高点
        for(int j=lowIndex+1;j<prices.length;j++){
            if(prices[j]>low){
                high = prices[j];
                profit = high - low;
                highIndex = j;
                
                
                //后续不足以再做交易
                if(j>=prices.length-3){
                	//maximum = Math.max(profit,maximum);
                    int finalProfit = Math.max((prices[prices.length-1]  -low),(prices[prices.length-2]  -low));
                    
                    profit = Math.max(finalProfit, profit);
                    maximum = Math.max(profit,maximum);
                    break;
                }
                
                int remainProfit = maxProfit(Arrays.copyOfRange(prices,j+2,prices.length));
                
                profit+= remainProfit;
                
                maximum = Math.max(profit,maximum); 
            }
        }
        if(highIndex!=-1){
        	int finalProfit = Math.max((prices[prices.length-1]  -low),(prices[prices.length-2]  -low));
        	maximum =Math.max(finalProfit, maximum);
        }
        
        
        return maximum;
    }

}
