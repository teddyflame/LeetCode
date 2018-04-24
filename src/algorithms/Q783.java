 package algorithms;


public class Q783 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	
	static int pre = Integer.MIN_VALUE;
	static int distance = Integer.MAX_VALUE;
	
	public static int minDiffInBST(TreeNode root) {
        
		search(root);
		return distance;
        
    }
	
	static void search(TreeNode root){
		if(root==null)return;
		
		search(root.left);
		if(pre!=Integer.MIN_VALUE && root.val-pre<distance){
			distance = root.val-pre;
		}
		pre = root.val;
		
		search(root.right);
	}

}
