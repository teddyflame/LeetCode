package algorithms;


public class Q437 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(5);
//		TreeNode node5 = new TreeNode(4);
//		TreeNode node6 = new TreeNode(6);
		
//		root.left = node1;
		root.right = node1;
		node1.right = node2;
		node2.right =node3;
		node3.right = node4;
		
		
		
		System.out.println(pathSum(root, 3));
	}
    static int count = 0;
    public static int pathSum(TreeNode root, int sum) {
        if(root==null){
            return 0;
        }
        
        searchPath(root,sum,0);
        
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        
        return count;
    }
    
    private static void searchPath(TreeNode node,int target,int sum){
        if(node==null){
            return;
        }
        
        if(node.val+sum == target){
            count++;
        }
        
        if(node.left!=null){
            searchPath(node.left,target,sum+node.val);
//            searchPath(node.left,target,0);
        }
        
        if(node.right!=null){
            searchPath(node.right,target,sum+node.val);
//            searchPath(node.right,target,0);
        }
        
    }
}
