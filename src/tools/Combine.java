package tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combine {
	
	 public static void main(String[] args) {  
		// List<List<Integer>> res =new  ArrayList<List<Integer>>();
		 Combine combine = new Combine();
		 int[] nums={1,2,3,4};
	        List<List<Integer>> resList = combine.subsets(nums); 
	        
	        System.out.println();
	    }  
	      
	    /** 
	     * ���裺��ÿ�εݹ�ʱ����ԭʼ���ݺ����������Ĺ����ռ临��һ�ݣ����еĲ������ڸ����ļ��н��У�Ŀ�ľ��Ǳ�֤���ƻ�ԭʼ���ݣ� 
	     *      �Ӷ�������һ�ֵݹ�������������������һ�֡� 
	     *      ��Σ������ݵĵ�һ��Ԫ����ӵ������ռ��У��жϹ����ռ�Ĵ�С�����С��k,����Ҫ�����ݹ飬����ʱ������ݹ麯���� 
	     *      ������Ҫע�⣺���赱ǰ����Ľڵ���±���i,��Ϊ��˳������,����i֮ǰ���������ݶ�Ӧ����ȥ��ֻ����i֮���δʹ�ù������ݡ� 
	     *      ����ڴ���֮ǰ��Ӧ�ö�copydata���Դ���������k��ʱ��������Ѿ��ҵ����������ĵ�һ�������Ȼ��ֻ���޸ĸ���������һ��������ɡ� 
	     *      �磺�ҵ�abcʱ����ֻ���滻cΪd������ɸ��ֵݹ顣 
	     *  
	     * @param data  ԭʼ���� 
	     * @param workSpace �Զ���һ����ʱ�ռ䣬�����洢ÿ�η���������ֵ 
	     * @param k     C(n,k)�е�k 
	     */  
	    public <E> void combinerSelect(List<E> data, List<E> workSpace, int n, int k) {  
	        List<E> copyData;  
	        List<E> copyWorkSpace;  
	          
	        if(workSpace.size() == k) {  
	            for(Object c : workSpace)  
	                System.out.print(c);  
	            System.out.println();  
	        }  
	          
	        for(int i = 0; i < data.size(); i++) {  
	            copyData = new ArrayList<E>(data);  
	            copyWorkSpace = new ArrayList<E>(workSpace);  
	              
	            copyWorkSpace.add(copyData.get(i));  
	            for(int j = i; j >=  0; j--)  
	                copyData.remove(j);  
	            combinerSelect(copyData, copyWorkSpace, n, k);  
	        }  
	          
	    }  
	    
	    
	    public List<List<Integer>> subsets(int[] nums) {
	        List<List<Integer>> list = new ArrayList<>();
	        Arrays.sort(nums);
	        backtrack(list, new ArrayList<>(), nums, 0);
	        return list;
	    }

	    private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
	        list.add(new ArrayList<>(tempList));
	        for(int i = start; i < nums.length; i++){
	            tempList.add(nums[i]);
	            backtrack(list, tempList, nums, i + 1);
	            tempList.remove(tempList.size() - 1);
	        }
	    }
	      

}
