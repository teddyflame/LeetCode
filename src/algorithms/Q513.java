package algorithms;

public class Q513 {
	int level;
	
	/**
	 * 目前的算法不对
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int findBottomLeftValue(TreeNode root) {
        
	
		level = 1;
		TreeNode res=null;
		if(root.left!=null){
			res =judge(root.left,level+1);
		}
		if(root.right!=null){
			res = judge(root.right, level+1);
		}
		
		if(res==null){
			res=root;
		}
		
		return res.val;
		
    }
	
	private TreeNode judge(TreeNode node,int floor){

		if(node.left!=null){
			return judge(node.left, floor+1);
		}else if(node.right!=null){
			return judge(node.right, floor+1);
		}else{
			if(floor<=level){
				return null;
			}else{
				level = floor;
				return node;
			}
		}		
	}

}
