package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.ListModel;


public class Q401 {

	public static void main(String[] args) {
		List<String>  resultList = readBinaryWatch(1);
		
		for(int i=0;i<resultList.size();i++){
			System.out.println(resultList.get(i));
		}
	}
	
    public static List<String> readBinaryWatch(int num) {
    	int[] hours = {8,4,2,1};
    	int[] mins = {32,16,8,4,2,1};
        List<String> res = new ArrayList<>();
        if(num<=0 || num>8){
        	return res;
        }
        
        for(int i=0;i<=num;i++){
        	if(i>3){
        		break;
        	}
        	
        	List<Integer> hour = getDigit(hours,i);
        	List<Integer> min = getDigit(mins,num-i);
        	
        	for(int j=0;j<hour.size();j++){
        		for(int k=0;k<min.size();k++){
        			String tmp = hour.get(j) + ":" + (min.get(k)<10?"0"+min.get(k):min.get(k));
        			res.add(tmp);
        		}
        	}
        }
        
        return res;
    }

   
    private static List<Integer> getDigit(int[] nums, int count){
    	
    	List<Integer> res = new ArrayList<Integer>();
    	
    	getDigitHelper(nums,count,0,0,res);
    	
    	return res;
    }
    
    private static void getDigitHelper(int[] nums,int count,int pos,int sum,List<Integer> res){
    	if(count==0){
    		res.add(sum);
    		return;
    	}
    	
    	for(int i=pos;i<nums.length;i++){
    		getDigitHelper(nums, count-1, pos+1, sum+nums[i], res);
    	}
    }
    
    

}
