package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


import tools.PublicTools;

public class Q515 {
	//static List<Integer> res = new ArrayList<Integer>();
	
	public static void main(String[] args) {

		
		TreeNode root = new TreeNode(1);
		
		TreeNode node3 = new TreeNode(3);
		TreeNode node2 = new TreeNode(2);
		TreeNode node5 = new TreeNode(5);
		TreeNode node4 = new TreeNode(4);
		TreeNode node9 = new TreeNode(9);
		
		root.left = node3;
		root.right = node2;
		
		node3.left = node5;
		node3.right = node4;
		node2.right = node9;
		
		List<Integer> result = largestValues(root);
		
		PublicTools.PrintIntList(result);

	}
	public static List<Integer> largestValues(TreeNode root) {
		
		List<Integer> res = new ArrayList<Integer>();
		if(root==null){
			return res;
		}
		
		res.add(root.val);

		Queue<TreeNode> queue = new LinkedList<>();
		Queue<TreeNode> nextQueue = new LinkedList<>();
		
		queue.offer(root);
		if(root.left!=null){
			nextQueue.offer(root.left);
		}
		if(root.right!=null){
			nextQueue.offer(root.right);
		}
		
		while(!nextQueue.isEmpty()){
			int max = Integer.MIN_VALUE;
			queue = nextQueue;
			nextQueue = new LinkedList<>();
			while(!queue.isEmpty()){
				TreeNode tmp=queue.poll();
				if(tmp.val>max){
					max = tmp.val;
				}
				
				if(tmp.left!=null){
					nextQueue.offer(tmp.left);
				}
				if(tmp.right!=null){
					nextQueue.offer(tmp.right);
				}
			}
			
			res.add(max);
		}
		
		return res;
	
    }
	
}
