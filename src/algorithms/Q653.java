package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Q653 {

	public static void main(String[] args) {

		
		TreeNode rootNode = new TreeNode(5);
		TreeNode node1= new TreeNode(3);
		TreeNode node2= new TreeNode(6);
		TreeNode node3= new TreeNode(2);
		TreeNode node4= new TreeNode(4);
		TreeNode node5= new TreeNode(7);
		
		rootNode.left = node1;
		rootNode.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.right = node5;
		
		
		System.out.println(findTarget(rootNode, 4));
	}
	
	 static List<Integer> list = new ArrayList<>();
	    public static boolean findTarget(TreeNode root, int k) {
	        if(root==null)return false;
	        
	        addList(root,k);
	        
	        for(int i=0;i<list.size();i++){
	            if(list.contains(k-list.get(i)) && list.indexOf(k-list.get(i))!=i){
	                return true;
	            }
	        }

	        return false;
	    }
	    
	    private static void addList(TreeNode node,int k){
	        if(node==null)return;
	        
	        addList(node.left,k);
	        if(node.val>=k)return;
	        list.add(node.val);
	        addList(node.right,k);
	    }

}
