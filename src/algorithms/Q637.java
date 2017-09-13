package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Q637 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(5);
		TreeNode node3 = new TreeNode(0);
		TreeNode node4 = new TreeNode(2);
		TreeNode node5 = new TreeNode(4);
		TreeNode node6 = new TreeNode(6);
		
		root.left = node1;
		root.right = node2;
		
		node1.left = node3;
		node1.right = node4;
		
		node2.left = node5;
		node2.right = node6;
		
		List<Double> res = averageOfLevels(root);
		
		System.out.println("");

	}
	
	 static List<Double> list = new ArrayList<>();
	  static  List<Integer> countList = new ArrayList<>();

//	    int level = 0;
	    public static List<Double> averageOfLevels(TreeNode root) {
	        if(root==null){
	            return list;
	        }
	        
//	        level = 1;
	        
	        list.add((double) root.val);
	        countList.add(1);
	        
	        search(root.left,1);
	        search(root.right,1);
	        
	        return list;
	    }
	    
	    private static void search(TreeNode node,int level){

	        if(node==null){
	            return;
	        }
	        
	        if(list.size()<level+1){
	            list.add((double) node.val);
	            countList.add(1);
	        }else{
	            double sum = list.get(level);
	            int count = countList.get(level);
	            list.set(level, (sum*count+node.val)/(count+1));
	            countList.set(level, count+1);
	        }
	        search(node.left,level+1);
            search(node.right,level+1);
	        return;
	    }
}
