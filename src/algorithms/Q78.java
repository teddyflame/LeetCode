package algorithms;

import java.util.ArrayList;
import java.util.List;


public class Q78 {

	public static void main(String[] args) {
		// TODO �Զ���ɵķ������

		int[] nums = {1,2,3};
		List<List<Integer>> abc = subsets(nums);
		
		System.out.println();
	}
	static List<List<Integer>> resList= new ArrayList<List<Integer>>();
	 public static List<List<Integer>> subsets(int[] nums) {
		 
		 List<Integer> data = new ArrayList<Integer>();
		 
		 for(int i=0;i<nums.length;i++){
			 data.add(nums[i]);
		 }
		 
		 for(int i=0;i<=nums.length;i++){
			 combinerSelect(data,new ArrayList<Integer>(),data.size(),i); 
		 }
		 
		 return resList;
	 }
	 
	 public static void combinerSelect(List<Integer> data, List<Integer> workSpace, int n, int k) {  
	        List<Integer> copyData;  
	        List<Integer> copyWorkSpace;  
	          
	        if(workSpace.size() == k) {  
	            resList.add(workSpace);
	        }  
	          
	        for(int i = 0; i < data.size(); i++) {  
	            copyData = new ArrayList<Integer>(data);  
	            copyWorkSpace = new ArrayList<Integer>(workSpace);  
	              
	            copyWorkSpace.add(copyData.get(i));  
	            for(int j = i; j >=  0; j--)  
	                copyData.remove(j);  
	            combinerSelect(copyData, copyWorkSpace, n, k);  
	        }  
	          
	    }  
		 
	 private  static void arrangeSelect(List<Integer> data,List<Integer> target, int k) {  
		        List<Integer> copyData;  
		        List<Integer> copyTarget;  
		        if(target.size() == k) {  
		        	resList.add(target);
		        }  
		      
		        for(int i=0; i<data.size(); i++) {  
		            copyData = new ArrayList<Integer>(data);  
		            copyTarget = new ArrayList<Integer>(target);  
		              
		            copyTarget.add(copyData.get(i));  
		            copyData.remove(i);  
		              
		            arrangeSelect(copyData, copyTarget,k);  
		        }  
		    
		  
	  }

}
