package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Q113 {
	static List<List<Integer>> res = new ArrayList<List<Integer>>();
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		TreeNode node1 = new TreeNode(4);
		TreeNode node2 = new TreeNode(8);
		
		TreeNode node3 = new TreeNode(11);
//		TreeNode node4 = new TreeNode(13);
		
		TreeNode node5 = new TreeNode(13);
		TreeNode node6 = new TreeNode(4);
		
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(2);
		TreeNode node9 = new TreeNode(5);
		TreeNode node10 = new TreeNode(1);
		
		root.left = node1;
		root.right = node2;
		
		node1.left = node3;
		//node1.right = node4;
		
		node2.left = node5;
		node2.right = node6;
		
		node3.left = node7;
		node3.right = node8;
		
		node6.left = node9;
		node6.right = node10;
		
		res = pathSum(root,22);
		
		System.out.println("");

	}
	
	public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root == null){
            return res;
        }
        
        List<Integer>  list = new ArrayList<>();
        searchPath(root,list,sum,0);
        
        return res;
    }

    private static void searchPath(TreeNode node,List<Integer> list, int target,int sum){
        if(node==null){
            return;
        }
        
        if(node.left==null && node.right==null){
            if(node.val+sum == target){
                // list.add(node.val);
                List<Integer> nextList = new ArrayList<>();
                nextList.addAll(list);
                nextList.add(node.val);
                res.add(nextList);
            }
        }else{     
             list.add(node.val);
            sum+=node.val;
            // List<Integer> nextList = new ArrayList<>();
            // nextList.addAll(list);
            
            searchPath(node.left,list,target,sum);
            searchPath(node.right,list,target,sum);
            list.remove(list.size()-1);
        }
        return;
    }

}
