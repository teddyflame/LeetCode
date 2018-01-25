package algorithms;

public class Q572 {

	public static void main(String[] args) {

		TreeNode s =new TreeNode(1);
		TreeNode tmp = new TreeNode(1);
		s.left = tmp;
		
		TreeNode t = new TreeNode(1);
		
		System.out.println(isSubtree(s, t));
	}

	
public static boolean isSubtree(TreeNode s, TreeNode t) {
        
        if(s.val==t.val && isEqual(s.left,t.left) && isEqual(s.right,t.right)){//S T ПаµИ
            return true;
        }else{
            boolean leftMatch = false;
            boolean rightMatch = false;
            if(s.left==null && s.right==null){
                return false;
            }
            if(s.left!=null){
                leftMatch = isSubtree(s.left,t);
            } 
            if(s.right!=null){
                rightMatch = isSubtree(s.right,t);
            }
            
            return (leftMatch | rightMatch);
        }
    }
    
    private static boolean isEqual(TreeNode a, TreeNode b){
        if(a==null && b== null){
            return true;
        }else if(a==null){
            return false;
        }else if(b==null){
            return false;
        }else{
            if(a.val == b.val && isEqual(a.left,b.left) && isEqual(a.right,b.right)){
                return true;
            }else{
                return false;
            }
        }
    }
}
