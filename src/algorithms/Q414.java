package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Q414 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] in = {2,2,3,1,5};
		System.out.println(thirdMax(in));
	}
	
	 public static int thirdMax(int[] nums) {
	        
	        if(nums.length==0){
	            return 0;
	        }
	        List<Integer> list = new ArrayList<>();
	        int index=0;
	        for(int i=0;i<nums.length;i++){
	            setNum(list, nums[i]);
	        }
	        
	        return (list.size()==3?list.get(2):list.get(0));
	    }
	    
	    private static void setNum(List<Integer> list,int num){
	        int index = 0;
	        while(index<3){
	            if(list.size()<=index){
	                list.add(num);
	                break;
	            }else{
	                int tmp = list.get(index);
	                if(num==tmp){
	                    break;
	                }else if(num<tmp){
	                    index++;
	                    continue;
	                }else{
	                    list.set(index, num);
	                    setNum(list, tmp);
	                }
	            }
	        }
	    }

}
