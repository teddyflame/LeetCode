package algorithms;

import java.util.List;

public class Q235 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		
		TreeNode node1 = new TreeNode(3);
		TreeNode node2 = new TreeNode(6);
		
		TreeNode node3 = new TreeNode(2);
		TreeNode node4 = new TreeNode(4);
		
		TreeNode node5 = new TreeNode(1);
		
		root.left = node1;
		root.right = node2;
		
		node1.left = node3;
		node1.right = node4;
		
		node4.left = node5;
		
		TreeNode p = new TreeNode(1);
		TreeNode q = new TreeNode(4);
		
		TreeNode nodeRes = lowestCommonAncestor(root, p, q);
		
		System.out.println("");
	}
	
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        
        TreeNode res =null;
        if((root.val>p.val && root.val<q.val) || (root.val<p.val && root.val>q.val) || root.val==p.val || root.val ==q.val){
            return root;
        }else if(root.val>p.val && root.val > q.val){
            res = lowestCommonAncestor(root.left,p,q);
        }else{
            res = lowestCommonAncestor(root.right,p,q);
        }
        
        return res;
    }

}
