package algorithms;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class Q74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		System.out.println(searchMatrix(matrix, 30));
		
		System.out.println("");
	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0)return false;
        if(matrix.length==1){
            return find(matrix[0],target);
        }

        int left = matrix[0][0];
        
        for(int i=1;i<matrix.length;i++){
            int right = matrix[i][0];
            
            if(target== left || target == right){
                return true;
            }else if(target<left){
                return false;
            }else if(target>right){
                left = right;
                continue;
            }else{
                return find(matrix[i-1],target);
            }
        }
        
        if(matrix[matrix.length-1][matrix[0].length-1]<target){
        	return false;
        }else{
        	return find(matrix[matrix.length-1],target);
        }
        
    }
    
    private static boolean find(int[] a,int target){
        for(int i=0;i<a.length;i++){
            if(a[i] == target)return true;
        }
        return false;
    }

}
