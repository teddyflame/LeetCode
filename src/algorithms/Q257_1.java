package algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目的反向
 * 题目要求给出根-叶子的字符串
 * 这解是给出叶子->根的字符串
 * @author XRR
 *
 */
public class Q257_1 {

	
	List<String> list = new ArrayList();
	public static void main(String[] args) {

	}
	
	public List<String> binaryTreePaths(TreeNode root) {
        if(root==null){
            return list;
        }
        if(root.left!=null){
            addString(root.left);
        }
        if(root.right!=null){
            addString(root.right);
        }
        
        for(int i=0;i<list.size();i++){
            String tmp = list.get(i);
            tmp = tmp + "->" + root.val ;
            list.set(i,tmp);
        }
        
        return list;
    }
    
    private int addString(TreeNode node){
        int count=0;
        if(node.left==null && node.right==null){
            list.add(Integer.toString(node.val));
            count++;
            return count;
        }
        
        if(node.left!=null){
            count+=addString(node.left);
        }
        
        if(node.right!=null){
            count+=addString(node.right);
        }
        int index = list.size()-1;
        for(int i=0;i<count;i++){
            String tmp = list.get(index);
            tmp = tmp + "->" + node.val;
            list.set(index,tmp);
            index--;
        }
        
        return count;
    }

}
