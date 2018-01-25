package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Q670 {

	public static void main(String[] args) {

		System.out.println(maximumSwap(9973));
	}
	
public static int maximumSwap(int num) {
        
        if(num<12)return num;
        int maxNum = 0;
        int maxIndex = -1;        
        int swapIndex = -1;
        int res = 0;  
        List<Integer> list = new ArrayList<>();
        int num_copy = num;
        while(num_copy>0){
            int tmp = num_copy%10;
            
            if(tmp>maxNum){
                maxNum = tmp;
                maxIndex = list.size();
            }
            list.add(tmp);
            num_copy/=10;
        }
        
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)<maxNum && i>maxIndex){
                swapIndex = i;
                break;
            }
        }
        
        if(swapIndex==-1)return num;
        
        int exp = 0;
        for(int i=0;i<list.size();i++){
            if(i==swapIndex){
                res+= list.get(maxIndex) * Math.pow(10,exp);
            }else if(i==maxIndex){
                res+= list.get(swapIndex) * Math.pow(10,exp);
            }else{
                res+= list.get(i) * Math.pow(10,exp);
            }
            
            exp++;
        }
        
        return res;
        
    }

}
