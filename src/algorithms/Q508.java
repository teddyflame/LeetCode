package algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import com.sun.javafx.collections.MappingChange.Map;

public class Q508 {

	static HashMap<Integer, Integer> map = new HashMap<>();
	static int maxCount = 1;
	public static void main(String[] args) {

	

	}
	
	public int[] findFrequentTreeSum(TreeNode root) {
        if(root==null){
        	return new int[0];
        }
        
        judge(root);
        
        List<Integer> resList = new ArrayList<Integer>();
        
        Iterator<java.util.Map.Entry<Integer, Integer>> 
        	iter = map.entrySet().iterator();
        while(iter.hasNext()){
        	java.util.Map.Entry<Integer, Integer> 
        		entry = iter.next();
        	if(entry.getValue()==maxCount){
        		resList.add(entry.getKey());
        	}
        }
        
        int[] res = new int[resList.size()];
        for(int i=0;i<resList.size();i++){
        	res[i] = resList.get(i);
        }
        
        return res;
    }
	
	private static int countSum(TreeNode node){
		if(node==null){
			return 0;
		}
		
		int val = node.val;
		val+=countSum(node.left);
		val+=countSum(node.right);
		return val;
	}
	
	private static void judge(TreeNode node){
		if(node==null){
			return;
		}
		
		int nodeSum = countSum(node);
		if(map.containsKey(nodeSum)){
			int newCount = map.get(nodeSum)+1;
			if(newCount>maxCount){
				maxCount = newCount;
			}
			map.replace(nodeSum,newCount);
		}else{
			map.put(nodeSum, 1);
		}
		
		judge(node.left);
		judge(node.right);
	}

}
