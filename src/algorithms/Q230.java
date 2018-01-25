package algorithms;

public class Q230 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode rootNode = new TreeNode(2);
		TreeNode node1 = new TreeNode(1);
		rootNode.left = node1;
		
		System.out.println(kthSmallest(rootNode, 1));
	}
	
	static int res;
	static int count = 0;
    public static int kthSmallest(TreeNode root, int k) {
        
    	count =0;
        search(root,k);
        
        return res;
    }
    
    private static void search(TreeNode node,int k){
        if(node==null)return;
        
        
        search(node.left,k);
        count++;
        if(count==k) res = node.val;
        search(node.right,k);
    }

}
